package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ActivacionInactivacionEprepagoLocator {

    public static final Locator OPT_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'{0}')]").withIos("xpath$//*[contains(@name,'{0}')]");
    public static final Locator BTN_GENERAR_EPREPAGO_LOCATOR = locator().withAndroid("id$Button_CancelYesModal_ActivateBiometrics3").withIos("xpath$//XCUIElementTypeButton[@name='GENERAR']");
    public static final Locator LBL_GENERARACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'¡Generación exitosa!')]").withIos("xpath$//*[contains(text(),'¡Generación exitosa!')]");
    public static final Locator TXT_CAMPOS_ACTIVACION_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']//following::span[1]").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='{0}']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText]");
    public static final Locator BTN_CANCELAR_ACTIVACION_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//button[contains(text(),'CANCELAR')]").withIos("xpath$//XCUIElementTypeButton[contains(@name,'CANCELAR')]");
    public static final Locator BTN_ACTIVAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Generar número']").withIos("xpath$//XCUIElementTypeStaticText[@name='Generar número']/..");


    private ActivacionInactivacionEprepagoLocator() {throw new IllegalStateException(CLASE_LOCATOR);}


}
