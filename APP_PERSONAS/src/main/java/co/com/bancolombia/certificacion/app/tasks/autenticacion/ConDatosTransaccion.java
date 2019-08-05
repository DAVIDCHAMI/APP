package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.exceptions.productos.AfirmacionDelProducto;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.questions.fabrica.autenticacion.FabricaAutenticacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.exceptions.productos.AfirmacionDelProducto.NO_FUNCIONA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ConDatosTransaccion extends Autenticacion {
    private ConfiguracionTransaccion usuario;

    public ConDatosTransaccion(ConfiguracionTransaccion usuario) {
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember(MODELO_DATOS_TRANSACCION, usuario);

        actor.should(seeThat(FabricaAutenticacion.elArchivoEnIseriesWWWFFUSRSV())
                .orComplainWith(AfirmacionDelProducto.class,NO_FUNCIONA));

        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                Type.theValue(usuario.getUsuario().getNombreUsuario()).into(TXT_USUARIO),
                Click.on(LBL_HOLA_PROVISIONAL),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(usuario.getUsuario().getClave()).into(TXT_CLAVE_DIGITOS),
                WaitUntil.the(BTN_CONTINUAR, isEnabled()),
                Click.on(BTN_CONTINUAR)
        );
    }
}
