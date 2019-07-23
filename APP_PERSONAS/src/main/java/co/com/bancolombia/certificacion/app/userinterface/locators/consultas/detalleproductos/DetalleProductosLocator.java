package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DetalleProductosLocator {
    public static Locator LBL_TIPO_CUENTA_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'ProductDataContainer')]//android.view.View[1]")
            .withIos("");
    public static Locator LBL_NUMERO_CUENTA_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Ahorros')]//following-sibling::android.view.View[2]")
            .withIos("");
    public static Locator LBL_SALDO_DISPONIBLE_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Saldo Disponible')]//following-sibling::android.view.View[2]")
            .withIos("");
}
