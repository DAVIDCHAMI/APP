package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.eprepago.SeleccionarOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.CHK_DESCARGA_TOTAL_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.LNK_DESCARGAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.DESCARGA_EPREPAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DescargarSaldo implements Task {
    private String opcionMenu;

    public DescargarSaldo(String opcionMenu){
        this.opcionMenu = opcionMenu;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionMenu),
                SeleccionarOpcion.deSubmenu(DESCARGA_EPREPAGO),
                WaitUntil.the(CHK_DESCARGA_TOTAL_EPREPAGO, isEnabled()),
                Click.on(CHK_DESCARGA_TOTAL_EPREPAGO),
                WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_DESCARGAR_EPREPAGO));
    }

    public static DescargarSaldo totalDeLaTarjeta(String opcionMenu){
        return instrumented(DescargarSaldo.class, opcionMenu);
    }
}