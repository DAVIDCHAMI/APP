package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos;

import co.com.todo1.modelo.builder.Locator;

import static co.com.todo1.modelo.builder.Locator.locator;

public class DetalleProductosLocator {
    public static Locator LBL_NUMERO_CUENTA_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Ahorros')]//following-sibling::android.view.View[2]")
            .withIos("");
    public static Locator LBL_SALDO_DISPONIBLE_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, 'Ahorros')]//following-sibling::android.view.View[2]")
            .withIos("");
}
