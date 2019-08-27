package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;


import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CUENTAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarCategoria implements Interaction {
    private String categoria;

    public SeleccionarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static SeleccionarCategoria deSaldosMovimientos(String categoria) {
        return instrumented(SeleccionarCategoria.class, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!CUENTAS.equals(categoria)) {
            actor.attemptsTo(
                    Esperar.unTiempo(7000),
                    Scroll.to(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria)),
                    Click.on(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria)),
                    Esperar.unTiempo(5000)

            );
        }
    }
}
