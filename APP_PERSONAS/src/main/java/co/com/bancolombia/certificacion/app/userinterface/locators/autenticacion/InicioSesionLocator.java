package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InicioSesionLocator {
    public static final Locator TXT_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_Username_UserAuth')]//preceding::android.view.View[1]").withIos("id$xxxx");
    public static final Locator BTN_CONTINUAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'Button_Continue_UserAuth')]").withIos("class$xxxx");
    public static final Locator LBL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, '¡Hola!')]").withIos("class$xxxx");
    public static final Locator LBL_IMAGEN_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, 'Verifica la imagen y frase de seguridad')]").withIos("class$xxxx");
    public static final Locator TXT_CLAVE_DIGITOS_LOCATOR = locator().withAndroid("id$MaskPin").withIos("class$xxxx");
    public static final Locator LBL_CLAVE_INVALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']").withIos("id$xxx");
    public static final Locator BTN_CERRAR_MODAL_CLAVE_NO_VALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']/following-sibling::android.view.View").withIos("id$xxx");
    public static final Locator BTN_CERRAR_SESION_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'CERRAR SESION')]").withIos("id$xxx");
    public static final Locator BTN_SI_CERRAR_SESION_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@resource-id='Button_CancelYesModal_ActivateBiometrics']").withIos("id$xxx");
    public static final Locator BTN_VOLVER_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Volver')]").withIos("id$xxx");
    public static final Locator LBL_CLAVE_BLOQUEADA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Clave bloqueada')]").withIos("id$xxx");
}
