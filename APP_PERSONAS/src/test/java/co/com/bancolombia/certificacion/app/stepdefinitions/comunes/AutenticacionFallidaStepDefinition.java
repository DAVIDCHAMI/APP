package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;


import co.com.bancolombia.certificacion.app.exceptions.MensajePassInvalidoNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveInvalida;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.MensajePassInvalidoNoVisualizadoExcepcion.MENSAJE_PASS_INVALIDO_NO_ENCONTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionFallidaStepDefinition {


    @Entonces("^verifico el resultado del logueo fallido$")
    public void verificoElResultadoDelLogueoFallido() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveInvalida.enLaApp())
                .orComplainWith(MensajePassInvalidoNoVisualizadoExcepcion.class,MENSAJE_PASS_INVALIDO_NO_ENCONTRADO));
    }


}
