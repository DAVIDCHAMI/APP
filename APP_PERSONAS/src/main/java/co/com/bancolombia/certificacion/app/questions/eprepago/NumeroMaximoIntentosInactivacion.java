package co.com.bancolombia.certificacion.app.questions.eprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.LBL_NUMERO_MAXIMO_INACTIVACIONES;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumeroMaximoIntentosInactivacion implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return elementoVisible(actor, LBL_NUMERO_MAXIMO_INACTIVACIONES);
  }

  public static NumeroMaximoIntentosInactivacion ePrepago() {
    return new NumeroMaximoIntentosInactivacion();
  }
}
