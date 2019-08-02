package co.com.bancolombia.certificacion.app.userinterface.locators.tarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class TarjetaCreditoLocator {
    public static final Locator TXT_VALOR_PAGAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Ingresa el valor a pagar')]/following-sibling::android.view.View//android.widget.EditText");
    public static final Locator CHK_MONEDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/preceding-sibling::android.widget.Button");
    public static final Locator LBL_TIPO_PAGO_TARJETA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");
    public static final Locator LBL_TIPO_PAGO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");
}
