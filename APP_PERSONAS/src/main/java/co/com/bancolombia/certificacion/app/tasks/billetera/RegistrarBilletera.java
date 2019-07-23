package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import co.com.bancolombia.certificacion.app.interactions.billetera.AceptarTerminosCondiciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.BilleteraPage.BTN_ACTIVAR_BILLETERA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.BilleteraPage.LBL_TARJETAS_LISTADAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarBilletera implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AceptarTerminosCondiciones.enBilletera(),
                WaitUntil.the(LBL_TARJETAS_LISTADAS, isVisible()),
                ScrollHasta.elTarget(BTN_ACTIVAR_BILLETERA),
                Click.on(BTN_ACTIVAR_BILLETERA)
        );
    }

    public static Performable enApp(){
        return instrumented(RegistrarBilletera.class);
    }
}
