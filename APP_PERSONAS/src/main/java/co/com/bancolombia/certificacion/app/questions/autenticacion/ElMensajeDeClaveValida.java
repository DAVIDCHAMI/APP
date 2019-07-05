package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_SALDOS;

public class ElMensajeDeClaveValida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_SALDOS.resolveFor(actor).waitUntilVisible().isVisible() ? true : false;
    }

    public static ElMensajeDeClaveValida enLaApp() {
        return new ElMensajeDeClaveValida();
    }
}
