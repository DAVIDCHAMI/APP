package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvanceCuentasInscritas;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;

public class AvanceTarjetasCreditoCuentasInscritasStepDefinition {

  @Y("^el (.*) a una cuenta inscrita$")
  public void elEnviaDineroAUnaCuentaInscrita(String tipoAvance, List<Map<String, String>> datos) {
    theActorInTheSpotlight()
        .attemptsTo(
            RealizarAvanceCuentasInscritas.deTarjetasCredito(
                tipoAvance, tarjetaCredito().conDatosDeTarjeta(datos)));
  }
}
