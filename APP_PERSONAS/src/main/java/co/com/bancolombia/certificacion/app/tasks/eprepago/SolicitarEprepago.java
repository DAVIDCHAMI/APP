package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SOLICITAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.CHK_TYC_EPREPAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SolicitarEprepago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Validar.carga(),
                Click.on(CHK_TYC_EPREPAGO),
                WaitUntil.the(LNK_SOLICITAR, isEnabled()),
                Click.on(LNK_SOLICITAR)
        );
    }

    public static SolicitarEprepago enLaAppBancolombia(){
        return instrumented(SolicitarEprepago.class);
    }
}