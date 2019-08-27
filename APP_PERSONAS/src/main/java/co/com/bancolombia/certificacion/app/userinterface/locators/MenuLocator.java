package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class MenuLocator {
    public static final Locator OPT_MENU_PRINCIPAL_LOCATOR = locator().withAndroid("xpath$//div[text()='{0}']").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']/../../preceding-sibling::XCUIElementTypeLink[1]/..");
    public static final Locator OPT_SUB_MENU_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'{0}')]").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator OPT_TERCER_NIVEL_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'{0}')]").withIos("xpath$test");

    private MenuLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}