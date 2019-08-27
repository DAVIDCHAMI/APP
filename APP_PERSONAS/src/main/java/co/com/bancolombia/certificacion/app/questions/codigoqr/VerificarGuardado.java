package co.com.bancolombia.certificacion.app.questions.codigoqr;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_GENERACION_EXITOSA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_GUARDADO_EXITOSO;

public class VerificarGuardado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LBL_GUARDADO_EXITOSO).viewedBy(actor).asBoolean() ||
                Visibility.of(LBL_GENERACION_EXITOSA).viewedBy(actor).asBoolean();
    }

    public static VerificarGuardado exitoso() {
        return new VerificarGuardado();
    }
}
