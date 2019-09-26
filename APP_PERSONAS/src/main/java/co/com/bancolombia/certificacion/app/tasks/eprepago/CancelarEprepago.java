package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OPCION_EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CancelarEprepago implements Task {

    private String opcionCategoria;

    public CancelarEprepago(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria),
                Click.on(BTN_MAS_OPCIONES_EPREPAGO),
                Click.on(OPT_EPREPAGO.of(OPCION_EPREPAGO)),
                WaitUntil.the(BTN_CANCELAR_ACTIVACION_EPREPAGO, isVisible()),
                Click.on(BTN_CANCELAR_ACTIVACION_EPREPAGO)
        );
    }

    public static CancelarEprepago enLaAppBancolombia(String opcionCategoria){
        return Tasks.instrumented(CancelarEprepago.class,opcionCategoria);
    }
}