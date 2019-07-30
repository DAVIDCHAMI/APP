package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class GeneralLocator {
    public static final Locator BTN_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/following-sibling::android.view.View[contains(@text,'{1}')]");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SIGUIENTE')]");
    public static final Locator LNK_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Siguiente')]");
    public static final Locator LBL_GUARDADO_EXITOSO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Guardado exitoso!')]");
    public static final Locator LBL_GENERACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Generación exitosa!')]");
    public static final Locator LBL_VERIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");
    public static final Locator LNK_SALTAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Saltar')]");
    public static final Locator LNK_COMENZAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Comenzar')]");

    public GeneralLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
