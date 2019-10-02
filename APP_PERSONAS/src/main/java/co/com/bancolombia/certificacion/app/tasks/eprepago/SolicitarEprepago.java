package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.BTN_SOLICITAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.CHK_TYC;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SolicitarEprepago implements Task {

    public SolicitarEprepago(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        ConfiguracionTransaccion usuario = actor.recall(MODELO_DATOS_TRANSACCION);

        actor.attemptsTo(
                WaitUntil.the(CHK_TYC, isVisible()),
                Click.on(CHK_TYC),
                WaitUntil.the(BTN_SOLICITAR_EPREPAGO, isEnabled()),
                Click.on(BTN_SOLICITAR_EPREPAGO)
        );
    }

    public static SolicitarEprepago enLaAppBancolombia(){
        return instrumented(SolicitarEprepago.class);
    }
}