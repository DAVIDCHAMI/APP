package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscribirLocator {
    public static final Locator BTN_INCRIBIR_MANUALMENTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'manualmente')]/../preceding-sibling::android.view.View");
    public static final Locator TXT_EMPRESA_SERVICIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_ServiceOrCompany']");
}
