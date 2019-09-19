package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.BTN_SOLICITAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.CHK_TYC;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIPO_CORREO_LABORAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SolicitarEprepago implements Task {

    private Usuario usuario1;

    public SolicitarEprepago(Usuario usuario1){this.usuario1 = usuario1;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        ConfiguracionTransaccion usuario = actor.recall(MODELO_DATOS_TRANSACCION);

        actor.attemptsTo(
                WaitUntil.the(CHK_TYC, WebElementStateMatchers.isEnabled()),
                Click.on(CHK_TYC),
                Click.on(BTN_SOLICITAR_EPREPAGO),
                Saltar.onBoarding(),
                Click.on(TXT_CLAVE_DIGITOS),
                Escribir.enCampoTexto(usuario.getUsuario().getSegundaClave()),
                WaitUntil.the(BTN_CONTINUAR_SEGUNDA_CLAVE,isEnabled()),
                Click.on(BTN_CONTINUAR_SEGUNDA_CLAVE),
                Enter.theValue(usuario.getUsuario().getNombreUsuario()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(usuario1.getCorreo()).into(TXT_CORREO),
                Check.whether(TIPO_CORREO_LABORAL.equalsIgnoreCase(usuario1.getTipoCorreo())).
                        otherwise(WaitUntil.the(CHK_TIPO_CORREO.of(usuario1.getTipoCorreo()), isEnabled()),
                                Click.on(CHK_TIPO_CORREO.of(usuario1.getTipoCorreo()))),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(usuario1.getNumeroCelular()).into(TXT_NUMERO_CELULAR),
                Click.on(CHK_ACEPTO_TERMINOS),
                Click.on(BTN_INSCRIBIR_CLAVE)
        );

    };

    public static SolicitarEprepago enLaAppBancolombia(UsuarioBuilder usuarioBuilder){
        return instrumented(SolicitarEprepago.class, usuarioBuilder.build());
    }
}