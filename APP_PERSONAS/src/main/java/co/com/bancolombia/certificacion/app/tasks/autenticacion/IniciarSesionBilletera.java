package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import co.com.bancolombia.certificacion.app.interactions.comunes.CancelarActivacion;
import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IniciarSesionBilletera implements Task {
  private ConfiguracionTransaccion usuario;
  String platform = ElementFinder.getPlatformCapability();

  public IniciarSesionBilletera(ConfiguracionTransaccion usuario) {
    this.usuario = usuario;
  }

  public <T extends Actor> void login(T actor) {
    actor.attemptsTo(
        WaitUntil.the(BTN_INGRESAR, isEnabled()),
        Check.whether(("Android").equalsIgnoreCase(platform))
            .andIfSo(JavaScriptClick.on(BTN_INGRESAR))
            .otherwise(Click.on(BTN_INGRESAR)),
        WaitUntil.the(TXT_USUARIO, isEnabled()),
        Click.on(TXT_USUARIO),
        Type.theValue(usuario.getUsuario().getNombreUsuario()).into(TXT_USUARIO),
        Click.on(LBL_HOLA_PROVISIONAL),
        WaitUntil.the(BTN_CONTINUAR, isEnabled()),
        Click.on(BTN_CONTINUAR),
        Escribir.enCampoTexto(usuario.getUsuario().getClave()),
        Click.on(LBL_FOCO_CLAVE),
        WaitUntil.the(BTN_CONTINUAR, isEnabled()),
        Click.on(BTN_CONTINUAR),
        CancelarActivacion.deHuella());
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String platform = ElementFinder.getPlatformCapability();
    actor.remember(MODELO_DATOS_TRANSACCION, usuario);
    login(actor);
    AndroidDriver driver = getProxiedDriver();
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
    login(actor);
  }

  /*public static IniciarSesionBilletera conEstosDatos(){
      return instrumented(IniciarSesionBilletera.class);
  }*/
}
