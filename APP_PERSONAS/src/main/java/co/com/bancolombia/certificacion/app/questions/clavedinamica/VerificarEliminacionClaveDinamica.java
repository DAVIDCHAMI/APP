package co.com.bancolombia.certificacion.app.questions.clavedinamica;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerificarEliminacionClaveDinamica implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    String nombrePersonalizado = actor.recall(NOMBRE_PERSONALIZADO_CLAVE_DINAMICA);
    return (Visibility.of(LBL_VERIFICACION_ELIMINAR_CLAVE_DINAMICA.of(nombrePersonalizado))
            .viewedBy(actor)
            .asBoolean()
        && Visibility.of(LBL_VERIFICACION_MENSAJE_CLAVE_DINAMICA).viewedBy(actor).asBoolean());
  }

  public static VerificarEliminacionClaveDinamica exitosa() {
    return new VerificarEliminacionClaveDinamica();
  }
}
