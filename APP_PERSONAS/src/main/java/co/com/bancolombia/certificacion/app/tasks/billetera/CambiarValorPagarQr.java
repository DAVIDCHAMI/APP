package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.DatosPagoBilletera.TXT_INGRESAR_VALOR_PAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.DatosPagoBilletera.TXT_INGRESAR_VALOR_PROPINA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.BTN_CAMBIAR_VALOR_VERIFICAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CambiarValorPagarQr implements Task {
    private DatosPagoBilletera datosPagoBilletera;

    public CambiarValorPagarQr(DatosPagoBilletera datosPagoBilletera){
        this.datosPagoBilletera = datosPagoBilletera;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CAMBIAR_VALOR_VERIFICAR),
                WaitUntil.the(TXT_INGRESAR_VALOR_PAGO, isVisible()),
                Click.on(TXT_INGRESAR_VALOR_PAGO),
                Enter.theValue(datosPagoBilletera.getTotalPagar()).into(TXT_INGRESAR_VALOR_PAGO),
                Check.whether(!datosPagoBilletera.getPropina().equals("")).andIfSo(
                        Click.on(TXT_INGRESAR_VALOR_PROPINA),
                        Enter.theValue(datosPagoBilletera.getPropina()).into(TXT_INGRESAR_VALOR_PROPINA)
                )
        );
    }
}
