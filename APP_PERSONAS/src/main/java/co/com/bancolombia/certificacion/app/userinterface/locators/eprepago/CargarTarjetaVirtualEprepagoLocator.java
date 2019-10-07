package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class CargarTarjetaVirtualEprepagoLocator {
    public static final Locator BTN_DESPLEGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']/../child::div/img").withIos("");
    public static final Locator BTN_SUB_MENU_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']/../../../following-sibling::div/div").withIos("");
    public static final Locator BTN_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Recargar']").withIos("");
    public static final Locator TXT_VALOR_RECARGA_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]/descendant::input").withIos("");
    public static final Locator BTN_CARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='RECARGAR']").withIos("");
    public static final Locator LNK_RECARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Recargar']").withIos("");
    public static final Locator LBL_RECARGA_EXITOSA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Recarga exitosa!']").withIos("");

    private CargarTarjetaVirtualEprepagoLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}