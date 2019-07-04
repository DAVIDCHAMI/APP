package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.app.exceptions.MensajeValidacionNoVisualizadoExcepcion;
import co.com.bancolombia.certificacion.app.questions.autenticacion.ElMensajeDeClaveValida;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.MensajeValidacionNoVisualizadoExcepcion.MENSAJE_VALIDACION_NO_ENCONTRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PreparacionEscenarioStepDefinition {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) carga los datos para la prueba$")
    public void queSuboLosDatosParaLaPrueba(String actor, List<String> datosTransaccion) {
        theActorCalled(actor).wasAbleTo(
                CargarDatos.transaccionCon(
                        datosTransaccion)
                        .datosDelUsuarioCon(datosTransaccion)
                        .construir()
        );
    }

    @Dado("^quiero (.*) del usuario (.*) con clave (.*)$")
    public void quieroTransarConElUsuarioYClave(String tipoTransaccion, String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                IniciarSesion.conCredenciales(usuario, clave)
        );
    }

    @Entonces("^verifico el resultado de la autenticacion exitosa$")
    public void verificoElResultadoDeLaAutenticacionExitosa() {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeClaveValida.enLaApp())
                .orComplainWith(MensajeValidacionNoVisualizadoExcepcion.class,MENSAJE_VALIDACION_NO_ENCONTRADO));
    }





}
