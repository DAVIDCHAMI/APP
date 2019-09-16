package co.com.bancolombia.certificacion.app.userinterface.locators.cheque;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class chequeLocator {
    public static final Locator BTN_CONTRAORDENAR_LOCATOR = locator().withAndroid("xpath//span[text()='CONTRAORDENAR']/..").withIos("xpath$a");
    public static final Locator BTN_FOCO_CHEQUE_LOCATOR = locator().withAndroid("xpath//img[@src='/Personas/img/Bancolombia_Resources.LockYellow.svg?35kl0s0_8xn3wU0XP+5dOQ']").withIos("xpath$a");

}
