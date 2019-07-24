package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_CERRAR_MODAL_CLAVE_NO_VALIDA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_CLAVE_INVALIDA;

public class MensajeClaveInvalida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if (LBL_CLAVE_INVALIDA.resolveFor(actor).isVisible() || BTN_CERRAR_MODAL_CLAVE_NO_VALIDA.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(BTN_CERRAR_MODAL_CLAVE_NO_VALIDA)
            );
            return true;
        } else
            return false;
    }

    public static MensajeClaveInvalida esVisible() {
        return new MensajeClaveInvalida();
    }
}
