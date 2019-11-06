package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvances;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AvancesTarjetasCreditoStepDefinition
{
    @Cuando("^el (.*) de su tarjeta de credito$")
    public void seleccionaLaTarjetaDeCredito(String tipoAvance, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                RealizarAvances.deTarjetasCredito(tarjetaCredito()
                        .conDatosDeTarjeta(datos), tipoAvance
                )
        );
    }

    @Y("^el (.*) desde su tarjeta de credito$")
    public void ingresaALaOpcionTarjetaDeCredito(String tipoAvance, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                RealizarAvances.deTarjetasCredito(tarjetaCredito()
                        .conDatosDeTarjeta(datos), tipoAvance
                )
        );
    }
}
