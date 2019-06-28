package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.BaseLocatorBuilder;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.BaseLocatorBuilder.locator;

public class InicioSesionLocator {
    public static BaseLocatorBuilder TXT_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_Username_UserAuth')]").withIos("id$xxxx");
    public static BaseLocatorBuilder BTN_CONTINUAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'Button_Continue_UserAuth')]").withIos("class$xxxx");
    public static BaseLocatorBuilder LABEL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, '¡Hola!')]").withIos("class$xxxx");
    public static BaseLocatorBuilder LABEL_IMAGEN_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, 'Verifica la imagen y frase de seguridad')]").withIos("class$xxxx");
    public static BaseLocatorBuilder CLAVE_DIGITOS_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id= 'Input_TextVar{0}']").withIos("class$xxxx");
}
