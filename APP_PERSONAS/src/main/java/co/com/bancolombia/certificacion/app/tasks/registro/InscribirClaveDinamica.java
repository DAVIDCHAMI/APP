package co.com.bancolombia.certificacion.app.tasks.registro;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InscribirClaveDinamica implements Task {
    private Usuario usuario;

    public InscribirClaveDinamica(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getSegundaClave()).into(TXT_CLAVE_DIGITOS),
                Click.on(BTN_CONTINUAR_SEGUNDA_CLAVE),
                Click.on(TXT_NOMBRE_PERSONALIZADO),
                Escribir.enCampoTexto(usuario.getNombrePersonalizado()),
                Click.on(BTN_SIGUIENTE_CLAVE),
                Click.on(TXT_CORREO),
                Escribir.enCampoTexto(usuario.getCorreo()),
                Click.on(CHECK_TIPO_CORREO.of(usuario.getTipoCorreo())),
                Click.on(BTN_SIGUIENTE_CLAVE),
                Click.on(TXT_NUMERO_CELULAR),
                Escribir.enCampoTexto(usuario.getNumeroCelular()),
                Click.on(CHECK_ACEPTO_TERMINOS),
                Click.on(BTN_INSCRIBIR_CLAVE)
        );
    }

    public static InscribirClaveDinamica conDatos(UsuarioBuilder usuarioBuilder) {
        return instrumented(InscribirClaveDinamica.class, usuarioBuilder.build());
    }
}