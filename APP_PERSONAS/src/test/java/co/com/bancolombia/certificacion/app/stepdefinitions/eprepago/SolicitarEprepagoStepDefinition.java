package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.SolicitudEprepago;
import co.com.bancolombia.certificacion.app.questions.eprepago.UsuarioConEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.SolicitarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SolicitarEprepagoStepDefinition {

    @Cuando("^quiero solicitar una tarjeta e-prepago$")
    public void quieroSolicitarUnaTarjetaEprepago(){
        theActorInTheSpotlight().attemptsTo(SolicitarEprepago.enLaAppBancolombia());
    }
    @Entonces("^Debo ver el mensaje de solicitud exitosa$")
    public void deboVerElMensajeDeSolicitudExitosa() {
        theActorInTheSpotlight().should(seeThat(SolicitudEprepago.esExitosa()));
    }

    @Entonces("^Debo ver el mensaje respectivo para el usuario$")
    public void deboVerElMensajeRespectivoParaElUsuario() {
        theActorInTheSpotlight().should(seeThat(UsuarioConEprepago.enLaApp()));
    }
}