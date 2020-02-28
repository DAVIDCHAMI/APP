package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import static co.com.bancolombia.certificacion.app.exceptions.avancetarjetacredito.AvanceNoExitoso.MENSAJE_AVANCE_NO_EXITOSO;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static co.com.bancolombia.certificacion.app.questions.avancetarjetacredito.AvanceNoExitoso.validarAvanceNoExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.app.exceptions.avancetarjetacredito.AvanceNoExitoso;
import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvanceNoExitoso;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;

public class AvanceTarjetasCreditoNoExitosoStepDefinition {

  @Cuando("^el (.*) desde su tarjeta de credito con monto sobrecupo$")
  public void elEnviaDineroDesdeSuTarjetaDeCreditoConMontoSobrecupo(
      String tipoAvance, List<Map<String, String>> datos) {
    theActorInTheSpotlight()
        .attemptsTo(
            RealizarAvanceNoExitoso.deTarjetasCredito(
                tarjetaCredito().conDatosDeTarjeta(datos), tipoAvance));
  }

  @Entonces("^se valida el avance no exitoso$")
  public void seValidaElAvanceNoExitoso(List<Map<String, String>> datos) {
    theActorInTheSpotlight()
        .should(
            seeThat(validarAvanceNoExitoso(tarjetaCredito().conMensajeDeRechazo(datos)))
                .orComplainWith(AvanceNoExitoso.class, MENSAJE_AVANCE_NO_EXITOSO));
  }
}
