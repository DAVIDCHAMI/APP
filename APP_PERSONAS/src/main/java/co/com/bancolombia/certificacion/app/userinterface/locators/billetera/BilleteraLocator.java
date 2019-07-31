package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class BilleteraLocator {
    public static final Locator BTN_SIGUIENTE_ON_BOARDING_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id,'Button_Next_ActivateBiometricsStep2')]").withIos("");
    public static final Locator CHK_TERMINOS_CONDICIONES_BILLETERA_LOCATOR = locator().withAndroid("xpath$//android.widget.CheckBox[contains(@resource-id,'Chk_TerminosCondiciones')]").withIos("");
    public static final Locator BTN_COMENZAR_REGISTRO_BILLETERA_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'COMENZAR')]").withIos("");
    public static final Locator LBL_TARJETAS_LISTADAS_LOCATOR = locator().withAndroid("").withIos("");
    public static final Locator BTN_ACTIVAR_TARJETA_LOCATOR = locator().withAndroid("").withIos("");
    public static final Locator LBL_ACTIVACION_EXITOSA_LOCATOR = locator().withAndroid("").withIos("");

    private BilleteraLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
