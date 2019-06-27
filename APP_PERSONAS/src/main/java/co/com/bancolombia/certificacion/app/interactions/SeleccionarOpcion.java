package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Interaction {

    private String opcionMenu;

    public SeleccionarOpcion(String opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(OPT_MENU_PRINCIPAL.OF)
        );
    }

    public static SeleccionarOpcion en(String opcionMenu) {
        return instrumented(SeleccionarOpcion.class, opcionMenu);
    }

}
