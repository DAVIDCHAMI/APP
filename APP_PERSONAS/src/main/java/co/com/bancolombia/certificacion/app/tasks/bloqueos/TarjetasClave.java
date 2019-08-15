package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_BLOQUEAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_BLOQUEAR;

public class TarjetasClave extends Bloqueo {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_BLOQUEAR),
                Click.on(BTN_BLOQUEAR)
        );
    }
}
