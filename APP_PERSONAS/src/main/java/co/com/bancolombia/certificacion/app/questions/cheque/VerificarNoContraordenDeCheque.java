package co.com.bancolombia.certificacion.app.questions.cheque;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.LBL_RANGO_CHEQUES_INCORRECTO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarNoContraordenDeCheque implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_RANGO_CHEQUES_INCORRECTO.resolveFor(actor).isVisible();
  }

  public static VerificarNoContraordenDeCheque conRangosIncorrectos() {
    return new VerificarNoContraordenDeCheque();
  }
}
