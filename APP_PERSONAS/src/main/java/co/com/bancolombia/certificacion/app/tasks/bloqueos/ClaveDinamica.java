package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_BLOQUEAR;

public class ClaveDinamica implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BLOQUEAR)
        );
    }
}
