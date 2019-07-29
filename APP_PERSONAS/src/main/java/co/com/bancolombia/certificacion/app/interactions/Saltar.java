package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_COMENZAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SALTAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Saltar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(LNK_SALTAR.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(LNK_SALTAR),
                        Click.on(LNK_COMENZAR)
                )
        );
    }

    public static Saltar unboarding(){
        return instrumented(Saltar.class);
    }
}
