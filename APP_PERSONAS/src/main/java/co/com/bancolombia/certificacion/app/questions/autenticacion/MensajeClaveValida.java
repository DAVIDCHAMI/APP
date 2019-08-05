package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_CLAVE_INVALIDA;

public class MensajeClaveValida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return (!LBL_CLAVE_INVALIDA.resolveFor(actor).isVisible());
    }

    public static MensajeClaveValida esVisible() {
        return new MensajeClaveValida();
    }
}
