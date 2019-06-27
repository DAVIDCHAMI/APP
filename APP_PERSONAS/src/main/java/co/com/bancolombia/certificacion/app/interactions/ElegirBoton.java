package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_SUB_MENU_SOLICITAR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.SOLICITAR_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElegirBoton implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPT_MENU_PRINCIPAL.of(SOLICITAR_PRODUCTOS)),
                Click.on(OPT_SUB_MENU_SOLICITAR.of("Inversiones"))
        );
    }

    public static Performable deOsp(){
        return instrumented(ElegirBoton.class);
    }
}
