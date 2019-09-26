package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.CancelarActivacionEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.CancelarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CancelarActivacionEprepagoStepDefinition {

    @Cuando("^cancelo la activación de una tarjeta (.*)$")
    public void canceloLaActivacionDeUnaTarjetaEprepago(String opcionCategoria){
        theActorInTheSpotlight().attemptsTo(CancelarEprepago.enLaAppBancolombia(opcionCategoria));
    }

    @Entonces("^el deberia ver un mensaje de cancelacion$")
    public void elDeberiaVerUnMensajeDeCancelacion(){
        theActorInTheSpotlight().should(seeThat(CancelarActivacionEprepago.esExitosa()));
    }
}
