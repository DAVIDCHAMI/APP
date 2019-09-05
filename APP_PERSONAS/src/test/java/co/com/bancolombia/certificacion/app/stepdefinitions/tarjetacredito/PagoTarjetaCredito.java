package co.com.bancolombia.certificacion.app.stepdefinitions.tarjetacredito;

import co.com.bancolombia.certificacion.app.questions.tarjetacredito.VerificarPago;
import co.com.bancolombia.certificacion.app.tasks.tarjetacredito.Pagar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoTarjetaCredito {

    @Cuando("^quiere pagar la tarjeta de crédito no propia$")
    public void pagoTarjetaCreditoNoPropia(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                Pagar.tarjetaCreditoNoPropia(tarjetaCredito().conTarjeta(datos).conTipoPago(datos).conMoneda(datos).conValor(datos), elProducto().conProductoDebitar(datos))
        );
    }

    @Cuando("^quiere pagar la tarjeta de crédito propia$")
    public void pagoTarjetaCreditoPropia(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                Pagar.tarjetaCreditoPropia(tarjetaCredito().conTarjeta(datos).conTipoPago(datos).conMoneda(datos).conValor(datos), elProducto().conProductoDebitar(datos))
        );
    }

    @Entonces("^deberia de ver el mensaje de confirmación y la información de su pago$")
    public void verMensajeConfirmacionInformacionPago() {
        theActorInTheSpotlight().should(
                seeThat(VerificarPago.exitoso())
        );
    }
}
