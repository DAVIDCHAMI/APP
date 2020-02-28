package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;

public class ConsultarDetalle {

  public static Performable deProductoCuentas(
      String opcionCategoria, String tipoCuenta, String numeroCuenta) {
    return instrumented(
        ConsultarDetalleCuentaDeposito.class, opcionCategoria, tipoCuenta, numeroCuenta);
  }

  public static Performable deEprepago(
      String opcionCategoria, String tipoCuenta, String numeroCuenta) {
    return instrumented(ConsultarDetalleEprepago.class, opcionCategoria, tipoCuenta, numeroCuenta);
  }

  public static Performable deProductoTarjetas(String tipoCuenta, String numeroCuenta) {
    return instrumented(ConsultarDetalleTarjetaCredito.class, tipoCuenta, numeroCuenta);
  }

  public static Performable deEcard(String tipoTarjeta, String numeroTarjeta) {
    return instrumented(ConsultarDetalleTarjetaEcard.class, tipoTarjeta, numeroTarjeta);
  }

  public static Performable deCreditosConsumo(
      String opcionCategoria, String tipoCuenta, String numeroCuenta) {
    return instrumented(
        ConsultarDetalleCreditoConsumo.class, opcionCategoria, tipoCuenta, numeroCuenta);
  }

  public static Performable deCrediagil(String opcionCategoria) {
    return instrumented(ConsultaDetalleCrediagil.class, opcionCategoria);
  }

  public static Performable deInversion(String tipoCuenta, String numeroCuenta) {
    return instrumented(ConsultarDetalleInversion.class, tipoCuenta, numeroCuenta);
  }
}
