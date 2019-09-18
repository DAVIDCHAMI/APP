package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SolicitudEprepagoLocator {
    public static final Locator CHK_TYC_LOCATOR = locator().withAndroid("xpath$//div[@id='b13-MarginContainer']/child::div[5]/descendant::span[1]/input").withIos("");
    public static final Locator BTN_SOLICITAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//div[@id='b15-MarginContainer']/child::div/descendant::button[1]").withIos("");
    public static final Locator LBL_SOLICITUD_EPREPAGO_EXITOSA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'EXITOSA')]").withIos("");
    public static final Locator LBL_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'e-Prepago')]").withIos("");
    public static final Locator LBL_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Detalle del producto')]").withIos("");

    public SolicitudEprepagoLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}