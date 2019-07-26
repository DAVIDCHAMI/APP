package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.app.exceptions.AfirmacionDelProducto;
import co.com.bancolombia.certificacion.app.questions.fabrica.autenticacion.FabricaAutenticacion;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.CerrarSesion;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.basededatos.comunes.ConsultarLosArchivosDeIseries;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatos;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.AfirmacionDelProducto.NO_FUNCIONA;
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
                CargarDatos.transaccionCon(datosTransaccion)
                        .datosDelUsuarioCon(datosTransaccion)
                        .construir()
        );
    }

    @Dado("^quiero (.*) del usuario (.*) con clave (.*)$")
    public void quieroTransarConElUsuarioYClave(String tipoTransaccion, String usuario, String clave) {

        theActorInTheSpotlight().should(seeThat(FabricaAutenticacion.elArchivoEnIseriesWWWFFUSRSV())
                .orComplainWith(AfirmacionDelProducto.class,NO_FUNCIONA));

        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                IniciarSesion.conCredenciales(usuario, clave)
        );
    }

    @After
    public void cerrarSesionOsp(){
        theActorInTheSpotlight().attemptsTo(
                CerrarSesion.exitosamente()
        );
    }

    @Y("^Verifico los resultados en los archivos de iseries$")
    public void IVerifyTheResultsInTheFilesOfBackIseries(List<String> files){
        theActorInTheSpotlight().attemptsTo(ConsultarLosArchivosDeIseries.enApp(files));
    }
}
