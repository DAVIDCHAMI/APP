package co.com.bancolombia.certificacion.app.interactions.billetera;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.RegistroBilletera.CHK_TERMINOS_CONDICIONES_BILLETERA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LNK_COMENZAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class Aceptar implements Interaction {

  public static Performable TerminosCondiciones() {
    return instrumented(Aceptar.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(CHK_TERMINOS_CONDICIONES_BILLETERA), Click.on(LNK_COMENZAR));
  }
}
