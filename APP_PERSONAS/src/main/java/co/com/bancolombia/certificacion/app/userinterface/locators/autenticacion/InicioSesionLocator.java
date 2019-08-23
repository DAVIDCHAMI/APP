package co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InicioSesionLocator {
    public static final Locator BTN_INGRESAR_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'INGRESAR')]").withIos("xpath$//XCUIElementTypeLink[contains(@name,'INGRESAR')]");
    public static final Locator TXT_USUARIO_LOCATOR = locator().withAndroid("id$Input_Username_UserAuth").withIos("xpath$//XCUIElementTypeTextField[@value='Ingresa el usuario']");
    public static final Locator BTN_CONTINUAR_LOCATOR = locator().withAndroid("id$Button_Continue_UserAuth").withIos("xpath$//XCUIElementTypeButton[@name='CONTINUAR']");
    public static final Locator LBL_HOLA_PROVIVIONAL_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'Hola')]").withIos("xpath$//XCUIElementTypeStaticText[@name='¡Hola!']");
    public static final Locator TXT_CLAVE_DIGITOS_LOCATOR = locator().withAndroid("xpath$//div/span[contains(@class,'inputPass OSFillParent')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Ingresa la clave']//following::XCUIElementTypeOther[1]");
    public static final Locator LBL_CLAVE_INVALIDA_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'CLAVE NO VALIDA')]").withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'CLAVE NO VALIDA')]");
    public static final Locator BTN_CERRAR_MODAL_CLAVE_NO_VALIDA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='CLAVE NO VALIDA']/following-sibling::android.view.View").withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'CLAVE NO VALIDA')]/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeOther//XCUIElementTypeStaticText");
    public static final Locator BTN_CERRAR_SESION_LOCATOR = locator().withAndroid("id$Next").withIos("xpath$//XCUIElementTypeButton[contains(@name,'CERRAR SESION')]");
    public static final Locator BTN_SI_CERRAR_SESION_LOCATOR = locator().withAndroid("id$Button_CancelYesModal_ActivateBiometrics").withIos("xpath$//XCUIElementTypeButton[@name='SI']");
    public static final Locator BTN_VOLVER_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Volver')]").withIos("xpath$//XCUIElementTypeLink[contains(@name,'Volver')]");
    public static final Locator LBL_CLAVE_BLOQUEADA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'CLAVE BLOQUEADA')]").withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'CLAVE BLOQUEADA')]");
    public static final Locator LBL_SALDO_DISPONIBLE_LOCATOR = locator().withAndroid("xpath$//*[contains(text(),'Saldo disponible')]").withIos("xpath$test");

    private InicioSesionLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
