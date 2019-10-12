package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class CargarTarjetaVirtualEprepagoLocator {
    public static final Locator BTN_SUB_MENU_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']/../../../following-sibling::div/div").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeOther/XCUIElementTypeStaticText[@name='e-Prepago']]/following-sibling::XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeStaticText");
    public static final Locator BTN_SELECCIONAR_OPCION_LOCATOR = locator().withAndroid("xpath$//div[@id='EpagoOptions']/..//*[contains(text(),'{0}')]").withIos("xpath$q");
    public static final Locator TXT_VALOR_RECARGA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]/descendant::input").withIos("xpath$q");
    public static final Locator LNK_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Recargar']/../following-sibling::div/i").withIos("xpath$q");
    public static final Locator LBL_RECARGA_EXITOSA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Recarga exitosa!']").withIos("xpath$q");
    public static final Locator LBL_PRODUCTO_ORIGEN_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto origen']").withIos("xpath$q");
    public static final Locator LBL_VALOR_RECARGA_NO_PERMITIDO_LOCATOR = locator().withAndroid("xpath$//span[@id='AlertAnimation2']/descendant::span").withIos("xpath$q");
    public static final Locator LBL_VALOR_RECARGADO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Valor recargado']/../../child::span[contains(text(),'{0}')]").withIos("xpath$q");
    public static final Locator BTN_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='RECARGAR']").withIos("xpath$q");
    public static final Locator LBL_COMPROBATE_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Comprobante')]").withIos("xpath$q");

    private CargarTarjetaVirtualEprepagoLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}