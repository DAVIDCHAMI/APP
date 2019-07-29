package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.interactions.Saltar;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.String.UtileriaString.darFormato;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CEROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CUENTAS_DEPOSITO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.INFO_CODIGO_QR;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ConInicioSesion extends GenerarQR {
    private Transferencia datos;

    public ConInicioSesion(TransferenciaBuilder datos) {
        this.datos = datos.build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = getProxiedDriver();
        actor.attemptsTo(
                Click.on(BTN_GENERAR_CODIGO_QR),
                Saltar.unboarding(),
                Click.on(LNK_SIGUIENTE),
                Check.whether(LBL_VERIFICACION.of(CUENTAS_DEPOSITO).resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero()))
                )
        );
        driver.hideKeyboard();
        actor.attemptsTo(
                Check.whether("".equals(datos.getMonto())).andIfSo(
                        Click.on(BTN_SIN_VALOR)
                ).otherwise(
                        Click.on(TXT_VALOR_RECIBIR),
                        Escribir.enCampoTexto(datos.getMonto())
                ),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_DESCRIPCION),
                Escribir.enCampoTexto(datos.getDescripcion()),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_GENERAR_QR)
        );
        if ("".equals(datos.getMonto()))
            datos.setMonto(CEROS);
        else
            datos.setMonto(darFormato(datos.getMonto()));
        actor.remember(INFO_CODIGO_QR, datos);
    }
}
