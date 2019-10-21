package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.exceptions.eprepago.NoRealizoActivacionEprepagoException;
import co.com.bancolombia.certificacion.app.questions.eprepago.ActivacionEprepago;
import co.com.bancolombia.certificacion.app.questions.eprepago.CancelarActivacionEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.ActivarEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.CancelarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.eprepago.NoRealizoActivacionEprepagoException.NO_SE_REALIZO_ACTIVACION_EPREPAGO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActivarEprepagoStepDefinition {

    @Cuando("^quiero activar una tarjeta e-prepago$")
    public void quieroActivarUnaTarjetaEprepago(){
        theActorInTheSpotlight().attemptsTo(ActivarEprepago.enLaAppBancolombia());
    }

    @Entonces("^el deberia de ver un mensaje de activación exitosa para su eprepago$")
    public void elDeberiaDeVerUnMensajeDeActivacionExitosaParaSuEprepago(){
        theActorInTheSpotlight().should(seeThat(ActivacionEprepago.esExitosa()).orComplainWith(NoRealizoActivacionEprepagoException.class, NO_SE_REALIZO_ACTIVACION_EPREPAGO));
    }

    @Cuando("^cancelo la activación de una tarjeta e-prepago$")
    public void canceloLaActivacionDeUnaTarjetaEprepago(){
        theActorInTheSpotlight().attemptsTo(CancelarEprepago.enLaAppBancolombia());
    }

    @Entonces("^el deberia ver un mensaje de cancelacion$")
    public void elDeberiaVerUnMensajeDeCancelacion(){
        theActorInTheSpotlight().should(seeThat(CancelarActivacionEprepago.esExitosa()));
    }
}