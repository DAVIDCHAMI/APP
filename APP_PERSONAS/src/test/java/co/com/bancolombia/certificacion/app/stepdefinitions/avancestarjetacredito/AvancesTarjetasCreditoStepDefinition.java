package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.exceptions.avancetarjetacredito.AvanceNoExitoso;
import co.com.bancolombia.certificacion.app.questions.avancetarjetacredito.VerificarAvance;
import co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.HacerAvance;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.avancetarjetacredito.AvanceNoExitoso.MENSAJE_AVANCE_NO_EXITOSO;
import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AvancesTarjetasCreditoStepDefinition {

    @Y("^el (.*) desde su tarjeta de credito$")
    public void ingresaALaOpcionTarjetaDeCredito(String tipoAvance, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                HacerAvance.deTarjetasCredito(tipoAvance,tarjetaCredito().conDatosDeTarjeta(datos))
        );
    }

    @Entonces("^se valida el avance exitoso$")
    public void seValidaElAvanceExitoso(List<Map<String, String>> datos) {
        theActorInTheSpotlight().should(seeThat(VerificarAvance.esExitosoCon(tarjetaCredito().conMensajeConfirmacion(datos))).
                orComplainWith(AvanceNoExitoso.class,MENSAJE_AVANCE_NO_EXITOSO));
    }
}