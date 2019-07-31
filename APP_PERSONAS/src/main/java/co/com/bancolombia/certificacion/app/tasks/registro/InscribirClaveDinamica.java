package co.com.bancolombia.certificacion.app.tasks.registro;

import co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_CONTINUAR;
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
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Enter.theValue(usuario.getNombrePersonalizado()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(BTN_SIGUIENTE_CLAVE),
                Enter.theValue(usuario.getCorreo()).into(TXT_CORREO),
                Click.on(CHECK_TIPO_CORREO.of(usuario.getTipoCorreo())),
                Click.on(BTN_SIGUIENTE_CLAVE),
                Enter.theValue(usuario.getNumeroCelular()).into(TXT_NUMERO_CELULAR),
                Click.on(CHECK_ACEPTO_TERMINOS),
                Click.on(BTN_INSCRIBIR_CLAVE)
        );
    }

    public static InscribirClaveDinamica conDatos(UsuarioBuilder usuarioBuilder) {
        return instrumented(InscribirClaveDinamica.class, usuarioBuilder.build());
    }
}