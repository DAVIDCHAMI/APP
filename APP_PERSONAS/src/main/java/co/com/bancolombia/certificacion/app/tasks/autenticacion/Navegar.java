package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Navegar implements Task {
    private String usuario;

    public Navegar(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(usuario).into(TXT_USUARIO),
                Click.on(LBL_HOLA_PROVISIONAL),
                WaitUntil.the(LBL_OPCION_NO_ERES_CLIENTE, isEnabled()),
                Click.on(LBL_OPCION_NO_ERES_CLIENTE)
        );
    }

    public static Navegar enLaOpcionAunNoEresCliente(String usuario) {
        return Tasks.instrumented(Navegar.class,usuario);
    }
}