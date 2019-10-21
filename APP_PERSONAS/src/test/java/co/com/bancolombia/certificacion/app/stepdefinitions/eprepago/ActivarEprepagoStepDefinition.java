package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.ActivacionEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.ActivarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActivarEprepagoStepDefinition {

    @Cuando("^quiere activar una tarjeta (.*)$")
    public void quiereActivarUnaTarjetaEprepago(String opcionCategoria){
        theActorInTheSpotlight().attemptsTo(ActivarEprepago.enLaAppBancolombia(opcionCategoria));
    }

    @Entonces("^el deberia de ver un mensaje de activación exitosa para su eprepago$")
    public void elDeberiaDeVerUnMensajeDeActivacionExitosaParaSuEprepago(){
        theActorInTheSpotlight().should(seeThat(ActivacionEprepago.esExitosa()));
    }

    @Entonces("^el deberia de ver la opcion de numero maximo de activaciones$")
    public void elDeberiaDeVerLaOpcionDeNumeroMaximoDeActivaciones(){
      //  theActorInTheSpotlight().should(seeThat());
    }
}