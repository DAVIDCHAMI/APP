package co.com.bancolombia.certificacion.app.tasks.clavedinamica;

import co.com.bancolombia.certificacion.app.interactions.comunes.*;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CLAVE_DINAMICA_DESDE_CORREO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class InscribirClaveDinamicaCorreo implements Task {
    private Usuario usuario;

    public InscribirClaveDinamicaCorreo(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INSCRIBIR_CLAVE),
                Saltar.onBoarding(),
                Click.on(BTN_CONFIRMAR),
                WaitUntil.the(LBL_CONFIRMACION_ENVIO_CORREO, isVisible())
        );
        actor.attemptsTo(
                AbrirAplicacion.deCorreoElectronico(),
                LeerClaveDinamica.desdeCorreo(),
                SeleccionarApp.desdeRecientes()
        );
        String claveDinamicaCorreo = actor.recall(CLAVE_DINAMICA_DESDE_CORREO);
        actor.attemptsTo(
                Enter.theValue(claveDinamicaCorreo).into(TXT_CODIGO_SEGURIDAD),
                Click.on(BTN_ENVIAR)
        );
        actor.attemptsTo(
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(TXT_FOCO_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_SIGUIENTE),
                WaitUntil.the(CHK_FOCO_ACEPTO, isPresent()),
                Click.on(CHK_FOCO_ACEPTO),
                Click.on(LNK_SIGUIENTE)
        );
        actor.remember(NOMBRE_PERSONALIZADO_CLAVE_DINAMICA, usuario.getNombrePersonalizado());
        actor.remember(CORREO_CLAVE_DINAMICA, usuario.getCorreo());
        actor.remember(TIPO_CORREO_CLAVE_DINAMICA, usuario.getTipoCorreo());
    }
}
