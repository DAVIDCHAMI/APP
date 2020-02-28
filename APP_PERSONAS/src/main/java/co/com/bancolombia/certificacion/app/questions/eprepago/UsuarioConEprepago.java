package co.com.bancolombia.certificacion.app.questions.eprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitarTarjetaVirtualEprepagoPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UsuarioConEprepago implements Question<Boolean> {
  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_EPREPAGO.resolveFor(actor).isVisible()
        && LBL_DETALLE_PRODUCTO.resolveFor(actor).isVisible();
  }

  public static UsuarioConEprepago enLaApp() {
    return new UsuarioConEprepago();
  }
}
