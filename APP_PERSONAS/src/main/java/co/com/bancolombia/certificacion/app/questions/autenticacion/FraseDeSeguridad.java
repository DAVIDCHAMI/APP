package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_FRASE_DE_SEGURIDAD;

public class FraseDeSeguridad implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return !"".equalsIgnoreCase(LBL_FRASE_DE_SEGURIDAD.resolveFor(actor).getText());
    }

    public static FraseDeSeguridad usuarioInexistente() {
        return new FraseDeSeguridad();
    }
}