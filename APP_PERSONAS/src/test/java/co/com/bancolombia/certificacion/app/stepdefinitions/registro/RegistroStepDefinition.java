package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.questions.registro.MensajeRegistro;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.tasks.registro.Registrarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition {

    @Y("^quiere ingresar desde (.*) con el documento (.*) con clave (.*)$")
    public void quiereIngresarARegistrarseConElDocumentoConClave(String tipoTransaccion, String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                IniciarSesion.conCredenciales(usuario, clave)
        );
    }

    @Cuando("^quiere realizar el registro con el usuario (.*) y con el correo (.*)$")
    public void quiereRealizarElRegistroConElUsuarioYConElCorreo(String nuevoUser, String correoUser) {
        theActorInTheSpotlight().attemptsTo(
                Registrarse.conLosDatos(nuevoUser, correoUser));
    }

    @Entonces("^verifico el resultado del registro$")
    public void verificoElResultadoDelRegistro() {
        theActorInTheSpotlight().should(seeThat(MensajeRegistro.exitoso()));
    }
}