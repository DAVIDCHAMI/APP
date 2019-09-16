package co.com.bancolombia.certificacion.app.tasks.cheque;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;

public class ContraordenarCheque implements Task {
  String numeroCuenta;
  String tipoCuenta;

   public ContraordenarCheque(String numeroCuenta, String tipoCuenta){
       this.numeroCuenta=numeroCuenta;
       this.tipoCuenta=tipoCuenta;
   }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_PRODUCTO)
        );

    }

    public static ContraordenarCheque conInfo(String numeroCuenta,String tipoCuenta){
        return Tasks.instrumented(ContraordenarCheque.class, numeroCuenta, tipoCuenta);
    }
}