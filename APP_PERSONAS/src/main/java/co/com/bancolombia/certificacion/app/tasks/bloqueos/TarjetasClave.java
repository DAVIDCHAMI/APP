package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TarjetasClave implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_BLOQUEAR),
                Click.on(BTN_BLOQUEAR),
                WaitUntil.the(LBL_BLOQUEO_EXITOSO, isVisible())
        );
    }
}
