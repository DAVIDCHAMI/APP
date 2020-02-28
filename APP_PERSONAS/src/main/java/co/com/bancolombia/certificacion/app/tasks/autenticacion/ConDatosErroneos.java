package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_CONTINUAR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_AUTENTICACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.app.interactions.comunes.CancelarActivacion;
import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ConDatosErroneos implements Task {
  private Usuario usuario;

  public ConDatosErroneos(Usuario usuario) {
    this.usuario = usuario;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(MODELO_DATOS_AUTENTICACION, usuario);

    for (int i = 0; i <= 2; i++) {
      actor.attemptsTo(
          Type.theValue(usuario.getNombreUsuario()).into(TXT_USUARIO),
          Click.on(LBL_HOLA_PROVISIONAL),
          WaitUntil.the(BTN_CONTINUAR, isEnabled()),
          Click.on(BTN_CONTINUAR),
          Click.on(TXT_CLAVE_DIGITOS),
          Escribir.enCampoTexto(usuario.getClave()),
          Click.on(LBL_FOCO_CLAVE),
          WaitUntil.the(BTN_CONTINUAR, isEnabled()),
          Click.on(BTN_CONTINUAR),
          CancelarActivacion.deHuella());
    }
  }
}