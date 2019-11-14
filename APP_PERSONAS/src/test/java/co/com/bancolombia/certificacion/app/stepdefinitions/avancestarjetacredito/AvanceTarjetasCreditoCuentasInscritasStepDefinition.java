package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;
import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvances;
import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvancesCuentasInscritasProductoDestino;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
public class AvanceTarjetasCreditoCuentasInscritasStepDefinition {

    @Y("^el (.*) a una cuenta inscrita$")
    public void elEnviaDineroAUnaCuentaInscrita(String tipoAvance, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(RealizarAvances.deTarjetasCredito(tarjetaCredito()
        .conDatosDeTarjeta(datos), tipoAvance));
        theActorInTheSpotlight().attemptsTo(RealizarAvancesCuentasInscritasProductoDestino
        .deTarjetasCreditoProductoDestino(tarjetaCredito().conDatosDeTarjeta(datos), tipoAvance));
    }
}
