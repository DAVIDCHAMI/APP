package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InicioSesionLocator {
    public static final Locator BTN_INGRESAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text, 'INGRESAR')]").withIos("xpath$//XCUIElementTypeLink[contains(@name,'INGRESAR')]");
    public static final Locator TXT_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_Username_UserAuth')]//preceding::android.view.View[1]").withIos("xpath$//XCUIElementTypeTextField[@value='Ingresa el usuario']");
    public static final Locator BTN_CONTINUAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'Button_Continue_UserAuth')]").withIos("xpath$//XCUIElementTypeButton[@name='CONTINUAR']");
    public static final Locator LBL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text, '¡Hola!')]").withIos("xpath$//XCUIElementTypeStaticText[@name='¡Hola!']");
    public static final Locator TXT_CLAVE_DIGITOS_LOCATOR = locator().withAndroid("id$MaskPin").withIos("xpath$//XCUIElementTypeOther[@name='Ingreso de la clave']/XCUIElementTypeOther[9]/XCUIElementTypeOther[3]");
    public static final Locator LBL_CLAVE_INVALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']").withIos("xpath$g");
    public static final Locator BTN_CERRAR_MODAL_CLAVE_NO_VALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']/following-sibling::android.view.View").withIos("xpath$h");
    public static final Locator BTN_CERRAR_SESION_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'CERRAR SESION')]").withIos("xpath$//XCUIElementTypeButton[contains(@name,'CERRAR SESION')]");
    public static final Locator BTN_SI_CERRAR_SESION_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@resource-id='Button_CancelYesModal_ActivateBiometrics']").withIos("xpath$//XCUIElementTypeButton[@name='SI']");
    public static final Locator BTN_VOLVER_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Volver')]").withIos("xpath$//XCUIElementTypeLink[contains(@name,'Volver')]");
    public static final Locator LBL_CLAVE_BLOQUEADA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'CLAVE BLOQUEADA')]").withIos("xpath$n");

    private InicioSesionLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
