package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarMovimientos {

    public static Performable deCuentas(String tipoCuenta, String numeroCuenta){
        return instrumented(ConsultarMovimientosCuentas.class, tipoCuenta, numeroCuenta);
    }

    public static Performable deTarjetasCredito(String tipoCuenta, String numeroCuenta){
        return instrumented(ConsultarMovimientosTarjetas.class, tipoCuenta, numeroCuenta);
    }

    public static Performable deEprepago(String tipoCuenta, String numeroCuenta){
        return instrumented(ConsultarMovimientosEprepago.class, tipoCuenta, numeroCuenta);
    }
}