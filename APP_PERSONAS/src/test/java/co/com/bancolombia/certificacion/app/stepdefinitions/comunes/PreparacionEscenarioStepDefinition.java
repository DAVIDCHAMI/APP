package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;

import static co.com.bancolombia.certificacion.app.models.builders.ConfiguracionTransaccionBuilder.informacion;
import static co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder.credenciales;
import static co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.bancolombia.certificacion.app.tasks.autenticacion.CerrarSesion;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.Navegar;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.Usuario;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatos;
import co.com.bancolombia.certificacion.app.tasks.clavedinamica.GestionarClaveDinamica;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PreparacionEscenarioStepDefinition {

  @Before
  public void configuracionInicial() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que el (.*) se autentica en la app$")
  public void queSuboLosDatosParaLaPruebaLogin(String actor, List<Map<String, String>> datos) {
    theActorCalled(actor).wasAbleTo(IniciarSesion.con(informacion().deTransaccion(datos)));
  }

  @Dado("^que el (.*) esta listo en la app$")
  public void queEstaListoApp(String actor, List<Map<String, String>> datos) {
    theActorCalled(actor)
        .wasAbleTo(
            IniciarSesion.con(informacion().deTransaccion(datos)),
            GestionarClaveDinamica.conDatosInscripcionDesdeCorreo(
                usuario()
                    .conNombrePersonalizado(datos)
                    .conCorreo(datos)
                    .conTipoCorreo(datos)
                    .conNumeroCelular(datos)
                    .conSegundaClave(datos)));
  }

  @Cuando("^el actor quiere (.*)$")
  public void quieroRealizarConsulta(String tipoTransaccion) {
    theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.delMenu(tipoTransaccion));
  }

  @Dado("^que el (.*) carga los datos para la prueba$")
  public void queSuboLosDatosParaLaPrueba(String actor, List<Map<String, String>> datos) {
    theActorCalled(actor).wasAbleTo(CargarDatos.transaccionCon(informacion().deTransaccion(datos)));
  }

  @Cuando("^quiero (.*) del usuario (.*) con clave (.*)$")
  public void quieroTransarConElUsuarioYClave(
      String tipoTransaccion, String usuario, String clave) {
    theActorInTheSpotlight()
        .attemptsTo(
            SeleccionarOpcion.delMenu(tipoTransaccion),
            IniciarSesion.con(credenciales().conNombreUsuario(usuario).conClave(clave)));
  }

  @Cuando("^ingreso por (.*) con el usuario (.*) con clave errada (.*)$")
  public void ingresoConElUsuarioYClave(String tipoTransaccion, String usuario, String clave) {
    theActorInTheSpotlight()
        .attemptsTo(
            SeleccionarOpcion.delMenu(tipoTransaccion),
            IniciarSesion.conDatos(credenciales().conNombreUsuario(usuario).conClave(clave)));
  }

  @Cuando("^ingreso por (.*) con el usuario (.*) con la clave (.*)$")
  public void ingresoPorLaOpcionConElUsuarioyConClseString(
      String tipoTransaccion, String usuario, String clave) {
    theActorInTheSpotlight()
        .attemptsTo(
            SeleccionarOpcion.delMenu(tipoTransaccion),
            Usuario.conFraseDeSeguridad(usuario, clave));
  }

  @Cuando("^ingreso por (.*) con usuario (.*)$")
  public void ingresoPorLaOpcionConElUsuario(String tipoTransaccion, String usuario) {
    theActorInTheSpotlight()
        .attemptsTo(
            SeleccionarOpcion.delMenu(tipoTransaccion),
            Navegar.enLaOpcionAunNoEresCliente(usuario));
  }

  @Y("cierra sesion en la app")
  public void cerrarSesionOsp() {
    theActorInTheSpotlight().attemptsTo(CerrarSesion.exitosamente());
  }
}
