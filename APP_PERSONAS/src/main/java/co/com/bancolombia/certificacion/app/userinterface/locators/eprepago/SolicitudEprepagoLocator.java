package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SolicitudEprepagoLocator {
    public static final Locator CHK_TYC_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//input[@id='Chk_TerminosCondiciones']").withIos("");
    public static final Locator BTN_SOLICITAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='SOLICITAR']").withIos("");
    public static final Locator LBL_SOLICITUD_EPREPAGO_EXITOSA_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Solicitud exitosa!']").withIos("");
    public static final Locator LBL_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']").withIos("");
    public static final Locator LBL_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//span[text()='Detalle del producto']").withIos("");

    public SolicitudEprepagoLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}