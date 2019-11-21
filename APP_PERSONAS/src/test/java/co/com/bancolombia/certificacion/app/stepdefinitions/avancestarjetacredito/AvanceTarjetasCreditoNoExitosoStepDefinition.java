package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvanceNoExitoso;
import cucumber.api.java.es.Entonces;
import java.util.List;
import java.util.Map;
import cucumber.api.java.es.Cuando;
import static co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvanceNoExitoso.deTarjetasCredito;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static co.com.bancolombia.certificacion.app.questions.avancetarjetacredito.AvanceNoExitoso.validarAvanceNoExitoso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AvanceTarjetasCreditoNoExitosoStepDefinition {

    @Cuando("^el (.*) desde su tarjeta de credito con monto sobrecupo$")
    public void elEnviaDineroDesdeSuTarjetaDeCreditoConMontoSobrecupo(String tipoAvance, List<Map<String, String>> datos ) {
        theActorInTheSpotlight().attemptsTo(RealizarAvanceNoExitoso.deTarjetasCredito(tarjetaCredito().conDatosDeTarjeta(datos), tipoAvance));
    }

    @Entonces("^se valida el avance no exitoso$")
    public void seValidaElAvanceNoExitoso(List<Map<String, String>> datos) {
        theActorInTheSpotlight().should(seeThat(validarAvanceNoExitoso(
                tarjetaCredito().conMensajeDeRechazo(datos))));
    }
}
