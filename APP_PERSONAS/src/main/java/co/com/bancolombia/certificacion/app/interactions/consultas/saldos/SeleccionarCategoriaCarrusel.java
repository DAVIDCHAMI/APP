package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder.saldo;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoPresente;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS_VISTA_CARRUSEL;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoriaCarrusel implements Interaction {
    private static final Logger LOGGER = LogManager.getLogger(SeleccionarCategoriaCarrusel.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Producto> listaProductos = new ArrayList<>();
        int iterador =1;
        int contadorProductos=0;
        boolean tieneProducto = false;

        actor.attemptsTo(Click.on(BTN_VISTA_CARRUSEL));

        if (elementoPresente(actor, LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL.of(String.valueOf(iterador)))) {
            while (elementoPresente(actor, LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL.of(String.valueOf(iterador)))) {
                actor.attemptsTo(
                        RealizarScroll.hastaPosicionDeTarget(LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL.of(String.valueOf(iterador)))
                );
                contadorProductos=contadorProductos+1;
                listaProductos.add(elProducto()
                        .conNumero(LBL_NUMERO_CUENTA_VISTA_CARRUSEL.of(String.valueOf(iterador)).resolveFor(actor).getText())
                        .conTipoCuenta(LBL_TIPO_CUENTA_VISTA_CARRUSEL.of(String.valueOf(iterador)).resolveFor(actor).getText())
                        .conSaldo(saldo()
                                .conSaldoDisponible(LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL.of(String.valueOf(iterador)).resolveFor(actor).getText())
                                .build())
                        .build()
                );
                iterador = iterador + 1;
            }
        }else{
            LOGGER.info("No posee productos depósito");
        }
        actor.remember(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS_VISTA_CARRUSEL, listaProductos);
        actor.remember(NUMERO_PRODUCTOS, contadorProductos);
    }

    public static SeleccionarCategoriaCarrusel deSaldosMovimientos() {
        return instrumented(SeleccionarCategoriaCarrusel.class);
    }
}