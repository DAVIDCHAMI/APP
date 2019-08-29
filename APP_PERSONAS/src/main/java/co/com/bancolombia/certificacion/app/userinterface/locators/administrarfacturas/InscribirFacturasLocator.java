package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscribirFacturasLocator {
    public static final Locator BTN_INCRIBIR_MANUALMENTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'manualmente')]/../preceding-sibling::android.view.View");
    public static final Locator TXT_EMPRESA_SERVICIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_ServiceOrCompany']");
    public static final Locator TXT_EMPRESA_SERVICIO_POP_UP_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='FilterPopup']/android.view.View[6]/android.view.View[1]");
    public static final Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Description']");
    public static final Locator TXT_REFERENCIA_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Personal_Name']");
    public static final Locator LBL_INSCRIPCION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Inscripción exitosa!')]");

    private InscribirFacturasLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
