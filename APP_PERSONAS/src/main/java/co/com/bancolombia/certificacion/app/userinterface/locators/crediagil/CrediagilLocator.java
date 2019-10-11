package co.com.bancolombia.certificacion.app.userinterface.locators.crediagil;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class CrediagilLocator {

    public static final Locator TXT_VALOR_DESEMBOLSAR_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Ingresa el valor a desembolsar']]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField");
    public static final Locator FOCO_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeStaticText[@name='Crediágil']");
    public static final Locator BTN_DESEMBOLSAR_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeButton[@name='DESEMBOLSAR']");
}
