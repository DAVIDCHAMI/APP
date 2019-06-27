package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ElegirBoton implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(OPT_MENU_PRINCIPAL, isEnabled()),
                Click.on(OPT_MENU_PRINCIPAL.of("Link_MyProducts_BottomBar"))
        );
    }

    public static Performable deOsp(){
        return instrumented(ElegirBoton.class);
    }
}
