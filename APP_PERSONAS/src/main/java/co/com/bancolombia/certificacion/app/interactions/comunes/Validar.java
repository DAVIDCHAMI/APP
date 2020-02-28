package co.com.bancolombia.certificacion.app.interactions.comunes;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.IMG_CARGA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LBL_MENSAJE_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Validar implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    while (Verificar.elementoVisible(actor, LBL_MENSAJE_CARGA)
        || Verificar.elementoVisible(actor, IMG_CARGA)) {}
  }

  public static Validar carga() {
    return instrumented(Validar.class);
  }
}
