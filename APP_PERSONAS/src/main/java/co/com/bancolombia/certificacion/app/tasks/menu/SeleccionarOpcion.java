package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.interactions.Scroll;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {
    private TipoTransaccionEnum tipoTransaccion;

    public SeleccionarOpcion(String opcionMenu) {
        this.tipoTransaccion = TipoTransaccionEnum.valueOf(opcionMenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu())),
                Scroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                Check.whether(!"".equals(tipoTransaccion.getSubMenu())).andIfSo(
                        Scroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()))
                ),
                Check.whether(!"".equals(tipoTransaccion.getTercerNivel())).andIfSo(
                        Scroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel())),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel()))
                )
        );
    }

    public static SeleccionarOpcion delMenu(String opcionMenu) {
        return instrumented(SeleccionarOpcion.class, opcionMenu);
    }
}
