package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoProductosEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder.saldo;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.contarCantidadCaracter;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.eliminarTildes;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisarProductos implements Task {
    private Producto producto;
    private String opcionCategoria;
    private TipoProductosEnum tipoProductosEnum;

    public RevisarProductos(Producto producto, String opcionCategoria) {
        this.producto = producto;
        this.opcionCategoria = opcionCategoria;
        this.tipoProductosEnum = TipoProductosEnum.valueOf(eliminarTildes(opcionCategoria).toUpperCase());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria)
        );
        actor.attemptsTo(
                RealizarScroll.adicional(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(opcionCategoria))
        );
        List<Producto> listaProductos = new ArrayList<>();
        int cantCaracteresTipo = contarCantidadCaracter(producto.getTipo(), ';');
        int[] cadena = new int[cantCaracteresTipo];
        boolean tieneProducto = false;
        String[] tipoCuenta = producto.getTipo().split(";");
        String[] numeroCuenta = producto.getNumero().split(";");
        for(int iterador = 0; iterador <= cadena.length; iterador++){
            if(CUENTA_ESPECIFICA_PRODUCTO.of(tipoCuenta[iterador], numeroCuenta[iterador]).resolveFor(actor).isVisible()) {
                listaProductos.add(elProducto()
                        .conNumero(numeroCuenta[iterador])
                        .conTipoCuenta(tipoCuenta[iterador])
                        .conSaldo(saldo()
                                .conSaldoDisponible(LBL_SALDO_SALDOS_MOVIMIENTOS.of(String.valueOf(iterador),tipoProductosEnum.getTipoProducto()).resolveFor(actor).getText())
                                .build())
                        .build()
                );
                tieneProducto = true;
            } else {
                tieneProducto = false;
            }
        }
        actor.remember(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS, listaProductos);
        actor.remember(TIENE_PRODUCTOS, tieneProducto);
    }

    public static Performable enSaldosMovimientos(ProductoBuilder productoBuilder, String opcionCategoria) {
        return instrumented(RevisarProductos.class, productoBuilder.build(), opcionCategoria);
    }
}