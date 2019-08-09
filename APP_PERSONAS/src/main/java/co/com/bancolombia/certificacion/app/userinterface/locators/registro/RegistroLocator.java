package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class RegistroLocator {
    public static final Locator TXT_CREAR_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_usuario2')]//preceding::android.view.View[1]").withIos("xpath$//XCUIElementTypeTextField[contains(@value,'Crea un usuario')]");
    public static final Locator IMG_CREAR_USUARIO_LOCATOR = locator().withAndroid("xpath$a").withIos("id$Iconografia/accionables/Usuario");
    public static final Locator TXT_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id, 'Label')]").withIos("xpath$//XCUIElementTypeStaticText[@name=‘Ingresa el correo electrónica']");
    public static final Locator LBL_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Correo electrónico')]").withIos("xpath$");
    public static final Locator CHECK_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Personal')]//preceding::android.widget.Button[1]").withIos("xpath$");
    public static final Locator CHECK_TYC_LOCATOR = locator().withAndroid("id$Chk_TerminosCondiciones").withIos("xpath$");
    public static final Locator BTN_REGISTRO_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'REGISTRAR')]").withIos("xpath$");
    public static final Locator LBL_VALIDACION_REGISTRO_OK_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Registro exitoso!')]").withIos("xpath$");

    private RegistroLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}