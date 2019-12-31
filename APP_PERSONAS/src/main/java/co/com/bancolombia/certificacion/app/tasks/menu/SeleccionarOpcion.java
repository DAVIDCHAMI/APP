package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SeleccionarOpcion implements Task {
    private TipoTransaccionEnum tipoTransaccion;

    public SeleccionarOpcion(String opcionMenu) {
        this.tipoTransaccion = TipoTransaccionEnum.valueOf(opcionMenu);
    }

    public static SeleccionarOpcion delMenu(String opcionMenu) {
        return instrumented(SeleccionarOpcion.class, opcionMenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu()), isPresent()),
                Click.on(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu()))
        );
        actor.attemptsTo(
                Check.whether(!"".equals(tipoTransaccion.getSubMenu())).andIfSo(
                        WaitUntil.the(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()), isPresent()),
                        RealizarScroll.hastaPosicionDeTarget(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                        WaitUntil.the(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()), isPresent()),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()))
                )
        );
        actor.attemptsTo(
                Check.whether(!"".equals(tipoTransaccion.getTercerNivel())).andIfSo(
                        RealizarScroll.hastaPosicionDeTarget(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel())),
                        WaitUntil.the(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel()), isPresent()),
                        Click.on(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel())),
                        Esperar.unTiempo(3000)
                )
        );
    }
}