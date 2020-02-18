package co.com.bancolombia.certificacion.app.tasks.billetera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.BTN_BILLETERA_PAGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPago implements Task {

    public static Performable conBilletera(){
        return instrumented(RealizarPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BILLETERA_PAGAR)
        );
    }
}
