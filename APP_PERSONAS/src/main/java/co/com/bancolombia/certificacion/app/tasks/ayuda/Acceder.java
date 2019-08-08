package co.com.bancolombia.certificacion.app.tasks.ayuda;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.ayuda.AyudaPage.BTN_OPCION;
import static co.com.bancolombia.certificacion.app.userinterface.pages.ayuda.AyudaPage.LNK_AYUDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Acceder implements Task {
    private String opcionAyuda;

    public Acceder(String opcionAyuda) {
        this.opcionAyuda = opcionAyuda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_AYUDA),
                ScrollHasta.elTarget(BTN_OPCION.of(opcionAyuda)),
                Click.on(BTN_OPCION.of(opcionAyuda))
        );
    }

    public static Acceder menu(String opcionAyuda) {
        return instrumented(Acceder.class, opcionAyuda);
    }
}
