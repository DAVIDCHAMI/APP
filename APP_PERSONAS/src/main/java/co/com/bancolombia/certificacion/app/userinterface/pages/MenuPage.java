package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.MenuLocator.OPT_MENU_PRINCIPAL_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.dynamicElement;

public class MenuPage {
    public static final Target OPT_MENU_PRINCIPAL = Target.the("Opcion de Menu principal").locatedBy(dynamicElement(OPT_MENU_PRINCIPAL_LOCATOR));
}
