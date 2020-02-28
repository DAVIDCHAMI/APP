package co.com.bancolombia.certificacion.app.questions.eprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.TXT_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoPresente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CancelarAccionEprepago implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return elementoPresente(actor, TXT_EPREPAGO);
  }

  public static CancelarAccionEprepago esExitosa() {
    return new CancelarAccionEprepago();
  }
}
