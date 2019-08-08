package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.interactions.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.ProgramarFacturas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_MODIFICAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.*;

public class conOpcionEditarProgramacion extends PagarProgramarFactura {
    private ProgramarFacturas programarFacturas;
    private String opcion;

    public conOpcionEditarProgramacion(ProgramarFacturas programarFacturas, String opcion) {
        this.programarFacturas = programarFacturas;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha[] = programarFacturas.getFechaInicioFin().split("-");
        String fechaInicio = fecha[0];
        String fechaFin = fecha[1];
        actor.attemptsTo(
                Click.on(OPT_SUB_MENU_PROGRAMADAS),
                SeleccionarOpcionFactura.conInformacion(OPT_MODIFICAR_PROGRAMACION, programarFacturas.getValorFactura(), programarFacturas.getFechaFactura(), programarFacturas.getDescripcionFactura()),
                Check.whether(PRODUCTO_ORIGEN.equals(opcion)).andIfSo(
                        Click.on(LNK_CAMBIAR.of(opcion))),
                Click.on(OPT_MIS_PRODUCTOS),
                Click.on(OPT_CUENTA_PRODUCTO),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_SIGUIENTE),
                RealizarScroll.hastaPosicionDeTarget(BTN_MODIFICAR),
                Check.whether(VALOR_PAGAR.equals(opcion)).andIfSo(
                        Click.on(LNK_CAMBIAR.of(opcion)),
                        Click.on(OPT_MIS_PRODUCTOS),
                        Click.on(OPT_CUENTA_PRODUCTO),
                        Click.on(LNK_SIGUIENTE),
                        Click.on(BTN_SIGUIENTE),
                        RealizarScroll.hastaPosicionDeTarget(BTN_MODIFICAR),
                        Clear.field(TXT_VALOR),
                        Click.on(TXT_VALOR),
                        Escribir.enCampoTexto(programarFacturas.getValorFactura()),
                        Click.on(LNK_SIGUIENTE),
                        Click.on(BTN_SIGUIENTE)),
                Check.whether(PERIODICIDAD.equals(opcion)).andIfSo(
                        Click.on(LNK_CAMBIAR.of(opcion)),
                        Click.on(IMG_PERIODICIDAD),
                        Click.on(LST_FRECUENCIA_PERIODICAD),
                        Click.on(TXT_FECHA_INICIO_FIN),
                        Click.on(LST_RANGO_FECHA.of(fechaInicio)),
                        Click.on(LST_RANGO_FECHA.of(fechaFin)),
                        Click.on(BTN_SELECCIONAR),
                        Click.on(BTN_SIGUIENTE)),
                RealizarScroll.hastaPosicionDeTarget(BTN_MODIFICAR),
                Click.on(BTN_MODIFICAR)
                );
    }
}