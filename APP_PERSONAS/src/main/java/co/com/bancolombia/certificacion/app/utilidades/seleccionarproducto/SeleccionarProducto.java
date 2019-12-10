package co.com.bancolombia.certificacion.app.utilidades.seleccionarproducto;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductosVistaCarrusel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder.saldo;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoPresente;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_DEPOSITOS_VISTA_CARRUSEL;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_PRODUCTOS;

public class SeleccionarProducto implements Interaction {
    private static final Logger LOGGER = LogManager.getLogger(RevisarProductosVistaCarrusel.class);

    Target saldoDisponible;
    Target tipoCuenta;
    Target numeroCuenta;

    public SeleccionarProducto(Target saldoDisponible, Target tipoCuenta, Target numeroCuenta) {
        this.saldoDisponible = saldoDisponible;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Producto> listaProductos = new ArrayList<>();
        int iterador = 1;
        int contadorProductos = 0;

        if (elementoPresente(actor, saldoDisponible.of(String.valueOf(iterador)))) {
            while (elementoPresente(actor, saldoDisponible.of(String.valueOf(iterador)))) {
                actor.attemptsTo(
                        RealizarScroll.hastaPosicionDeTarget(saldoDisponible.of(String.valueOf(iterador)))
                );
                contadorProductos = contadorProductos + 1;
                listaProductos.add(elProducto()
                        .conNumero(numeroCuenta.of(String.valueOf(iterador)).resolveFor(actor).getText())
                        .conTipoCuenta(tipoCuenta.of(String.valueOf(iterador)).resolveFor(actor).getText())
                        .conSaldo(saldo()
                                .conSaldoDisponible(saldoDisponible.of(String.valueOf(iterador)).resolveFor(actor).getText())
                                .build())
                        .build()
                );
                iterador = iterador + 1;
            }
        } else {
            LOGGER.info("No posee productos depósito");
        }
        actor.remember(MODELO_PRODUCTO_SALDOS_DEPOSITOS_VISTA_CARRUSEL, listaProductos);
        actor.remember(NUMERO_PRODUCTOS, contadorProductos);
    }

    public static SeleccionarProducto deVistaCarrusel(Target saldoDisponible, Target tipoTarjeta, Target numeroCuenta) {
        return new SeleccionarProducto(saldoDisponible, tipoTarjeta, numeroCuenta);
    }
}
