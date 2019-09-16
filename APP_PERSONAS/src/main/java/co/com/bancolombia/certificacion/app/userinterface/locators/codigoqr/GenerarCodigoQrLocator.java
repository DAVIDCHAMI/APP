package co.com.bancolombia.certificacion.app.userinterface.locators.codigoqr;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class GenerarCodigoQrLocator {
    public static final Locator TXT_NOMBRE_PERSONALIZADO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Personal_Name']");
    public static final Locator TXT_VALOR_RECIBIR_LOCATOR = locator().withAndroid("xpath$//span[text()='Ingresa el valor a recibir']/../following-sibling::div//span[@class='input-tel']/input");
    public static final Locator BTN_CON_VALOR_LOCATOR = locator().withAndroid("xpath$//span[text()='Con Valor']/preceding-sibling::button");
    public static final Locator BTN_SIN_VALOR_LOCATOR = locator().withAndroid("xpath$//span[text()='Sin valor']/preceding-sibling::button");
    public static final Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Reference']");
    public static final Locator BTN_GENERAR_QR_LOCATOR = locator().withAndroid("xpath$//span[text()='GENERAR QR']/..");
    public static final Locator IMG_CODIGO_QR_LOCATOR = locator().withAndroid("xpath$//img[@alt='Scan me!']");
    public static final Locator IMG_CODIGO_QR_PANTALLA_INICIO_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'FloatingIcon')]/img");
    public static final Locator IMG_CODIGO_QR_FLOTANTE_LOCATOR = locator().withAndroid("xpath$//div[@class='floating-actions-items OSInline']/div[3]//img");
    public static final Locator TXT_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_ProductNumber']");
    public static final Locator BTN_TIPO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/preceding-sibling::button");
    public static final Locator IMG_FOCO_LOCATOR = locator().withAndroid("xpath$//img[@src='/Personas/img/Bancolombia_Resources.times_2_.svg?++ow1o_qMnxW+fTcJQuAng']");

    private GenerarCodigoQrLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
