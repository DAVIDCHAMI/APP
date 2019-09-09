package co.com.bancolombia.certificacion.app.questions.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.Activacion_InactivacionEprepagoPage.LBL_GENERARACION_EXITOSA;

public class ActivacionEprepago implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_GENERARACION_EXITOSA.resolveFor(actor).isVisible();
    }

    public static ActivacionEprepago esExitosa(){
        return new ActivacionEprepago();
    }

}
