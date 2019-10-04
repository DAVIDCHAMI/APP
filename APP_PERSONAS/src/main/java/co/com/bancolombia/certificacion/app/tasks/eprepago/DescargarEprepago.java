package co.com.bancolombia.certificacion.app.tasks.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DescargarEprepago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_DESPLEGAR_EPREPAGO, isVisible()),
                Click.on(BTN_DESPLEGAR_EPREPAGO),
                WaitUntil.the(BTN_SUB_MENU_EPREPAGO, isVisible()),
                Click.on(BTN_SUB_MENU_EPREPAGO)
        );
    }

    public static DescargarEprepago enLaAppBancolombia(){
        return instrumented(DescargarEprepago.class);
    }
}