package co.com.bancolombia.certificacion.app.tasks.autenticacion;


import co.com.bancolombia.certificacion.app.interactions.comunes.Escribir;
import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ConDatosTransaccion extends Autenticacion {
    public static final Logger LOGGER = LogManager.getLogger(ConfiguracionTransaccion.class);
    private ConfiguracionTransaccion usuario;

    public ConDatosTransaccion(ConfiguracionTransaccion usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember(MODELO_DATOS_TRANSACCION, usuario);

        actor.attemptsTo(
                //Check.whether(FabricaAutenticacion.elArchivoEnIseriesWWWFFUSRSV()).andIfSo(
                Esperar.unTiempo(5000),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(TXT_USUARIO, isEnabled()),
                Click.on(TXT_USUARIO),
                Type.theValue(usuario.getUsuario().getNombreUsuario()).into(TXT_USUARIO),
                Click.on(LBL_HOLA_PROVISIONAL),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR));

        actor.attemptsTo(
                Esperar.unTiempo(5000),
                Click.on(TXT_CLAVE_DIGITOS),
                Escribir.enCampoTexto(usuario.getUsuario().getClave()),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR));
    }
}

