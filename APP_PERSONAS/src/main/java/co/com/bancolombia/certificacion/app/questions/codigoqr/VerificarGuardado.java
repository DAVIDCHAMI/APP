package co.com.bancolombia.certificacion.app.questions.codigoqr;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LBL_GUARDADO_EXITOSO;

public class VerificarGuardado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_GUARDADO_EXITOSO.resolveFor(actor).isVisible();
    }

    public static VerificarGuardado exitoso() {
        return new VerificarGuardado();
    }
}
