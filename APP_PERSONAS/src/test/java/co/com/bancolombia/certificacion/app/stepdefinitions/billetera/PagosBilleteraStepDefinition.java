package co.com.bancolombia.certificacion.app.stepdefinitions.billetera;

import co.com.bancolombia.certificacion.app.exceptions.billetera.NoSeRealizoPagoQrEstaticoBilleteraException;
import co.com.bancolombia.certificacion.app.questions.billetera.PagoExitoso;
import co.com.bancolombia.certificacion.app.tasks.billetera.*;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.billetera.NoSeRealizoPagoQrEstaticoBilleteraException.MENSAJE_PAGO_NO_REALIZADO_EXCEPTION;
import static co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder.informacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagosBilleteraStepDefinition {

    @Cuando("^el actor ingresa a (.*) para realizar el registro$")
    public void actorIngresaBilleteraParaRegistrarse(String tipoTransaccion) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                RegistrarBilletera.enApp()
        );
    }

    @Y("^realiza una compra con QR estatico$")
    public void realizaActivacionBilletera(List<Map<String, String>> informacionBilletera) {
        theActorInTheSpotlight().attemptsTo(
                LeerQR.estatico(informacion().dePagoBilletera(informacionBilletera)),
                PrepararPagoConBilletera.conQrEstatico(informacion().dePagoBilletera(informacionBilletera)),
                RealizarPago.conBilletera()
        );
    }

    @Y("^realiza una compra con QR estatico cambiando el valor del pago inicial$")
    public void realizaCompraBilleteraCambiandoValores(List<Map<String, String>> informacionBilletera) {
        theActorInTheSpotlight().attemptsTo(
                LeerQR.estatico(informacion().dePagoBilletera(informacionBilletera)),
                PrepararPagoConBilletera.conQrEstatico(informacion().dePagoBilletera(informacionBilletera)),
                Cambiar.valorPagarQrEstatico(informacion()
                        .conValor(informacionBilletera)
                        .conPropina(informacionBilletera)
                ),
                RealizarPago.conBilletera()
        );
    }

    @Y("^realiza una compra con QR estatico cambiando la tarjeta$")
    public void realizaCompraBilleteraCambiandoTarjeta(List<Map<String, String>> informacionBilletera) {
        theActorInTheSpotlight().attemptsTo(
                LeerQR.estatico(informacion().dePagoBilletera(informacionBilletera)),
                PrepararPagoConBilletera.conQrEstatico(informacion().dePagoBilletera(informacionBilletera)),
                Cambiar.tarjetaEnBIlleteraParaPago(informacion()
                        .conDatosTarjeta(informacionBilletera)
                ),
                RealizarPago.conBilletera()
        );
    }

    @Entonces("^El deberia ver el mensaje de que su pago fue exitoso$")
    public void deberiaDeVerMensajePagoBilleteraExitoso() {
        theActorInTheSpotlight().should(seeThat(
                PagoExitoso.realizadoConBilletera()).orComplainWith(
                NoSeRealizoPagoQrEstaticoBilleteraException.class, MENSAJE_PAGO_NO_REALIZADO_EXCEPTION)
        );
    }
}