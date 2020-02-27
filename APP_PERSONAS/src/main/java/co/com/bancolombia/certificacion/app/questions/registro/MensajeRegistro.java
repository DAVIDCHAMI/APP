package co.com.bancolombia.certificacion.app.questions.registro;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.RegistroPage.LBL_VALIDACION_REGISTRO_OK;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRegistro implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_VALIDACION_REGISTRO_OK.resolveFor(actor).waitUntilVisible().isVisible();
  }

  public static MensajeRegistro exitoso() {
    return new MensajeRegistro();
  }
}
