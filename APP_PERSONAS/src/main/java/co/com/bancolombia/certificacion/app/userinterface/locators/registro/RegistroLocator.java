package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.todo1.modelo.builder.Locator;

import static co.com.todo1.modelo.builder.Locator.locator;

public class RegistroLocator {
public static Locator TXT_CREAR_USUARIO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[contains(@resource-id, 'Input_usuario2')]//preceding::android.view.View[1]").withIos("id$xxxx");
public static Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("id$Link_Registration_Next").withIos("id$xxxx");
public static Locator TXT_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id, 'Label')]").withIos("id$xxxx");
public static Locator LBL_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Correo electrónico')]").withIos("xpath$xxxx");
public static Locator CHECK_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Personal')]//preceding::android.widget.Button[1]").withIos("xpath$xxxx");
public static Locator CHECK_TYC_LOCATOR = locator().withAndroid("id$Chk_TerminosCondiciones").withIos("id$xxxx");
public static Locator BTN_REGISTRO_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'REGISTRAR')]").withIos("id$xxxx");
public static Locator LBL_VALIDACION_REGISTRO_OK_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Registro exitoso!')]").withIos("id$xxxx");
}