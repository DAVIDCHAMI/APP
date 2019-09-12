package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscripcionProductoLocator {
    public static final Locator TXT_BANCO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_BankName2']").withIos("");
    public static final Locator TXT_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_usuario3']").withIos("");
    public static final Locator TXT_BUSCAR_NOMBRE_BANCO_LOCATOR = locator().withAndroid("xpath$//input[contains(@id,'Input_SearchParameter')]").withIos("");
    public static final Locator ITEM_NOMBRE_BANCO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']").withIos("id$xxxx");
    public static final Locator CHK_TIPO_CUENTA_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../button").withIos("");
    public static final Locator TXT_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_BankName3']").withIos("");
    public static final Locator TXT_NUMERO_DOCUEMENTO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_DocumentNumber']").withIos("");
    public static final Locator ITEM_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//div[@id='AccountOptions']//div//span[text()='{0}']").withIos("");
    public static final Locator BTN_CERRAR_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//*[@id='Title']/label/div/span/../../../../../../../div[3]//span[text()='CERRAR']").withIos("");
    public static final Locator BTN_INSCRIBIR_LOCATOR = locator().withAndroid("xpath$//span[text()='INSCRIBIR']/..").withIos("");
    public static final Locator IMG_CONFIRMACION_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[@text='Bancolombia_Resources.confirmationicon']").withIos("");
    public static final Locator LBL_TIPO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//span[text()='Tipo de producto']/../span[@text='{0}']").withIos("");
    public static final Locator LBL_BANCO_LOCATOR = locator().withAndroid("xpath$//span[@text='Banco']/../span[@text='{0}']").withIos("");
    public static final Locator LBL_TIPO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//span[@text='Tipo de documento']/../android.view.View[@text='{0}']").withIos("");
    public static final Locator LBL_NUMERO_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//span[@text='Número de producto']/following-sibling::span[1]").withIos("");
    public static final Locator LBL_NUMERO_DOCUMENTO_LOCATOR = locator().withAndroid("xpath$//span[@text='Número de documento']/../span[@text='{0}']").withIos("");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//*[@id='btn']").withIos("");
    public static final Locator LST_TIPO_FONDO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_BankName4']").withIos("");
    public static final Locator ITEM_TIPO_FONDO_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'ContentOnClick')]//span[text()='{0}']").withIos("");

    private InscripcionProductoLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
