package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_MOVIMIENTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.interactions.eprepago.GuardarMovimientos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ConsultarMovimientosEprepago implements Task {
  private String tipoCuenta;
  private String numeroCuenta;

  public ConsultarMovimientosEprepago(String tipoCuenta, String numeroCuenta) {
    this.tipoCuenta = tipoCuenta;
    this.numeroCuenta = numeroCuenta;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarCategoria.deSaldosMovimientos(EPREPAGO.getCategoria()),
        SeleccionarProducto.desdeSaldosMovimientos(
            tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_EPREPAGO),
        Validar.carga(),
        WaitUntil.the(BTN_MOVIMIENTO, isVisible()),
        Click.on(BTN_MOVIMIENTO),
        GuardarMovimientos.deEprepago());
  }
}
