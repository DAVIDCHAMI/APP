package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.app.tasks.autenticacion.CerrarSesion;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

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

    @Cuando("^quiero (.*) del usuario (.*) con clave (.*)$")
    public void quieroTransarConElUsuarioYClave(String tipoTransaccion, String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                IniciarSesion.conCredenciales(usuario, clave)
        );
    }

    @Y("cierra sesión en la app")
    public void cerrarSesionOsp() {
        theActorInTheSpotlight().attemptsTo(
                CerrarSesion.exitosamente()
        );
    }
}
