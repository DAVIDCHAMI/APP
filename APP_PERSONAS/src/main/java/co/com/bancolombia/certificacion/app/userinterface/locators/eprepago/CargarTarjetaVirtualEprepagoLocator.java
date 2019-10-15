package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class CargarTarjetaVirtualEprepagoLocator {
    public static final Locator BTN_SUB_MENU_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']/../../../following-sibling::div/div").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeOther/XCUIElementTypeStaticText[@name='e-Prepago']]/following-sibling::XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeStaticText");
    public static final Locator BTN_SELECCIONAR_OPCION_LOCATOR = locator().withAndroid("xpath$//div[@id='EpagoOptions']/..//*[contains(text(),'{0}')]").withIos("xpath$q");
    public static final Locator TXT_VALOR_RECARGA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]/descendant::input").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Ingresa el valor a recargar']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField");
    public static final Locator LNK_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Recargar']/../following-sibling::div/i").withIos("xpath$//XCUIElementTypeButton[@name='RECARGAR']");
    public static final Locator LBL_RECARGA_EXITOSA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Recarga exitosa!']").withIos("xpath$//*[contains(@name,'¡Recarga exitosa!')]");
    public static final Locator LBL_PRODUCTO_ORIGEN_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto origen']").withIos("xpath$//*[@name='Producto origen']");
    public static final Locator LBL_VALOR_RECARGA_NO_PERMITIDO_LOCATOR = locator().withAndroid("xpath$//span[@id='AlertAnimation2']/descendant::span").withIos("xpath$q");
    public static final Locator LBL_VALOR_RECARGADO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Valor recargado']/../../child::span[contains(text(),'{0}')]").withIos("xpath$//*[contains(@name,'{0}')]");
    public static final Locator BTN_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='RECARGAR']").withIos("xpath$q");
    public static final Locator LBL_COMPROBATE_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Comprobante')]").withIos("xpath$//*[contains(@name,'Comprobante')]");
    public static final Locator FOCO_E_PREPGAGO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'e-Prepago')]").withIos("xpath$//XCUIElementTypeStaticText[@name='e-Prepago']");

    private CargarTarjetaVirtualEprepagoLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}