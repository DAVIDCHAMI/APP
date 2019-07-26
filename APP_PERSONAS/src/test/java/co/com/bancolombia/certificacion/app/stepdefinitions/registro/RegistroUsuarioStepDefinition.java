package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.questions.registro.MensajeRegistro;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import co.com.bancolombia.certificacion.app.tasks.menu.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.tasks.registro.Registrarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder.conCredenciales;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepDefinition {

    @Cuando("^quiere ingresar desde (.*) con el documento (.*) con clave (.*)$")
    public void quiereIngresarARegistrarseConElDocumentoConClave(String tipoTransaccion, String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarOpcion.delMenu(tipoTransaccion),
                IniciarSesion.enApp(conCredenciales()
                        .conNombreUsuario(usuario)
                        .conClave(clave))
        );
    }

    @Cuando("^quiere realizar el registro con el usuario (.*) y con el correo (.*)$")
    public void quiereRealizarElRegistroConElUsuarioYConElCorreo(String nuevoUser, String correoUser) {
        theActorInTheSpotlight().attemptsTo(
                Registrarse.conLosDatos(nuevoUser, correoUser));
    }

    @Entonces("^el deberia de ver un mensaje de registro exitoso$")
    public void verificoElResultadoDelRegistro() {
        theActorInTheSpotlight().should(seeThat(MensajeRegistro.exitoso()));
    }
}