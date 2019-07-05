package co.com.bancolombia.certificacion.app.interactions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Ingresar implements Interaction {

    private String clave;

    public Ingresar(String clave) {
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < clave.length(); i++) {
            if (i == 0) {
                actor.attemptsTo(
                        Type.theValue(Character.toString(clave.charAt(i))).into(CLAVE_DIGITOS.of(""))
                );
            }else{
                actor.attemptsTo(
                        Type.theValue(Character.toString(clave.charAt(i))).into(CLAVE_DIGITOS.of(String.valueOf(i + 1))).thenHit()
                );
            }
        }
        actor.attemptsTo(
                Click.on(LBL_IMAGEN_PROVISIONAL),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static Performable primeraClave(String clave) {
        return instrumented(Ingresar.class, clave);
    }
}
