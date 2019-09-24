package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.interactions.billetera.AceptarTerminosCondiciones;
import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.BilleteraPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class RegistrarBilletera implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(20000),
                WaitUntil.the(BTN_CONTINUAR_BILLETERA, isEnabled()),
                Click.on(BTN_CONTINUAR_BILLETERA),
                WaitUntil.the(BTN_PERMISO, isEnabled()),
                Click.on(BTN_PERMISO),
                Click.on(LNK_SALTAR),
                AceptarTerminosCondiciones.enBilletera(),
                WaitUntil.the(BTN_PERMISO, isEnabled()),
                Click.on(BTN_PERMISO),
                WaitUntil.the(LBL_TARJETAS_LISTADAS, isVisible()),
                Click.on(BTN_ACTIVAR_BILLETERA)
        );
    }

    public static Performable enApp(){
        return instrumented(RegistrarBilletera.class);
    }
}