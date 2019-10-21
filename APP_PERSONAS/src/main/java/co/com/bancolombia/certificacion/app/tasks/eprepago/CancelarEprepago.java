package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OPCION_EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CancelarEprepago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Validar.carga(),
                RealizarScroll.hastaTargetVisible(BTN_ACTIVAR_EPREPAGO),
                Click.on(BTN_ACTIVAR_EPREPAGO),
                WaitUntil.the(BTN_CANCELAR_ACTIVACION_EPREPAGO, isEnabled()),
                Click.on(BTN_CANCELAR_ACTIVACION_EPREPAGO)
        );
    }

    public static CancelarEprepago enLaAppBancolombia() {
        return Tasks.instrumented(CancelarEprepago.class);
    }
}