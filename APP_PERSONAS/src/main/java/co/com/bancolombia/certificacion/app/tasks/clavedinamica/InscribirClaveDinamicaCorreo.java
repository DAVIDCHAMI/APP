package co.com.bancolombia.certificacion.app.tasks.clavedinamica;

import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CLAVE_DINAMICA_DESDE_CORREO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InscribirClaveDinamicaCorreo implements Task {
    private Usuario usuario;

    public InscribirClaveDinamicaCorreo(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String claveDinamica;
        actor.attemptsTo(
                WaitUntil.the(BTN_INSCRIBIR_CLAVE, isEnabled()),
                Click.on(BTN_INSCRIBIR_CLAVE),
                Saltar.onBoarding(),
                Click.on(BTN_CONFIRMAR),
                WaitUntil.the(LBL_CONFIRMACION_ENVIO_CORREO, isVisible()),
                ObtenerClaveDinamica.desdeCorreo()
        );
        claveDinamica = actor.recall(CLAVE_DINAMICA_DESDE_CORREO);
        actor.attemptsTo(
                Escribir.enCampoTexto(claveDinamica),
                Click.on(BTN_ENVIAR),
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(TXT_FOCO_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_SIGUIENTE),
                WaitUntil.the(CHK_ACEPTO_TERMINOS, isEnabled()),
                Click.on(CHK_ACEPTO_TERMINOS),
                Click.on(BTN_INSCRIBIR_CLAVE)
        );
    }
}
