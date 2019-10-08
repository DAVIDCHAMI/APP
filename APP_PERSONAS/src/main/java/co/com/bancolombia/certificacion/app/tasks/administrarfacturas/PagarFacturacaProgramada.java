package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_PAGAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ConsultaDetalleFacturaPage.OPT_PAGAR_FACTURA_PROGRAMADA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.SELECCIONAR_TODAS;

public class PagarFacturacaProgramada implements Task {
    Factura factura;
    String opcion;

    public PagarFacturacaProgramada(Factura factura, String opcion) {
        this.factura = factura;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Saltar.onBoarding(),
                Click.on(OPT_PROGRAMADAS),
                RealizarScroll.hastaPosicionDeTarget(OPT_PAGAR_FACTURA_PROGRAMADA.of(factura.getValorFactura(),
                        factura.getFechaFactura(),
                        factura.getEmpresaServicio())),
                Click.on(OPT_PAGAR_FACTURA_PROGRAMADA.of(factura.getValorFactura(),
                        factura.getFechaFactura(),
                        factura.getEmpresaServicio())),
                Click.on(OPT_CUENTA_PRODUCTO.of(factura.getProducto().
                        getTipo(), factura.getProducto().getNumero())),
                Check.whether(opcion.contains(SELECCIONAR_TODAS)).andIfSo(
                        Click.on(CHK_SELECCIONAR_TODAS_FACTURAS)
                ).otherwise(
                        Click.on(CHk_SELECCIONAR_FACTURA.of(factura.getValorFactura(), factura.getFechaVencimiento(), factura.getReferencia()))
                ),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_PAGAR));
    }
}
