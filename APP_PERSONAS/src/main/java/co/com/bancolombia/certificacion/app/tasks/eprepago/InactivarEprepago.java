package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OPCION_INACTIVAR_EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class InactivarEprepago implements Task {

    private String opcionCategoria;

    public InactivarEprepago(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria),
                Click.on(BTN_MAS_OPCIONES_EPREPAGO),
                Click.on(OPT_EPREPAGO.of(OPCION_INACTIVAR_EPREPAGO)),
                WaitUntil.the(BTN_INACTIVAR_EPREPAGO, isEnabled()),
                Click.on(BTN_INACTIVAR_EPREPAGO)
                );
    }

    public static InactivarEprepago enLaAppBancolombia(String opcionCategoria){
        return Tasks.instrumented(InactivarEprepago.class,opcionCategoria);
    }
}
