package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.Scroll;
import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.saldo.Saldo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CUENTAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int iterador = 0;
        Producto producto = new Producto();
        List<Producto> listaProductos = new ArrayList<>();
        Saldo saldo = new Saldo();
        actor.attemptsTo(
                Scroll.hastaTargetVisible(OPCION_CATEGORIA_PRODUCTOS.of(CUENTAS))
                //ScrollHasta.elTarget(OPT_CATEGORIA_PRODUCTOS.of(CUENTAS))
        );
        while(CONTENEDOR_INFORMACION_PRODUCTO.of(String.valueOf(iterador)).resolveFor(actor).isPresent()){
            producto.setTipo(LBL_TIPO_CUENTA.resolveFor(actor).getText());
            producto.setNumero(LBL_NUMERO_CUENTA.resolveFor(actor).getText());
            saldo.setSaldoTotal(Double.parseDouble(LBL_SALDO_DISPONIBLE.resolveFor(actor).getText()));
            producto.setSaldo(saldo.getSaldo());
            System.out.println(producto.getTipo());
            System.out.println(producto.getNumero());
            System.out.println(producto.getNumero());
            listaProductos.add(producto);
            iterador++;
        }
    }

    public static Performable deProductos() {
        return instrumented(GuardarDatos.class);
    }

}
