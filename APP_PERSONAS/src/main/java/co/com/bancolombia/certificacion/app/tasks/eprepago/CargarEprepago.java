package co.com.bancolombia.certificacion.app.tasks.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CargarEprepago implements Task {
    private String valorRecarga;

    public CargarEprepago(String valorRecarga){this.valorRecarga = valorRecarga;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_DESPLEGAR_EPREPAGO, isVisible()),
                Click.on(BTN_DESPLEGAR_EPREPAGO),
                WaitUntil.the(BTN_SUB_MENU_EPREPAGO, isVisible()),
                Click.on(BTN_SUB_MENU_EPREPAGO),
                Click.on(BTN_RECARGAR_EPREPAGO),
                Enter.theValue(valorRecarga).into(TXT_VALOR_RECARGA)
        );
    }

    public static CargarEprepago enLaAppBancolombia(String valorRecarga){
        return instrumented(CargarEprepago.class, valorRecarga);
    }
}