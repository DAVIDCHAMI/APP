package co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.app.exceptions.autenticacion.*;
import co.com.bancolombia.certificacion.app.questions.autenticacion.*;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.FraseDeSeguridadException.FRASE_DE_SEGURIDAD_NO_VISIBLE;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.FraseDeSeguridadException.FRASE_DE_SEGURIDAD_VISIBLE;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveBloqueadaNoVisualizadoException.MENSAJE_CLAVE_BLOQUEADA_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeClaveInvalidoNoVisualizadoException.MENSAJE_PASS_INVALIDO_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.MensajeValidacionNoVisualizadoException.MENSAJE_VALIDACION_NO_ENCONTRADO;
import static co.com.bancolombia.certificacion.app.exceptions.autenticacion.OpcionAunNoEresClienteException.OPCION_AUN_NO_ERES_CLIENTE_NO_VISIBLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    @Entonces("^la autenticacion deberia de ser exitosa$")
    public void verificoElResultadoDeLaAutenticacionExitosa() {
        theActorInTheSpotlight().should(seeThat(MensajeClaveValida.esVisible())
                .orComplainWith(MensajeValidacionNoVisualizadoException.class, MENSAJE_VALIDACION_NO_ENCONTRADO));
    }

    @Entonces("^la autenticacion deberia de ser fallida por clave invalida$")
    public void verificoElResultadoDelLogueoFallido() {
        theActorInTheSpotlight().should(seeThat(MensajeClaveInvalida.esVisible())
                .orComplainWith(MensajeClaveInvalidoNoVisualizadoException.class, MENSAJE_PASS_INVALIDO_NO_ENCONTRADO));
    }

    @Entonces("^la autenticacion deberia de ser fallida por usuario bloqueado$")
    public void verificoElResultadoDelLogueoConUsuarioBloqueado() {
        theActorInTheSpotlight().should(seeThat(MensajeDeClaveBloqueada.esVisible())
                .orComplainWith(MensajeClaveBloqueadaNoVisualizadoException.class, MENSAJE_CLAVE_BLOQUEADA_NO_ENCONTRADO));
    }

    @Entonces("^Se debe presentar la frase de seguridad asociada al usuario$")
    public void seDebePresentarLaFraseDeSeguridadAsociadaAlUsuario() {
        theActorInTheSpotlight().should(seeThat(VerificarFrase.deSeguridadDelUsuario())
                .orComplainWith(FraseDeSeguridadException.class, FRASE_DE_SEGURIDAD_NO_VISIBLE));
    }

    @Entonces("^Se debe presentar una frase de seguridad asociada al usuario inexistente$")
    public void seDebePresentarUnaFraseDeSeguridadAsociadaAlUsuarioInexistente() {
        theActorInTheSpotlight().should(seeThat(FraseDeSeguridad.usuarioInexistente())
                .orComplainWith(FraseDeSeguridadException.class, FRASE_DE_SEGURIDAD_NO_VISIBLE));
    }

    @Entonces("^La frase de seguridad no se debe visualizar$")
    public void laFraseDeSeguridadNoSeDebeVisualizar() {
        theActorInTheSpotlight().should(seeThat(FraseSeguridad.noVisible())
                .orComplainWith(FraseDeSeguridadException.class, FRASE_DE_SEGURIDAD_VISIBLE));
    }

    @Entonces("^Se deben de ver las opciones para un cliente nuevo$")
    public void seDebenDeVerLasOpcionesParaUnClienteNuevo() {
        theActorInTheSpotlight().should(seeThat(VerificarOpcion.aunNoEresCliente())
                .orComplainWith(OpcionAunNoEresClienteException.class, OPCION_AUN_NO_ERES_CLIENTE_NO_VISIBLE));
    }
}