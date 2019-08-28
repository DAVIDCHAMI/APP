package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.LBL_MENSAJE_MODIFICACION;

public class VerificarModificacionFacturas implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LBL_MENSAJE_MODIFICACION).viewedBy(actor).asBoolean();
    }

    public static VerificarModificacionFacturas programadas(){
        return new VerificarModificacionFacturas();
    }
}