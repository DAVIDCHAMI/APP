package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscripcionProductoLocator {
    public static final Locator TXT_BANCO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_BankName2']").withIos("");
    public static final Locator TXT_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_usuario3']").withIos("");
    public static final Locator TXT_BUSCAR_NOMBRE_BANCO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='b26-Input_SearchParameter']").withIos("");
    public static final Locator ITEM_NOMBRE_BANCO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='{0}']").withIos("id$xxxx");
    public static final Locator BTN_CERRAR_NOMBRE_BANCO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Selecciona el Banco']/../../../../android.view.View[@text='CERRAR'] ").withIos("");
    public static final Locator CHK_TIPO_CUENTA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/preceding-sibling::android.widget.Button").withIos("");
    public static final Locator TXT_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_BankName3']").withIos("");
    public static final Locator TXT_NUMERO_DOCUEMENTO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_DocumentNumber']").withIos("");
    public static final Locator ITEM_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='AccountOptions']//android.view.View[1]//android.view.View[@text='{0}']").withIos("");
    public static final Locator BTN_CERRAR_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='Title']//android.view.View[contains(@text,'Selecciona el tipo de documento')]/../../../../../../android.view.View[@text='CERRAR']").withIos("");
    public static final Locator BTN_INSCRIBIR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@text='INSCRIBIR']").withIos("");
    public static final Locator IMG_CONFIRMACION_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[@text='Bancolombia_Resources.confirmationicon']").withIos("");
    public static final Locator LBL_TIPO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Tipo de producto']/../android.view.View[@text='{0}']").withIos("");
    public static final Locator LBL_BANCO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Banco']/../android.view.View[@text='{0}']").withIos("");
    public static final Locator LBL_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Tipo de documento']/../android.view.View[@text='{0}']").withIos("");
    public static final Locator LBL_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Número de producto']/following-sibling::android.view.View[1]").withIos("");
    public static final Locator LBL_NUMERO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Número de documento']/../android.view.View[@text='{0}']").withIos("");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@resource-id='btn']").withIos("");

    private InscripcionProductoLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
