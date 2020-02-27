package co.com.bancolombia.certificacion.app.interactions.scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class RealizarScroll {
  public static Performable hastaPosicionDeTarget(Target elemento) {
    return instrumented(HastaElTarget.class, elemento);
  }

  public static Performable adicional(Target elemento) {
    return instrumented(ScrollAdicional.class, elemento);
  }
}
