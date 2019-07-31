package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.contarCantidadCaracter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisarProductos implements Task {
    private Producto producto;
    private String opcionCategoria;

    public RevisarProductos(Producto producto, String opcionCategoria) {
        this.producto = producto;
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria)
        );
        int cantCaracteresTipo = contarCantidadCaracter(producto.getTipo(), ';');
        int[] cadena = new int[cantCaracteresTipo];
        boolean tieneProducto = false;
        String[] tipoCuenta = producto.getTipo().split(";");
        String[] numeroCuenta = producto.getNumero().split(";");
        for(int iterador = 0; iterador <= cadena.length; iterador++){
            if(CUENTA_ESPECIFICA_PRODUCTO.of(tipoCuenta[iterador], numeroCuenta[iterador]).resolveFor(actor).isVisible()) {
                tieneProducto = true;
            } else {
                tieneProducto = false;
            }
        }
        actor.remember(TIENE_PRODUCTOS, tieneProducto);
    }

    public static Performable enSaldosMovimientos(ProductoBuilder productoBuilder, String opcionCategoria) {
        return instrumented(RevisarProductos.class, productoBuilder.build(), opcionCategoria);
    }
}