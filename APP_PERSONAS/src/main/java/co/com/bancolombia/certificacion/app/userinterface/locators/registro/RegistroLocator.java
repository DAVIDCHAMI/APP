package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class RegistroLocator {
    public static final Locator TXT_CREAR_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_usuario2')]//preceding::android.view.View[1]").withIos("xpath$//XCUIElementTypeTextField[contains(@value,'Crea un usuario')]");
    public static final Locator TXT_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id, 'Label')]").withIos("xpath$//XCUIElementTypeStaticText[@value='Ingresa el correo electrónico']/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeTextField");
    public static final Locator LBL_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Correo electrónico')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Correo electrónico']");
    public static final Locator LBL_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$S").withIos("xpath$//XCUIElementTypeStaticText[@name='Selecciona el tipo de correo']");
    public static final Locator CHECK_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Personal')]//preceding::android.widget.Button[1]").withIos("xpath$//XCUIElementTypeStaticText[contains(@name, 'Personal')]/../../XCUIElementTypeButton[1]");
    public static final Locator CHECK_TYC_LOCATOR = locator().withAndroid("id$Chk_TerminosCondiciones").withIos("xpath$//XCUIElementTypeStaticText[@name='Laboral']//following::XCUIElementTypeSwitch[1]");
    public static final Locator BTN_REGISTRO_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'REGISTRAR')]").withIos("xpath$//XCUIElementTypeButton[@name='REGISTRAR']");
    public static final Locator LBL_VALIDACION_REGISTRO_OK_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Registro exitoso!')]").withIos("xpath$//XCUIElementTypeStaticText[@name='¡Registro exitoso!']");
    public static final Locator IMG_CREAR_USUARIO_LOCATOR = locator().withAndroid("xpath$a").withIos("id$Iconografia/accionables/Usuario");
    public static final Locator LBL_INICIA_REGISTRO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Inicia el registro')]").withIos("xpath$");

    private RegistroLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}