package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarDetalle implements Task {
    String tipoCuenta;
    String numeroCuenta;

    public ConsultarDetalle(String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ConsultarProductos.sinMovimientosConInformacion(tipoCuenta, numeroCuenta),
                WaitUntil.the(BTN_DETALLE_PRODUCTO, isVisible()),
                Click.on(BTN_DETALLE_PRODUCTO)
        );
        actor.remember(TIPO_CUENTA, tipoCuenta);
        actor.remember(NUMERO_CUENTA,numeroCuenta);
        actor.remember(SALDO_DISPONIBLE, LBL_SALDO_DISPONIBLE.resolveFor(actor).getText());
    }

    public static Performable deProducto(String tipoCuenta, String numeroCuenta){
        return instrumented(ConsultarDetalle.class, tipoCuenta, numeroCuenta);
    }
}
