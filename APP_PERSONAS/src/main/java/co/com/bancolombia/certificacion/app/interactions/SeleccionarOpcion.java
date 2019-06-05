package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarOpcion implements Interaction {


    private Target target;

    public SeleccionarOpcion(Target target) {

        this.target = target;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElementFacade we = target.resolveFor(actor);

        we.waitUntilVisible();
        we.click();

    }

    public static SeleccionarOpcion en(Target target) {
        return Tasks.instrumented(SeleccionarOpcion.class, target);
    }

}
