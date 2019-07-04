package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator.locator;

public class InicioSesionLocator {
   // public static Locator TXT_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'b10-Input')]").withIos("id$xxxx");
    public static Locator TXT_USUARIO_LOCATOR = locator().withAndroid("id$b10-Label").withIos("id$xxxx");
    public static Locator BTN_CONTINUAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'Button_Continue_UserAuth')]").withIos("class$xxxx");
    public static Locator LABEL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, '¡Hola!')]").withIos("class$xxxx");
    public static Locator LABEL_IMAGEN_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, 'Verifica la imagen y frase de seguridad')]").withIos("class$xxxx");
    public static Locator CLAVE_DIGITOS_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id= 'Input_TextVar{0}']").withIos("class$xxxx");
    public  static Locator LBL_SALDOS_LOCATOR = locator().withAndroid("id$b3-YellowTitle").withIos("id$xxx");
    public  static Locator LBL_CLAVE_INVALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']").withIos("id$xxx");
}
