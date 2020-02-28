package co.com.bancolombia.certificacion.app.questions.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_CLAVE_INVALIDA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeClaveInvalida implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_CLAVE_INVALIDA.resolveFor(actor).isVisible();
  }

  public static MensajeClaveInvalida esVisible() {
    return new MensajeClaveInvalida();
  }
}
