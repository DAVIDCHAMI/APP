package co.com.bancolombia.certificacion.app.userinterface.locators;

import co.com.todo1.modelo.builder.Locator;

import static co.com.todo1.modelo.builder.Locator.locator;

public class GeneralLocator {
    public static final Locator BTN_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/following-sibling::android.view.View[contains(@text,'{1}')]");
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SIGUIENTE')]");
    public static final Locator LBL_GUARDADO_EXITOSO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'¡Guardado exitoso!')]");
    public static final Locator LBL_VERIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]");

    public GeneralLocator() {
    }
}
