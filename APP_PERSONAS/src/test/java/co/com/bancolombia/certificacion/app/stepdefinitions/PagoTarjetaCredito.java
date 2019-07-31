package co.com.bancolombia.certificacion.app.stepdefinitions;

import co.com.bancolombia.certificacion.app.tasks.tarjetacredito.Pagar;
import cucumber.api.java.es.Cuando;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoTarjetaCredito {

    @Cuando("^quiere pagar la tarjeta de crédito no propia$")
    public void pagoTarjetaCreditoNoPropia(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                Pagar.tarjetaCreditoNoPropia(tarjetaCredito().conNumeroTarjeta(datos).conTipoPago(datos).conValor(datos), elProducto().conProductoDebitar(datos))
        );
    }
}
