package co.com.bancolombia.certificacion.app.tasks.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.BTN_SOLICITAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.CHK_TYC;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SolicitarEprepago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHK_TYC),
                Click.on(BTN_SOLICITAR_EPREPAGO));
    };

    public static SolicitarEprepago enLaAppBancolombia(){
        return instrumented(SolicitarEprepago.class);
    }
}