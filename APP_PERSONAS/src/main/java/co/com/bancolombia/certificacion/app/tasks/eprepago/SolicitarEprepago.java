package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;

import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.BTN_SOLICITAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitudEprepagoPage.CHK_TYC;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIPO_CORREO_LABORAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SolicitarEprepago implements Task {
    public SolicitarEprepago(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        ConfiguracionTransaccion usuario = actor.recall(MODELO_DATOS_TRANSACCION);
        actor.attemptsTo(
                Click.on(CHK_TYC),
                Click.on(BTN_SOLICITAR_EPREPAGO),
                Saltar.onBoarding(),
                Click.on(TXT_CLAVE_DIGITOS),
                Escribir.enCampoTexto(usuario.getUsuario().getSegundaClave()),
                WaitUntil.the(BTN_CONTINUAR_SEGUNDA_CLAVE,isEnabled()),
                Click.on(BTN_CONTINUAR_SEGUNDA_CLAVE),
                Enter.theValue(usuario.getUsuario().getNombreUsuario()).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(usuario.getUsuario().getCorreo()).into(TXT_CORREO),
                Check.whether(TIPO_CORREO_LABORAL.equalsIgnoreCase(usuario.getUsuario().getTipoCorreo())).
                        otherwise(WaitUntil.the(CHK_TIPO_CORREO.of(usuario.getUsuario().getTipoCorreo()), isEnabled()),
                                Click.on(CHK_TIPO_CORREO.of(usuario.getUsuario().getTipoCorreo())))

        );
    };

    public static SolicitarEprepago enLaAppBancolombia(){
        return instrumented(SolicitarEprepago.class);
    }
}