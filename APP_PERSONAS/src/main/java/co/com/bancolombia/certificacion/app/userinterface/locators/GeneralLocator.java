package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class GeneralLocator {
    public static final Locator BTN_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/following-sibling::android.view.View[contains(@text,'{1}')]");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SIGUIENTE')]");
    public static final Locator LNK_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Siguiente')]");
    public static final Locator LBL_GUARDADO_EXITOSO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Guardado exitoso!')]");
    public static final Locator LBL_VERIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");
    public static final Locator IMG_LOGO_BANCOLOMBIA_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[contains(@text,'Bancolombia_Resources.logo')]");

    public GeneralLocator() {
    }
}
