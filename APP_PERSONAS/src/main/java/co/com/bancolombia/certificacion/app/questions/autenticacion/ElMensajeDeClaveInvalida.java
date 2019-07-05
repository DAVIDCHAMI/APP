package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_CLAVE_INVALIDA;

public class ElMensajeDeClaveInvalida implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CLAVE_INVALIDA.resolveFor(actor).waitUntilVisible().isVisible() ? true : false;
    }

    public static ElMensajeDeClaveInvalida enLaApp() {
        return new ElMensajeDeClaveInvalida();
    }
}
