package co.com.bancolombia.certificacion.app.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

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
                Click.on(IMG_COMUN_CAMPO_TEXTO),
                Click.on(LNK_SIGUIENTE),
                WaitUntil.the(TXT_CORREO, isEnabled()),
                Type.theValue(correoUser).into(TXT_CORREO),
                Check.whether(LBL_TIPO_CORREO.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(LBL_TIPO_CORREO)).otherwise(
                    Click.on(LBL_CORREO)
                ),
                Click.on(CHECK_TIPO_CORREO),
                Click.on(CHECK_TYC));
        //   Click.on(BTN_REGISTRO)
    }

    public static Performable conLosDatos(String nuevoUser, String correoUser) {
        return instrumented(Registrarse.class, nuevoUser, correoUser);
    }
}