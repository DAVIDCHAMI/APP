package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Clave implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LNK_BLOQUEAR), Click.on(BTN_BLOQUEAR), Validar.carga());
  }
}
