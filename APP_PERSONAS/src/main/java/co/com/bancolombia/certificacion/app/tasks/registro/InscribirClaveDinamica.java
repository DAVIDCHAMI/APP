package co.com.bancolombia.certificacion.app.tasks.registro;

import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_SEGUNDA_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class InscribirClaveDinamica implements Task {
    private Usuario usuario;

    public InscribirClaveDinamica(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INSCRIBIR_CLAVE),
                WaitUntil.the(TXT_CLAVE_DIGITOS, isEnabled()),
                Click.on(TXT_SEGUNDA_CLAVE_DIGITOS),
                Escribir.enCampoTexto(usuario.getSegundaClave()),
                WaitUntil.the(BTN_CONTINUAR_SEGUNDA_CLAVE, isEnabled()),
                Click.on(BTN_CONTINUAR_SEGUNDA_CLAVE),
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(usuario.getCorreo()).into(TXT_CORREO),
                Click.on(CHK_FOCO_ACEPTO),
                Check.whether(TIPO_CORREO_LABORAL.equalsIgnoreCase(usuario.getTipoCorreo())).
                        otherwise(WaitUntil.the(CHK_TIPO_CORREO.of(usuario.getTipoCorreo()), isEnabled()),
                                Click.on(CHK_TIPO_CORREO.of(usuario.getTipoCorreo()))),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(usuario.getNumeroCelular()).into(TXT_NUMERO_CELULAR),
                Click.on(CHK_FOCO_ACEPTO),
                Click.on(CHK_ACEPTO_TERMINOS),
                Click.on(BTN_INSCRIBIR_CLAVE)
        );
        actor.remember(NOMBRE_PERSONALIZADO_CLAVE_DINAMICA, usuario.getNombrePersonalizado());
        actor.remember(CORREO_CLAVE_DINAMICA, usuario.getCorreo());
        actor.remember(TIPO_CORREO_CLAVE_DINAMICA, usuario.getTipoCorreo());
    }

    public static InscribirClaveDinamica conDatos(UsuarioBuilder usuarioBuilder) {
        return instrumented(InscribirClaveDinamica.class, usuarioBuilder.build());
    }
}