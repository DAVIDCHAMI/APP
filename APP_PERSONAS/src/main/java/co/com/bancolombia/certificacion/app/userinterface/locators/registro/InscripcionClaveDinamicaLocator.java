package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscripcionClaveDinamicaLocator {
    public static final Locator TXT_NOMBRE_PERSONALIZADO_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_CustomName_CustomNameDK']").withIos("xpath$test");
    public static final Locator TXT_CORREO_CLAVE_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Email']").withIos("xpath$test");
    public static final Locator CHK_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../button").withIos("xpath$test");
    public static final Locator BTN_SIGUIENTE_CLAVE_LOCATOR= locator().withAndroid("xpath$//android.widget.Button[@text='SIGUIENTE']").withIos("xpath$test");
    public static final Locator TXT_NUMERO_CELULAR_LOCATOR= locator().withAndroid("xpath$/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]").withIos("xpath$test");
    public static final Locator CHK_ACEPTO_TERMINOS_LOCATOR= locator().withAndroid("xpath$//android.widget.CheckBox[@resource-id='Checkbox_AcceptTermsConditions_VerifyPhoneDK']").withIos("xpath$test");
    public static final Locator BTN_INSCRIBIR_CLAVE_LOCATOR= locator().withAndroid("xpath$//android.widget.Button[@resource-id='Button_Enroll_VerifyPhoneDK']").withIos("xpath$test");
    public static final Locator BTN_INSCRIBIR_CLAVE_DINAMICA_LOCATOR= locator().withAndroid("xpath$//android.view.View[@resource-id='Link_LemonEnroll_GetDK2']").withIos("xpath$test");
    public static final Locator BTN_CONTINUAR_SEGUNDA_CLAVE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@resource-id='Button_Continuar']").withIos("xpath$test");
    public static final Locator LBL_COMPROBANTE_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Comprobante')]").withIos("xpath$test");

    private InscripcionClaveDinamicaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
