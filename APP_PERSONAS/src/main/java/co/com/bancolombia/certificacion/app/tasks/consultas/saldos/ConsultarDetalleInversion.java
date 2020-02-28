package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import static co.com.bancolombia.certificacion.app.models.builders.InversionBuilder.inversion;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.LBL_SALDO_DISPONIBLE_INVERSION;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.LBL_SALDO_TOTAL_INVERSION;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_INVERSION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.INVERSIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ConsultarDetalleInversion implements Task {
  private String tipoCuenta;
  private String numeroCuenta;

  public ConsultarDetalleInversion(String tipoCuenta, String numeroCuenta) {
    this.tipoCuenta = tipoCuenta;
    this.numeroCuenta = numeroCuenta;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarCategoria.deSaldosMovimientos(INVERSIONES.getCategoria()),
        SeleccionarProducto.desdeSaldosMovimientos(
            tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_INVERSION),
        WaitUntil.the(BTN_DETALLE_PRODUCTO, isVisible()),
        Click.on(BTN_DETALLE_PRODUCTO));
    actor.remember(
        MODELO_DETALLE_PRODUCTO,
        elProducto()
            .conNumero(numeroCuenta)
            .conTipoCuenta(tipoCuenta)
            .conInversion(
                inversion()
                    .conSaldoDisponible(LBL_SALDO_DISPONIBLE_INVERSION.resolveFor(actor).getText())
                    .conSaldoTotal(LBL_SALDO_TOTAL_INVERSION.resolveFor(actor).getText())
                    .build())
            .build());
  }
}
