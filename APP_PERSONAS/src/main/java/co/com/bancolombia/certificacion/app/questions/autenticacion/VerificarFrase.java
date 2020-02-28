package co.com.bancolombia.certificacion.app.questions.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_FRASE_DE_SEGURIDAD;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.FRASE_DE_SEGURIDAD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarFrase implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return FRASE_DE_SEGURIDAD.equalsIgnoreCase(LBL_FRASE_DE_SEGURIDAD.resolveFor(actor).getText());
  }

  public static VerificarFrase deSeguridadDelUsuario() {
    return new VerificarFrase();
  }
}
