package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoria implements Interaction {

    private String categoria;

    public SeleccionarCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria))
        );
    }

    public static SeleccionarCategoria deSaldosMovimientos(String categoria) {
        return instrumented(SeleccionarCategoria.class, categoria);
    }
}
