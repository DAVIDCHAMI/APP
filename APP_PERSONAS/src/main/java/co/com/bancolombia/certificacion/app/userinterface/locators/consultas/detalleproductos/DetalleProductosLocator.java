package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DetalleProductosLocator {
    public static final Locator LBL_SALDO_DISPONIBLE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'ProductDataContainer')]/android.view.View[4]")
            .withIos("");
    public static final Locator LBL_SALDO_CANJE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Saldo en canje')]/../following-sibling::android.view.View[1]")
            .withIos("");
    public static final Locator LBL_SALDO_TOTAL_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Saldo total')]/../following-sibling::android.view.View[1]")
            .withIos("");

    private DetalleProductosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
