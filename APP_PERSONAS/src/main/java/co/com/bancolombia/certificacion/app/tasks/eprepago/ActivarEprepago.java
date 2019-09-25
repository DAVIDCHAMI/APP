package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.eprepago.GuardarCamposEprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.Activacion_InactivacionEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OPCION_EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ActivarEprepago implements Task {
    private String opcionCategoria;

    public ActivarEprepago(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria),
                Click.on(BTN_MAS_OPCIONES_EPREPAGO),
                Click.on(OPT_EPREPAGO.of(OPCION_EPREPAGO)),
                WaitUntil.the(BTN_GENERAR_EPREPAGO, isEnabled()),
                Click.on(BTN_GENERAR_EPREPAGO),
                Esperar.unTiempo(5000),
                GuardarCamposEprepago.esExitoso()
        );
    }

    public static ActivarEprepago enLaAppBancolombia(String opcionCategoria){
        return Tasks.instrumented(ActivarEprepago.class,opcionCategoria);
    }
}