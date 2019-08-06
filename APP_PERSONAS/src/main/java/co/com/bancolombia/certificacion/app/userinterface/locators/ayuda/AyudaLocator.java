package co.com.bancolombia.certificacion.app.userinterface.locators.ayuda;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AyudaLocator {
    public static final Locator LBL_AYUDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Ayuda')]");
    public static final Locator BTN_OPCION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");

    public AyudaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
