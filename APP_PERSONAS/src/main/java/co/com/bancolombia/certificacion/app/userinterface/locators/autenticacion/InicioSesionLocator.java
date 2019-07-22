package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator.locator;

public class InicioSesionLocator {
    public static Locator TXT_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_Username_UserAuth')]//preceding::android.view.View[1]").withIos("id$xxxx");
    public static Locator BTN_CONTINUAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'Button_Continue_UserAuth')]").withIos("class$xxxx");
    public static Locator LABEL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, '¡Hola!')]").withIos("class$xxxx");
    public static Locator LABEL_IMAGEN_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, 'Verifica la imagen y frase de seguridad')]").withIos("class$xxxx");
    public static Locator TXT_CLAVE_DIGITOS_LOCATOR = locator().withAndroid("id$MaskPin").withIos("class$xxxx");
    public static Locator LBL_SALDOS_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, 'Saldos y movimientos')]").withIos("id$xxx");
    public static Locator LBL_CLAVE_INVALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']").withIos("id$xxx");
    public static Locator BTN_CERRAR_SESION_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@resource-id='Next']").withIos("id$xxx");
    public static Locator BTN_SI_CERRAR_SESION_LOCATOR_= locator().withAndroid("xpath$//android.widget.Button[@resource-id='Button_CancelYesModal_ActivateBiometrics']").withIos("id$xxx");
}
