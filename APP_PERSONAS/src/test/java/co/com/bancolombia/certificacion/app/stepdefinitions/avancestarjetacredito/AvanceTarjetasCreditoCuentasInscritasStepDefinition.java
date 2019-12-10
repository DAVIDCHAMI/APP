package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.HacerAvanceCuentasInscritas;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;

public class AvanceTarjetasCreditoCuentasInscritasStepDefinition {

    @Y("^el (.*) a una cuenta inscrita$")
    public void elEnviaDineroAUnaCuentaInscrita(String tipoAvance, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                HacerAvanceCuentasInscritas.deTarjetasCredito(tipoAvance,tarjetaCredito().conDatosDeTarjeta(datos))
        );
    }
}