package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.BaseLocatorBuilder;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.BaseLocatorBuilder.locator;

public class MenuLocator {
    public static BaseLocatorBuilder OPT_MENU_PRINCIPAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id,'{0}')]").withIos("id$Hola");
    public static BaseLocatorBuilder OPT_SUB_MENU_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]").withIos("id$Hola");
    public static BaseLocatorBuilder OPT_TERCER_NIVEL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/../../../following-sibling::android.view.View").withIos("id$Hola");
}