package co.com.bancolombia.certificacion.app.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrarse implements Task {

    private String nuevoUser;
    private String correoUser;

    public Registrarse(String nuevoUser, String correoUser) {
        this.nuevoUser = nuevoUser;
        this.correoUser = correoUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(nuevoUser).into(TXT_CREAR_USUARIO),
                Click.on(BTN_SIGUIENTE),
                Click.on(BTN_SIGUIENTE),
                Click.on(TXT_CORREO),
                Type.theValue(correoUser).into(TXT_CORREO),
                Click.on(LBL_CORREO),
                Click.on(CHECK_TIPO_CORREO),
                Click.on(CHECK_TYC),
               Click.on(BTN_REGISTRO)
        );
    }

    public static Performable conLosDatos(String nuevoUser, String correoUser) {
        return instrumented(Registrarse.class, nuevoUser, correoUser);
    }
}