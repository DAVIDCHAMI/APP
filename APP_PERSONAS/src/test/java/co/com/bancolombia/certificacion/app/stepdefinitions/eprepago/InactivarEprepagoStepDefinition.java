package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.tasks.eprepago.InactivarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InactivarEprepagoStepDefinition {

    @Cuando("^quiero inactivar una tarjeta (.*)$")
    public void quieroInactivarUnaTarjetaEprepago(String opcionCategoria){
        theActorInTheSpotlight().attemptsTo(InactivarEprepago.enLaAppBancolombia(opcionCategoria));
    }

    @Entonces("^el deberia de ver un mensaje de inactivacion exitosa para su eprepago$")
    public void elDeberiaDeVerUnMensajeDeInactivacionExitosaParaSuEprepago(){
      //  theActorInTheSpotlight().should(seeThat());
    }
}
