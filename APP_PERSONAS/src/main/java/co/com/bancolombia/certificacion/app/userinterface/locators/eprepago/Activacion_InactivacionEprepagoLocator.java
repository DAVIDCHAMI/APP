package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class Activacion_InactivacionEprepagoLocator {

    public static final Locator BTN_MAS_OPCIONES_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='e-Prepago']/../../../following-sibling::div/div").withIos("xpath$n");
    public static final Locator OPT_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'{0}')]").withIos("xpath$n");
    public static final Locator BTN_GENERAR_EPREPAGO_LOCATOR = locator().withAndroid("id$Button_CancelYesModal_ActivateBiometrics3").withIos("xpath$n");
    public static final Locator LBL_GENERARACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'¡Generación exitosa!')]").withIos("xpath$n");
    public static final Locator TXT_CAMPOS_ACTIVACION_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']//following::span[1]").withIos("xpath$n");



    private Activacion_InactivacionEprepagoLocator() {throw new IllegalStateException(CLASE_LOCATOR);}


}
