package co.com.bancolombia.certificacion.app.tasks.clavedinamica;

import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.interactions.comunes.EscribirSegundaClave;
import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.TXT_FOCO_NOMBRE_PERSONALIZADO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_SEGUNDA_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InscribirClaveDinamica implements Task {
    private Usuario usuario;

    public InscribirClaveDinamica(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INSCRIBIR_CLAVE),
                Saltar.onBoarding(),
                EscribirSegundaClave.enLaApp(usuario.getSegundaClave()),
                WaitUntil.the(BTN_CONTINUAR_SEGUNDA_CLAVE, isEnabled()),
                Click.on(BTN_CONTINUAR_SEGUNDA_CLAVE),
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(TXT_FOCO_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                WaitUntil.the(TXT_CORREO, isVisible())
        );
        TXT_CORREO.resolveFor(actor).clear();
        actor.attemptsTo(
                Enter.theValue(usuario.getCorreo()).into(TXT_LIMPIAR_CORREO),
                Click.on(CHK_FOCO_ACEPTO),
                Click.on(CHK_TIPO_CORREO.of(usuario.getTipoCorreo())),
                Click.on(LNK_SIGUIENTE)
        );
        TXT_NUMERO_CELULAR.resolveFor(actor).clear();
        actor.attemptsTo(
                Enter.theValue(usuario.getNumeroCelular()).into(TXT_NUMERO_CELULAR),
                Click.on(CHK_FOCO_ACEPTO),
                Click.on(CHK_ACEPTO_TERMINOS)
                //Click.on(BTN_INSCRIBIR_CLAVE)
        );
        actor.remember(NOMBRE_PERSONALIZADO_CLAVE_DINAMICA, usuario.getNombrePersonalizado());
        actor.remember(CORREO_CLAVE_DINAMICA, usuario.getCorreo());
        actor.remember(TIPO_CORREO_CLAVE_DINAMICA, usuario.getTipoCorreo());
    }
}