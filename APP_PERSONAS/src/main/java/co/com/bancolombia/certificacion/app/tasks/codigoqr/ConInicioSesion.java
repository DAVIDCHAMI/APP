package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.interactions.Saltar;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.codigoqr.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.darFormato;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CEROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CUENTAS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_INFO_CODIGO_QR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
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
                WaitUntil.the(BTN_GENERAR_CODIGO_QR, isVisible()),
                Click.on(BTN_GENERAR_CODIGO_QR),
                Saltar.onBoarding(),
                Click.on(LNK_SIGUIENTE)
        );
        if (LBL_VERIFICACION.of(CUENTAS).resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    RealizarScroll.hastaPosicionDeTarget(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero())),
                    Click.on(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero()))
            );
        }
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
        actor.remember(MODELO_INFO_CODIGO_QR, datos);
    }
}
