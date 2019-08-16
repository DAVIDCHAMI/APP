package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class GeneralLocator {
    public static final Locator BTN_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/following-sibling::android.view.View[contains(@text,'{1}')]").withIos("xpath$a");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SIGUIENTE')]").withIos("xpath$//XCUIElementTypeButton[@name='SIGUIENTE']");
    public static final Locator LNK_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Siguiente')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Siguiente']");
    public static final Locator LBL_GUARDADO_EXITOSO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Guardado exitoso!')]").withIos("xpath$b");
    public static final Locator LBL_GENERACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Generación exitosa!')]").withIos("xpath$c");
    public static final Locator LBL_VERIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]").withIos("xpath$q");
    public static final Locator LNK_SALTAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Saltar')]").withIos("xpath$w");
    public static final Locator LNK_COMENZAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Comenzar')]").withIos("xpath$e");
    public static final Locator IMG_COMUN_CAMPO_TEXTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Inicia el registro')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Inicia el registro']");
    public static final Locator LNK_INSCRIBIR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Inscribir')]").withIos("xpath$b");
    public static final Locator BTN_CANCELAR_TRANSACCION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Cancelar')]").withIos("xpath$");
    public static final Locator BTN_SI_CANCELAR_REGISTRO_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@resource-id, 'btn_ModalSi')]").withIos("xpath$");

    private GeneralLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}