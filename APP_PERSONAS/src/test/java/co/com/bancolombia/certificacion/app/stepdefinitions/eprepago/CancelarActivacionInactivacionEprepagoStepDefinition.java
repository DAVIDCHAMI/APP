package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.CancelarActivacionEprepago;
import co.com.bancolombia.certificacion.app.questions.eprepago.CancelarInactivacionEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.CancelarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CancelarActivacionInactivacionEprepagoStepDefinition {

    @Cuando("^cancelo la activación/inactivacion de una tarjeta (.*)$")
    public void canceloLaActivacionInactivacionDeUnaTarjetaEprepago(String opcionCategoria){
        theActorInTheSpotlight().attemptsTo(CancelarEprepago.enLaAppBancolombia(opcionCategoria));
    }

    @Entonces("^el deberia ver un mensaje de cancelacion$")
    public void elDeberiaVerUnMensajeDeCancelacion(){
        theActorInTheSpotlight().should(seeThat(CancelarActivacionEprepago.esExitosa()));
    }

    @Entonces("^el deberia ver un mensaje de cancelar la inactivacion de la tarjeta eprepago$")
    public void elDeberiaVerUnMensajeDeCancelarLaInactivacionDeLaTarjetaEprepago(){
        theActorInTheSpotlight().should(seeThat(CancelarInactivacionEprepago.esExitosa()));
    }
}

