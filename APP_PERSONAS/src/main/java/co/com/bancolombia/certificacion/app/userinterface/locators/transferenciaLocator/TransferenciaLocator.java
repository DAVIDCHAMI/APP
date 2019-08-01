package co.com.bancolombia.certificacion.app.userinterface.locators.transferenciaLocator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class TransferenciaLocator {
    public static final Locator VALOR_TRANSFERENCIA_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Value']").withIos("");
    public static final Locator NUMERO_CUENTA_DESTINO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_ProductNumber']").withIos("");
    public static final Locator BTN_ENVIAR_DINERO_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@text='ENVIAR DINERO']").withIos("");
}