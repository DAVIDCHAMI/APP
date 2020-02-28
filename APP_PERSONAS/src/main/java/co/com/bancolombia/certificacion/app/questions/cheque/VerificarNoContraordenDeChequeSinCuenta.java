package co.com.bancolombia.certificacion.app.questions.cheque;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.LBL_CONTRAORDEN_SIN_CUENTA_CORRIENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerificarNoContraordenDeChequeSinCuenta implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    actor.attemptsTo(WaitUntil.the(LBL_CONTRAORDEN_SIN_CUENTA_CORRIENTE, isVisible()));
    return LBL_CONTRAORDEN_SIN_CUENTA_CORRIENTE.resolveFor(actor).isVisible();
  }

  public static VerificarNoContraordenDeChequeSinCuenta corriente() {
    return new VerificarNoContraordenDeChequeSinCuenta();
  }
}
