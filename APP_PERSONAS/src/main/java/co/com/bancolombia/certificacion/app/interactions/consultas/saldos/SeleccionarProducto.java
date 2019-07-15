package co.com.bancolombia.certificacion.app.interactions.consultas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static Performable desdeSaldosMovimientos(){
        return instrumented(SeleccionarProducto.class);
    }
}
