package co.com.bancolombia.certificacion.app.questions.eprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.RecargarTarjetaVirtualEprepagoPage.LBL_SALDO_INSUFICIENTE_EN_CUENTA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SaldoInsuficiente implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_SALDO_INSUFICIENTE_EN_CUENTA.resolveFor(actor).isVisible();
  }

  public static SaldoInsuficiente enProductoADebitar() {
    return new SaldoInsuficiente();
  }
}
