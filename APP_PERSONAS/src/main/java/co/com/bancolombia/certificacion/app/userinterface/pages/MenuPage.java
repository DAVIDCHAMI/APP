package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.userinterface.locators.MenuLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.theElementBy;

public class MenuPage {
    public static final Target OPT_MENU_PRINCIPAL = Target.the("Opcion de Menu principal").locatedBy(dynamicElement(OPT_MENU_PRINCIPAL_LOCATOR));
    public static final Target OPT_SUB_MENU = Target.the("Opcion SubMenu").locatedBy(dynamicElement(OPT_SUB_MENU_LOCATOR));
    public static final Target OPT_TERCER_NIVEL = Target.the("Opcion SubMenu").locatedBy(dynamicElement(OPT_TERCER_NIVEL_LOCATOR));
}
