package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.ProgramarFacturas;
import co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_SUB_MENU;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarYpagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum.PROGRAMAR_PAGAR_FACTURAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ProgramarFactura implements Task {
    private ProgramarFacturas programarFacturas;

    public ProgramarFactura(ProgramarFacturas programarFacturas) {
        this.programarFacturas = programarFacturas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha[] = programarFacturas.getFechaInicioFin().split("-");
        String fechaInicio = fecha[0];
        String fechaFin = fecha[1];
        actor.attemptsTo(
                WaitUntil.the(OPT_SUB_MENU.of(PROGRAMAR_PAGAR_FACTURAS.getTercerNivel()), isPresent()),
                Click.on(OPT_SUB_MENU.of(PROGRAMAR_PAGAR_FACTURAS.getTercerNivel())),
                ScrollHasta.elTarget(SELECCIONAR_FACTURA.of(
                        programarFacturas.getValorFactura(),
                        programarFacturas.getFechaFactura(),
                        programarFacturas.getDescripcionFactura())),
                Click.on(SELECCIONAR_FACTURA.of(
                        programarFacturas.getValorFactura(),
                        programarFacturas.getFechaFactura(),
                        programarFacturas.getDescripcionFactura())),
                Click.on(SELECCIONAR_PROGRAMAR),
                Click.on(SELECCIONAR_MIS_PRODUCTOS),
                ScrollHasta.elTarget(SELECCIONAR_CUENTA.of(programarFacturas.getProducto().
                        getTipo(), programarFacturas.getProducto().getNumero())),
                Click.on(SELECCIONAR_CUENTA.of(programarFacturas.getProducto().
                        getTipo(), programarFacturas.getProducto().getNumero())),
                Click.on(CHECK_FECHA_VENCIMIENTO.of(programarFacturas.getPeriodicidad())),
                Click.on(SELECCIONAR_NUMERO_INTENTOS),
                Click.on(SELECCIONAR_INTENTOS_PAGO.of(programarFacturas.getNumeroIntento())),
                ScrollHasta.elTarget(SELECCIONAR_FECHA_INICIO_FIN),
                Click.on(SELECCIONAR_FECHA_INICIO_FIN),
                Click.on(SELECCIONAR_RANGO_FECHA.of(fechaInicio)),
                Click.on(SELECCIONAR_RANGO_FECHA.of(fechaFin)),
                Click.on(BTN_SELECCIONAR),
                Click.on(BTN_SIGUIENTE),
                ScrollHasta.elTarget(CHECK_ACEPTO_TERMINOS),
                Click.on(CHECK_ACEPTO_TERMINOS),
                Click.on(BTN_PROGRAMAR)
        );
    }

    public static ProgramarFactura inscritas(ProgramarFacturasBuilder programarFacturasBuilder) {
        return instrumented(ProgramarFactura.class, programarFacturasBuilder.build());
    }
}