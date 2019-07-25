package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.todo1.modelo.builder.Locator;

import static co.com.todo1.modelo.builder.Locator.locator;

public class GenerarCodigoQrLocator {
    public static Locator BTN_GENERAR_CODIGO_QR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Generar código QR')]/..");
    public static Locator TXT_NOMBRE_PERSONALIZADO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Personal_Name']");
    public static Locator TXT_VALOR_RECIBIR_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Currency']");
    public static Locator BTN_SIN_VALOR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Sin valor')]/preceding-sibling::android.widget.Button");
    public static Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='TextArea_Reference']");
    public static Locator BTN_GENERAR_QR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'GENERAR QR')]");
    public static Locator IMG_CODIGO_QR_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[contains(@text,'Scan me!')]");
}
