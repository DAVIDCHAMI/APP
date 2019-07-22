package co.com.bancolombia.certificacion.app.userinterface.locators;


import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator.locator;

public class MenuLocator {
    public static Locator OPT_MENU_PRINCIPAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id,'{0}')]").withIos("id$Hola");
    public static Locator OPT_SUB_MENU_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]").withIos("id$Hola");
    public static Locator OPT_TERCER_NIVEL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/../../../following-sibling::android.view.View").withIos("id$Hola");
}