package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Activar;
import co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DescargarEprepago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Activar.huella(),
                WaitUntil.the(BTN_SUB_MENU_EPREPAGO, isVisible()),
                Click.on(BTN_SUB_MENU_EPREPAGO),
                Click.on(BTN_DESCARGAR_EPREPAGO),
                Click.on(BTN_DESCARGA_TOTAL_EPREPAGO),
                WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_DESCARGAR_EPREPAGO)


        );
    }

    public static DescargarEprepago enLaAppBancolombia(){
        return instrumented(DescargarEprepago.class);
    }
}