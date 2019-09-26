package co.com.bancolombia.certificacion.app.userinterface.locators.cheque;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class chequeLocator {
    public static final Locator BTN_CONTRAORDENAR_LOCATOR = locator().withAndroid("xpath$//span[text()='CONTRAORDENAR']/..").withIos("xpath$a");
    public static final Locator TXT_NUMERO_CHEQUE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_NumeroDelCheque']").withIos("xpath$a");
    public static final Locator TXT_DESDE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Desde']").withIos("xpath$a");
    public static final Locator TXT_HASTA_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Hasta']").withIos("xpath$a");
    public static final Locator OPT_CUENTA_ASOCIADA_LOCATOR= locator().withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='{1}']").withIos("xpath$a");
    public static final Locator LBL_CONTRAORDEN_EXITOSA_LOCATOR= locator().withAndroid("xpath$//span[text()='¡Contraorden exitosa!']").withIos("xpath$a");
    public static final Locator LBL_COMPROBANTE_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'Comprobante')]").withIos("xpath$a");
    public static final Locator LBL_NUMERO_CHEQUE_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'{0}')]/../span[contains(text(),'{1}')]").withIos("xpath$a");
    public static final Locator LBL_CUENTA_ASOCIADA_LOCATOR= locator().withAndroid("xpath$//span[text()='Cuenta']/../following-sibling::div//span[text()='{0}']").withIos("xpath$a");
}