package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.interactions.Saltar;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.codigoqr.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.String.UtileriaString.darFormato;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CEROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_INFO_CODIGO_QR;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SinInicioSesion extends GenerarQR {
    private String nombrePersonalizado;
    private Transferencia transferencia;

    public SinInicioSesion(String nombrePersonalizado, TransferenciaBuilder transferencia) {
        this.nombrePersonalizado = nombrePersonalizado;
        this.transferencia = transferencia.build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = getProxiedDriver();
        actor.attemptsTo(
                Click.on(IMG_CODIGO_QR_PANTALLA_INICIO),
                Click.on(IMG_CODIGO_QR_FLOTANTE),
                Saltar.onBoarding(),
                Escribir.enCampoTexto(nombrePersonalizado),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_NUMERO_PRODUCTO),
                Escribir.enCampoTexto(transferencia.getProductoOrigen().getNumero()),
                Click.on(BTN_TIPO_PRODUCTO.of(transferencia.getProductoOrigen().getTipo())),
                Click.on(LNK_SIGUIENTE)
        );
        driver.hideKeyboard();
        actor.attemptsTo(
                Check.whether("".equals(transferencia.getMonto())).andIfSo(
                        Click.on(BTN_SIN_VALOR)
                ).otherwise(
                        Click.on(TXT_VALOR_RECIBIR),
                        Escribir.enCampoTexto(transferencia.getMonto())
                ),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_DESCRIPCION),
                Escribir.enCampoTexto(transferencia.getDescripcion()),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_GENERAR_QR)
        );
        if ("".equals(transferencia.getMonto()))
            transferencia.setMonto(CEROS);
        else
            transferencia.setMonto(darFormato(transferencia.getMonto()));
        actor.remember(MODELO_INFO_CODIGO_QR,transferencia);
    }
}
