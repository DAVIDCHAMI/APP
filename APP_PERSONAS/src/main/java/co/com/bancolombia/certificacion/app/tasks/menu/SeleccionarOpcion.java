package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SeleccionarOpcion implements Task {
    private TipoTransaccionEnum tipoTransaccion;

    public SeleccionarOpcion(String opcionMenu) {
        this.tipoTransaccion = TipoTransaccionEnum.valueOf(opcionMenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu()), isEnabled()),
                Click.on(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu())),
                Check.whether(!"".equals(tipoTransaccion.getSubMenu())).andIfSo(
                        RealizarScroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()))
                ));
        if (!"".equals(tipoTransaccion.getTercerNivel())) {
            if (OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel()).resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        RealizarScroll.hastaTargetVisible(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel())),
                        Click.on(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel()))
                );
            } else {
                actor.attemptsTo(WaitUntil.the(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel()), isEnabled()),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel()))
                );
            }
        }
    }

    public static SeleccionarOpcion delMenu(String opcionMenu) {
        return instrumented(SeleccionarOpcion.class, opcionMenu);
    }
}