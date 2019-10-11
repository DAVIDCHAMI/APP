package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.eprepago.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_PRODUCTO_ORIGEN;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.DESCARGA_EPREPAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DescargarSaldo implements Task {
    private String opcionMenu;
    private Producto producto;

    public DescargarSaldo(Producto producto, String opcionMenu) {
        this.opcionMenu = opcionMenu;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionMenu),
                SeleccionarOpcion.deSubmenu(DESCARGA_EPREPAGO)
        );
        actor.attemptsTo(
                Check.whether(Verificar.elementoVisible(actor, LBL_PRODUCTO_DESTINO_EPREPAGO))
                        .andIfSo(
                                RealizarScroll.hastaTargetVisible(BTN_PRODUCTO_ORIGEN.of(producto.getTipo(), producto.getNumero())),
                                Click.on(BTN_PRODUCTO_ORIGEN.of(producto.getTipo(), producto.getNumero()))
                        ),
                WaitUntil.the(CHK_DESCARGA_TOTAL_EPREPAGO, isEnabled()),
                Click.on(CHK_DESCARGA_TOTAL_EPREPAGO),
                WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_DESCARGAR_EPREPAGO),
                Validar.carga()
        );
    }

    public static DescargarSaldo totalDeLaTarjetaCon(ProductoBuilder producto, String opcionMenu) {
        return instrumented(DescargarSaldo.class, producto.build(), opcionMenu);
    }
}