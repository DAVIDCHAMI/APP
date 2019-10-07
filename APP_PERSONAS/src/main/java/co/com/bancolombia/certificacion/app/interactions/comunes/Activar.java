package co.com.bancolombia.certificacion.app.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Activar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LNK_CANCELAR, isEnabled()),
                Click.on(LNK_CANCELAR),
                Click.on(BTN_SI_CANCELAR_REGISTRO));
    }

    public static Activar huella(){ return instrumented(Activar.class);}
}