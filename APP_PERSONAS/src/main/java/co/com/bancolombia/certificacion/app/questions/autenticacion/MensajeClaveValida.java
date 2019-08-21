package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_SALDO_DISPONIBLE;

public class MensajeClaveValida implements Question<Boolean> {

    public static MensajeClaveValida esVisible() {
        return new MensajeClaveValida();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (LBL_SALDO_DISPONIBLE.resolveFor(actor).isVisible());
    }
}
