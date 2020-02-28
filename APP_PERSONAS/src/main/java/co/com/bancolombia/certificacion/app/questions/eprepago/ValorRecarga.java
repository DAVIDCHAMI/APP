package co.com.bancolombia.certificacion.app.questions.eprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.RecargarTarjetaVirtualEprepagoPage.LBL_VALOR_RECARGA_NO_PERMITIDO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorRecarga implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_VALOR_RECARGA_NO_PERMITIDO.resolveFor(actor).isVisible();
  }

  public static ValorRecarga noPermitido() {
    return new ValorRecarga();
  }
}
