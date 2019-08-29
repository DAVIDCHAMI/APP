package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscribirFacturasLocator {
    public static final Locator BTN_INCRIBIR_MANUALMENTE_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'manualmente')]/../../preceding-sibling::div/div");
    public static final Locator TXT_EMPRESA_SERVICIO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_ServiceOrCompany']");
    public static final Locator TXT_EMPRESA_SERVICIO_POP_UP_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'Content')]/div/div[2]/div/div[1]");
    public static final Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Description']");
    public static final Locator TXT_REFERENCIA_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Personal_Name']");
    public static final Locator LBL_INSCRIPCION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Inscripción exitosa!']");

    private InscribirFacturasLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
