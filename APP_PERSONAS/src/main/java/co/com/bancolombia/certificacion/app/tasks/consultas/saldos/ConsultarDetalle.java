package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder.saldo;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_DEVOLVER_PANTALLA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarDetalle implements Task {
    private String opcionCategoria;
    private String tipoCuenta;
    private String numeroCuenta;

    public ConsultarDetalle(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.opcionCategoria = opcionCategoria;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria),
                ConsultarProductos.sinMovimientosConInformacion(tipoCuenta, numeroCuenta),
                WaitUntil.the(BTN_DETALLE_PRODUCTO, isVisible()),
                Click.on(BTN_DETALLE_PRODUCTO)
        );
        actor.attemptsTo(
                Esperar.unTiempo(2000),
                RealizarScroll.hastaTargetVisible(LBL_SALDO_TOTAL_DETALLE)
        );

        actor.remember(MODELO_DETALLE_PRODUCTO, elProducto()
                .conNumero(numeroCuenta)
                .conTipoCuenta(tipoCuenta)
                .conSaldo(
                        saldo()
                                .conSaldoDisponible(LBL_SALDO_DISPONIBLE_DETALLE.resolveFor(actor).getText())
                                .conSaldoEnCanje(LBL_SALDO_CANJE_DETALLE.resolveFor(actor).getText())
                                .conSaldoTotal(LBL_SALDO_TOTAL_DETALLE.resolveFor(actor).getText())
                                .build())
                .build()
        );
        actor.attemptsTo(
                Esperar.unTiempo(8000),
                Click.on(BTN_DEVOLVER_PANTALLA)
        );


    }

    public static Performable deProducto(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        return instrumented(ConsultarDetalle.class, opcionCategoria, tipoCuenta, numeroCuenta);
    }
}
