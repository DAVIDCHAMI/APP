package co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveBloqueadaNoVisualizado;
import co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveInvalidoNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeValidacionNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveBloqueada;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveInvalida;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveValida;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveBloqueadaNoVisualizado.MENSAJE_CLAVE_BLOQUEADA_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveInvalidoNoVisualizadoExcepcion.MENSAJE_PASS_INVALIDO_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeValidacionNoVisualizadoExcepcion.MENSAJE_VALIDACION_NO_ENCONTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    @Entonces("^la autenticacion deberia de ser exitosa$")
    public void verificoElResultadoDeLaAutenticacionExitosa() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveValida.enLaApp())
                .orComplainWith(MensajeValidacionNoVisualizadoExcepcion.class,MENSAJE_VALIDACION_NO_ENCONTRADO));
    }

    @Entonces("^la autenticacion deberia de ser fallida por clave invalida$")
    public void verificoElResultadoDelLogueoFallido() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveInvalida.enLaApp())
                .orComplainWith(MensajeClaveInvalidoNoVisualizadoExcepcion.class,MENSAJE_PASS_INVALIDO_NO_ENCONTRADO));
    }

    @Entonces("^la autenticacion deberia de ser fallida por usuario bloqueado$")
    public void verificoElResultadoDelLogueoConUsuarioBloqueado() {
            theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveBloqueada.enLaApp())
                    .orComplainWith(MensajeClaveBloqueadaNoVisualizado.class,MENSAJE_CLAVE_BLOQUEADA_NO_ENCONTRADO));
    }
}