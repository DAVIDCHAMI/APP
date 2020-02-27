package co.com.bancolombia.certificacion.app.interactions.comunes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.ANDROID;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

public class BorrarTexto implements Interaction {
  private String objeto = "";

  public BorrarTexto(String objeto) {
    this.objeto = objeto;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (ElementFinder.getPlatformCapability().equals(ANDROID)) {
      JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
      js.executeScript("var texto = document.getElementById('" + objeto + "'); texto.value=\"\";");
    }
  }

  public static BorrarTexto delObjeto(String objeto) {
    return instrumented(BorrarTexto.class, objeto);
  }
}
