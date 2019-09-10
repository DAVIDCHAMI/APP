package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarDetalle {

    public static Performable deProductoCuentas(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        return instrumented(ConsultarDetalleCuentaDeposito.class, opcionCategoria, tipoCuenta, numeroCuenta);
    }

    public static Performable deProductoTarjetas(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        return instrumented(ConsultarDetalleTarjetaCredito.class, opcionCategoria, tipoCuenta, numeroCuenta);
    }
}