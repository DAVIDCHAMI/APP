package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.autenticacion.CerrarTip;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

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
                CerrarTip.alIniciarApp(),
                Esperar.unTiempo(10000),
                Click.on(OPT_MENU_PRINCIPAL.of(tipoTransaccion.getMenu())),
                RealizarScroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                Check.whether(!"".equals(tipoTransaccion.getSubMenu())).andIfSo(
                        RealizarScroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu())),
                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getSubMenu()))
                ),
                Check.whether(!"".equals(tipoTransaccion.getTercerNivel()))
                        .andIfSo(
                                Check.whether(Visibility.of(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel())).viewedBy(actor).asBoolean())
                                        .andIfSo(
                                                RealizarScroll.hastaTargetVisible(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel())),
                                                Click.on(OPT_TERCER_NIVEL.of(tipoTransaccion.getTercerNivel()))
                                        ).otherwise(
                                        RealizarScroll.hastaTargetVisible(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel())),
                                        Click.on(OPT_SUB_MENU.of(tipoTransaccion.getTercerNivel()))
                                )
                        )
        );
    }
}