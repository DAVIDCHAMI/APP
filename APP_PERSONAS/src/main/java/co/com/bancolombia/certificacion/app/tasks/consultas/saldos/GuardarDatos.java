package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static Performable deProductos() {
        return instrumented(GuardarDatos.class);
    }

}
