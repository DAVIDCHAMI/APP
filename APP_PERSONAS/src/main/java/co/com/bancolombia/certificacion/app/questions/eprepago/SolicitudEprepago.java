package co.com.bancolombia.certificacion.app.questions.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.LBL_SOLICITUD_EPREPAGO_EXITOSA;

public class SolicitudEprepago implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_SOLICITUD_EPREPAGO_EXITOSA.resolveFor(actor).waitUntilVisible().isVisible();
    }

    public static SolicitudEprepago esExitosa(){
        return new SolicitudEprepago();
    }
}