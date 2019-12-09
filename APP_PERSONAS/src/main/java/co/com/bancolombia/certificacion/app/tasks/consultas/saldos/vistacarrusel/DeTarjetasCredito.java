package co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoriaVistaCarrusel;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductosVistaCarrusel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
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

public class DeTarjetasCredito implements Task {
    private static final Logger LOGGER = LogManager.getLogger(RevisarProductosVistaCarrusel.class);
    private String opcionCategoria;

    public DeTarjetasCredito() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Producto> listaProductos = new ArrayList<>();
        int iterador = 0;
        int contadorProductos = 0;
        boolean tieneProducto = false;

        actor.attemptsTo(
                Click.on(BTN_VISTA_CARRUSEL),
                SeleccionarCategoriaVistaCarrusel.deSaldosMovimientos("Tarjetas de crédito")
        );

        if (elementoPresente(actor, CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL.of(String.valueOf(iterador)))) {
            while (elementoPresente(actor, CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL.of(String.valueOf(iterador)))) {
                actor.attemptsTo(
                        RealizarScroll.hastaPosicionDeTarget(CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL.of(String.valueOf(iterador)))
                );
                iterador = iterador + 1;
            }
        } else {
            LOGGER.info("No posee productos depósito");
        }
    }
}