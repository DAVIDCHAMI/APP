package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Interaction {
    private String tipoCuenta;
    private String numeroCuenta;

    public SeleccionarProducto(String tipoCuenta, String numeroCuenta){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CUENTA_ESPECIFICA_PRODUCTO.of(tipoCuenta, numeroCuenta))
        );
    }

    public static Performable desdeSaldosMovimientos(String tipoCuenta, String numeroCuenta){
        return instrumented(SeleccionarProducto.class, tipoCuenta, numeroCuenta);
    }
}
