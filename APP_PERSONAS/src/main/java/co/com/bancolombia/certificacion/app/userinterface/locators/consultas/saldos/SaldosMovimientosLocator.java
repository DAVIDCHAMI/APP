package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.Locator.locator;

public class SaldosMovimientosLocator {
    public static Locator CUENTA_ESPECIFICA_PRODUCTO_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/../..//android.view.View[contains(@text, '{1}')]")
            .withIos("");
    public static Locator OPCION_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'Expandable')][{0}]/android.view.View/android.view.View/android.view.View/android.view.View[1]")
            .withIos("");
    public static Locator OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, '{0}')]")
            .withIos("");
    public static Locator TEXTO_SIN_MOVIMIENTO_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'No has realizado ningún movimiento con la tarjeta.')]")
            .withIos("");
}


