package co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion;


import co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveInvalidoNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeValidacionNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveInvalida;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveValida;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveInvalidoNoVisualizadoExcepcion.MENSAJE_PASS_INVALIDO_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeValidacionNoVisualizadoExcepcion.MENSAJE_VALIDACION_NO_ENCONTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    @Entonces("^verifico el resultado de la autenticacion exitosa$")
    public void verificoElResultadoDeLaAutenticacionExitosa() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveValida.enLaApp())
                .orComplainWith(MensajeValidacionNoVisualizadoExcepcion.class,MENSAJE_VALIDACION_NO_ENCONTRADO));
    }

    @Entonces("^verifico el resultado del logueo fallido$")
    public void verificoElResultadoDelLogueoFallido() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveInvalida.enLaApp())
                .orComplainWith(MensajeClaveInvalidoNoVisualizadoExcepcion.class,MENSAJE_PASS_INVALIDO_NO_ENCONTRADO));
    }

    @Entonces("^verifico el resultado del logueo con usuario bloqueado$")
    public void verificoElResultadoDelLogueoConUsuarioBloqueado() {

    }
}
