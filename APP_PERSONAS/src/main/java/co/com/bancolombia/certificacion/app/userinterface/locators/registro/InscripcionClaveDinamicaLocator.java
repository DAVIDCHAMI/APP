package co.com.bancolombia.certificacion.app.userinterface.locators.registro;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class InscripcionClaveDinamicaLocator {
    public static final Locator TXT_NOMBRE_PERSONALIZADO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_CustomName_CustomNameDK']").withIos("xpath$test");
    public static final Locator TXT_CORREO_CLAVE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Email']").withIos("xpath$test");
    public static final Locator CHK_TIPO_CORREO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/preceding-sibling::button").withIos("xpath$test");
    public static final Locator BTN_SIGUIENTE_CLAVE_LOCATOR= locator().withAndroid("xpath$//button[@id='Button_Next_EmailDK']").withIos("xpath$test");
    public static final Locator TXT_NUMERO_CELULAR_LOCATOR= locator().withAndroid("xpath$//input[@id='Input_PhoneNumber_VerifyPhoneDK']");
    public static final Locator CHK_ACEPTO_TERMINOS_LOCATOR= locator().withAndroid("xpath$//input[@id='Checkbox_AcceptTermsConditions_VerifyPhoneDK']").withIos("xpath$test");
    public static final Locator CHK_FOCO_ACEPTO_LOCATOR= locator().withAndroid("xpath$//img[@src='/Personas/img/Bancolombia_Resources.times2.svg?GhP9CS2n0kZPigLrvSfZjg']").withIos("xpath$test");
    public static final Locator BTN_INSCRIBIR_CLAVE_LOCATOR= locator().withAndroid("xpath$//span[text()='Inscribir']/../..").withIos("xpath$test");
    public static final Locator BTN_INSCRIBIR_CLAVE_DINAMICA_LOCATOR= locator().withAndroid("xpath$//android.view.View[@resource-id='Link_LemonEnroll_GetDK2']").withIos("xpath$test");
    public static final Locator BTN_CONTINUAR_SEGUNDA_CLAVE_LOCATOR = locator().withAndroid("xpath$//button[@id='Button_Continuar']").withIos("xpath$test");
    public static final Locator LBL_COMPROBANTE_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Comprobante')]").withIos("xpath$test");
    public static final Locator LNK_ELIMINAR_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='Eliminar']").withIos("xpath$test");
    public static final Locator BTN_ELIMINAR_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//button[text()='ELIMINAR']").withIos("xpath$test");
    public static final Locator LBL_VERIFICACION_ELIMINAR_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//span[text()='Clave dinámica eliminada']/../following-sibling::div//span[text()='{0}']").withIos("xpath$test");
    public static final Locator LBL_VERIFICACION_MENSAJE_CLAVE_DINAMICA_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Eliminación exitosa!']").withIos("xpath$test");

    private InscripcionClaveDinamicaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
