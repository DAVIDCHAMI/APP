package co.com.bancolombia.certificacion.app.userinterface.locators.codigoqr;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class GenerarCodigoQrLocator {
    public static final Locator BTN_GENERAR_CODIGO_QR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Generar código QR')]/..");
    public static final Locator TXT_NOMBRE_PERSONALIZADO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Personal_Name']/..");
    public static final Locator TXT_VALOR_RECIBIR_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Currency']");
    public static final Locator BTN_SIN_VALOR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Sin valor')]/preceding-sibling::android.widget.Button");
    public static final Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='TextArea_Reference']");
    public static final Locator BTN_GENERAR_QR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'GENERAR QR')]");
    public static final Locator IMG_CODIGO_QR_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[contains(@text,'Scan me!')]");
    public static final Locator IMG_CODIGO_QR_PANTALLA_INICIO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='b17-FloatingIcon']/android.widget.Image");
    public static final Locator IMG_CODIGO_QR_FLOTANTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Bancolombia_Resources.GenerarcodigoQR')]");
    public static final Locator TXT_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_ProductNumber']");
    public static final Locator BTN_TIPO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/preceding-sibling::android.widget.Button");

    public GenerarCodigoQrLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
