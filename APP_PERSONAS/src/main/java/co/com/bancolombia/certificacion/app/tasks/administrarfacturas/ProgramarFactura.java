package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.recaudos.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;

public class ProgramarFactura  extends PagarProgramarFactura {
    private Factura factura;

    public ProgramarFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha[] = factura.getFechaInicioFin().split("-");
        String fechaInicio = fecha[0];
        String fechaFin = fecha[1];
        actor.attemptsTo(
                SeleccionarOpcionFactura.conInformacion(OPT_PROGRAMAR, factura.getValorFactura(), factura.getFechaFactura(), factura.getEmpresaServicio()),
                Click.on(OPT_MIS_PRODUCTOS),
                RealizarScroll.hastaPosicionDeTarget(OPT_CUENTA_PRODUCTO.of(factura.getProducto().
                        getTipo(), factura.getProducto().getNumero())),
                Click.on(OPT_CUENTA_PRODUCTO.of(factura.getProducto().
                        getTipo(), factura.getProducto().getNumero())),
                Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getPeriodicidad())),
                Click.on(LST_NUMERO_INTENTOS),
                Click.on(LST_INTENTOS_PAGO.of(factura.getNumeroIntento())),
                RealizarScroll.hastaPosicionDeTarget(TXT_FECHA_INICIO_FIN),
                RealizarScroll.adicional(TXT_FECHA_INICIO_FIN),
                Click.on(TXT_FECHA_INICIO_FIN),
                Click.on(LST_RANGO_FECHA.of(fechaInicio)),
                Click.on(LST_RANGO_FECHA.of(fechaFin)),
                Click.on(BTN_SELECCIONAR),
                Click.on(BTN_SIGUIENTE),
                RealizarScroll.hastaPosicionDeTarget(CHK_ACEPTO_TERMINOS),
                RealizarScroll.adicional(CHK_ACEPTO_TERMINOS),
                Click.on(CHK_ACEPTO_TERMINOS),
                Click.on(BTN_PROGRAMAR)
        );
    }
}