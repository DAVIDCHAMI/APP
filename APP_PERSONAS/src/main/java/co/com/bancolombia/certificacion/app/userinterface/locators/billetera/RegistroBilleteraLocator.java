package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class RegistroBilleteraLocator {
    public static final Locator BTN_CONTINUAR_BILLETERA_LOCATOR = locator().withAndroid("xpath$//button[text()='CONTINUAR']").withIos("xpath$d");
    public static final Locator CHK_TERMINOS_CONDICIONES_BILLETERA_LOCATOR = locator().withAndroid("xpath$//input[@id='Chk_TerminosCondiciones']").withIos("xpath$d");
    public static final Locator BTN_COMENZAR_REGISTRO_BILLETERA_LOCATOR = locator().withAndroid("xpath$//button//span[text()='COMENZAR']").withIos("xpath$d");
    public static final Locator LBL_ACTIVACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'¡Activación exitosa!')]").withIos("xpath$d");
    public static final Locator BTN_PAGAR_CON_BILLETERA_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");

    private RegistroBilleteraLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}