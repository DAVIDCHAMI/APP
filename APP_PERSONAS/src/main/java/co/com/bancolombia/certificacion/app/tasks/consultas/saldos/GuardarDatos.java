package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder.saldo;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.LISTA_CUENTAS_DEPOSITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int iterador = 0;
        List<Producto> listaProductos = new ArrayList<>();
        while (CONTENEDOR_INFORMACION_PRODUCTO.of(String.valueOf(iterador)).resolveFor(actor).isPresent()) {
            listaProductos.add(elProducto()
                    .conTipoCuenta(LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conNumero(LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conSaldo(
                            saldo()
                            .conSaldoDisponible(LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS.of(String.valueOf(iterador)).resolveFor(actor).getText()).build())
                    .build());
            iterador++;
        }
        actor.remember(LISTA_CUENTAS_DEPOSITO, listaProductos);
    }

    public static Performable deProductos() {
        return instrumented(GuardarDatos.class);
    }
}
