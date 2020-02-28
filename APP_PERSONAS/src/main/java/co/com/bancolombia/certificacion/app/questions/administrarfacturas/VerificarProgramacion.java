package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.TXT_MENSAJE_PROGRAMACION_EXITOSA;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoPresente;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarProgramacion implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    return elementoPresente(actor, TXT_MENSAJE_PROGRAMACION_EXITOSA);
  }

  public static VerificarProgramacion deFactura() {
    return new VerificarProgramacion();
  }
}
