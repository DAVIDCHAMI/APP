package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DatosPagoBilleteraLocator {
    public static final Locator TXT_INGRESAR_VALOR_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator TXT_INGRESAR_VALOR_PROPINA_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator BTN_SIGUIENTE_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");

    private DatosPagoBilleteraLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
