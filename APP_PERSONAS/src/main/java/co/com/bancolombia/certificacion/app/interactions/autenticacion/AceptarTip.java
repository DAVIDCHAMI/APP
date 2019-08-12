package co.com.bancolombia.certificacion.app.interactions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptarTip implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(TIP_BOTON_SIGUIENTE_TRANSACCIONES.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(TIP_BOTON_CERRAR_TIP)
                )
        );
    }

    public static Performable alIniciarApp() {
        return instrumented(AceptarTip.class);
    }
}
