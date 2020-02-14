package co.com.bancolombia.certificacion.app.stepdefinitions.billetera;

import co.com.bancolombia.certificacion.app.exceptions.billetera.NoSeActivoBilleteraException;
import co.com.bancolombia.certificacion.app.interactions.billetera.SeleccionarPago;
import co.com.bancolombia.certificacion.app.questions.billetera.ActivacionBilletera;
import co.com.bancolombia.certificacion.app.tasks.billetera.RealizarPago;
import co.com.bancolombia.certificacion.app.tasks.billetera.RegistrarBilletera;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.billetera.NoSeActivoBilleteraException.MENSAJE_BILLETERA_NO_ACTIVADA;
import static co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder.informacion;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagosBilleteraStepDefinition {

    @Cuando("^el actor ingresa a (.*) para realizar el registro$")
    public void actorIngresaBilleteraParaRegistrarse(String tipoTransaccion) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                RegistrarBilletera.enApp(),
                SeleccionarPago.conBilletera()
        );
    }

    @Y("^realiza una compra con QR estatico$")
    public void realizaActivacionBilletera(List<Map<String, String>> informacionBilletera) {
        theActorInTheSpotlight().attemptsTo(
                RealizarPago.conCodigoQrEstatico(informacion().dePagoBilletera(informacionBilletera))
        );
    }

    @Entonces("^El deberia ver el mensaje de que su pago fue exitoso$")
    public void deberiaVerActivacionBilleteraExitoso() {
        theActorInTheSpotlight().should(seeThat(
                ActivacionBilletera.esExitosa()).orComplainWith(
                NoSeActivoBilleteraException.class, MENSAJE_BILLETERA_NO_ACTIVADA)
        );
    }
}