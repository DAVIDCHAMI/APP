package co.com.bancolombia.certificacion.app.questions.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_FRASE_DE_SEGURIDAD;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FraseSeguridad implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return !Verificar.elementoVisible(actor, LBL_FRASE_DE_SEGURIDAD);
  }

  public static FraseSeguridad noVisible() {
    return new FraseSeguridad();
  }
}
