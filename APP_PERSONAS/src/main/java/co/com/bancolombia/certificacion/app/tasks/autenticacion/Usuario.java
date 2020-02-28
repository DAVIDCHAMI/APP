package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.app.interactions.comunes.CancelarActivacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Usuario implements Task {
  private String usuario;
  private String clave;

  public Usuario(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Type.theValue(usuario).into(TXT_USUARIO),
        Click.on(LBL_HOLA_PROVISIONAL),
        WaitUntil.the(BTN_CONTINUAR, isEnabled()),
        Click.on(BTN_CONTINUAR),
        WaitUntil.the(TXT_CLAVE_DIGITOS, isEnabled()),
        CancelarActivacion.deHuella());
  }

  public static Performable conFraseDeSeguridad(String usuario, String clave) {
    return instrumented(Usuario.class, usuario, clave);
  }
}