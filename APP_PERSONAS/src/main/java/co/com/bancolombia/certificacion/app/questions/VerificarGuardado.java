package co.com.bancolombia.certificacion.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_GENERACION_EXITOSA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_GUARDADO_EXITOSO;

public class VerificarGuardado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_GUARDADO_EXITOSO.resolveFor(actor).isVisible() ||
                LBL_GENERACION_EXITOSA.resolveFor(actor).isVisible();
    }

    public static VerificarGuardado exitoso() {
        return new VerificarGuardado();
    }
}
