package co.com.bancolombia.certificacion.app.questions.registro;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.RegistroPage.LBL_INICIA_REGISTRO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarPantalla implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_INICIA_REGISTRO.resolveFor(actor).isVisible();
  }

  public static VerificarPantalla inicioRegistro() {
    return new VerificarPantalla();
  }
}
