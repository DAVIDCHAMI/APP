package co.com.bancolombia.certificacion.app.interactions;

import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_SUB_MENU_SOLICITAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Interaction {

    private String opcionMenu;
    private TipoTransaccion tipoTransaccion;

    public SeleccionarOpcion(String opcionMenu) {
        this.opcionMenu = opcionMenu;
        this.tipoTransaccion = TipoTransaccion.valueOf(opcionMenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu())),
                Click.on(OPT_SUB_MENU_SOLICITAR.of(tipoTransaccion.getSubmenu())
                )
        );
    }

    public static SeleccionarOpcion en(String opcionMenu) {
        return instrumented(SeleccionarOpcion.class, opcionMenu);
    }

}
