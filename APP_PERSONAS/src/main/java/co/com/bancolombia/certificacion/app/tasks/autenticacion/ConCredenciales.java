package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_CONTINUAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ConCredenciales extends Autenticacion {
    private UsuarioBuilder usuario;

    public ConCredenciales(UsuarioBuilder usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(usuario.getNombreUsuario()).into(TXT_USUARIO),
                Click.on(LBL_HOLA_PROVISIONAL),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(usuario.getClave()).into(TXT_CLAVE_DIGITOS),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR)
        );
    }
}
