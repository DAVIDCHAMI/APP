package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.BTN_INSCRIBIR_DINAMICA_CLAVE;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.app.interactions.comunes.CancelarActivacion;
import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ConDatos implements Task {
  private String usuario;
  private String clave;

  public ConDatos(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Check.whether(elementoVisible(actor, BTN_INSCRIBIR_DINAMICA_CLAVE))
            .andIfSo(Click.on(BTN_INSCRIBIR_DINAMICA_CLAVE)),
        Click.on(BTN_INGRESAR),
        WaitUntil.the(TXT_USUARIO, isEnabled()),
        Type.theValue(usuario).into(TXT_USUARIO),
        Click.on(LBL_HOLA_PROVISIONAL),
        WaitUntil.the(BTN_CONTINUAR, isEnabled()),
        Click.on(BTN_CONTINUAR),
        Click.on(TXT_CLAVE_DIGITOS),
        Escribir.enCampoTexto(clave),
        Click.on(LBL_FOCO_CLAVE),
        WaitUntil.the(BTN_CONTINUAR, isEnabled()),
        Click.on(BTN_CONTINUAR),
        CancelarActivacion.deHuella());
  }
}
