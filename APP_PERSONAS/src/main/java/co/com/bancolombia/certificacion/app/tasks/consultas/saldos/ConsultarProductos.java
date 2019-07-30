package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.AHORROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CORRIENTE;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CUENTA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIPO_CUENTA;

public class ConsultarProductos implements Task {
    String tipoCuenta;
    String numeroCuenta;

    public ConsultarProductos(String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_PRODUCTO)
        );
        actor.remember(NUMERO_CUENTA, numeroCuenta);
        if (tipoCuenta.contains(AHORROS))
            actor.remember(TIPO_CUENTA, AHORROS);
        else
            actor.remember(TIPO_CUENTA, CORRIENTE);
    }

    public static ConsultarProductos conInformacion(String tipoCuenta, String numeroCuenta) {
        return Tasks.instrumented(ConsultarProductos.class, tipoCuenta, numeroCuenta);
    }
}
