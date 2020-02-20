package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.DatosPagoBilletera.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.BTN_BILLETERA_PAGAR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_BILLETERA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PrepararPagoConBilletera implements Task {
    private DatosPagoBilletera datosPagoBilletera;

    public PrepararPagoConBilletera(DatosPagoBilletera datosPagosBilletera) {
        this.datosPagoBilletera = datosPagosBilletera;
    }

    public static Performable conQrEstatico(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder) {
        return instrumented(PrepararPagoConBilletera.class, datosPagoBilleteraBuilder);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> informacionPago = new ArrayList<>();
        actor.attemptsTo(
                Enter.theValue(datosPagoBilletera.getTotalPagar()).into(TXT_INGRESAR_VALOR_PAGO),
                Check.whether(datosPagoBilletera.getPropina().isEmpty()).andIfSo(
                ).otherwise(
                        Click.on(TXT_INGRESAR_VALOR_PROPINA),
                        Enter.theValue(datosPagoBilletera.getPropina()).into(TXT_INGRESAR_VALOR_PROPINA)
                ),
                Click.on(BTN_SIGUIENTE_PAGO)
        );
        actor.attemptsTo(
                WaitUntil.the(LBL_VERIFICAR_PAGO, isVisible())
        );
        if(Verificar.elementoVisible(actor, LBL_VERIFICAR_PAGO)){
            informacionPago.add(LBL_NOMBRE_ESTABLECIMIENTO_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_TIPO_TARJETA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_NUMERO_TARJETA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_SUBTOTAL_PAGO_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_IVA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_INC_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_PROPINA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_TOTAL_PAGADO_VERIFICAR.resolveFor(actor).getText());
        }
        if(datosPagoBilletera.getInfoPagoDeBilletera().equals(informacionPago)){
            actor.remember(MODELO_BILLETERA, informacionPago);
        }
    }
}