package co.com.bancolombia.certificacion.app.userinterface.locators.transferenciaLocator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class TransferenciaLocator {
    public static final Locator TXT_VALOR_TRANSFERENCIA_LOCATOR = locator().withAndroid("xpath$//input[@id='Currency']").withIos("");
    public static final Locator TXT_NUMERO_CUENTA_DESTINO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_ProductNumber']").withIos("");
    public static final Locator BTN_ENVIAR_DINERO_LOCATOR = locator().withAndroid("xpath$//span[text()='ENVIAR DINERO']/..").withIos("");

    private TransferenciaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}