package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.todo1.modelo.builder.Locator;

import static co.com.todo1.modelo.builder.Locator.locator;

public class BilleteraLocator {
    public static Locator BTN_SIGUIENTE_ON_BOARDING_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id,'Button_Next_ActivateBiometricsStep2')]").withIos("id$Hola");
    public static Locator CHK_TERMINOS_CONDICIONES_BILLETERA_LOCATOR = locator().withAndroid("xpath$//android.widget.CheckBox[contains(@resource-id,'Chk_TerminosCondiciones')]").withIos("id$Hola");
    public static Locator BTN_COMENZAR_REGISTRO_BILLETERA_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'COMENZAR')]").withIos("id$Hola");
}
