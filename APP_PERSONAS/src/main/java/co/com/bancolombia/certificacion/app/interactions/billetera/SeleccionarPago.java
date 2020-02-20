package co.com.bancolombia.certificacion.app.interactions.billetera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.RegistroBilletera.BTN_PAGAR_CON_BILLETERA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarPago implements Interaction {

    public static Performable conBilletera() {
        return instrumented(SeleccionarPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(BTN_PAGAR_CON_BILLETERA.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_PAGAR_CON_BILLETERA)
                )
        );
    }
}
