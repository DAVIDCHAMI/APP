package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SaldosMovimientosLocator {
    public static final Locator CUENTA_ESPECIFICA_PRODUCTO_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/../..//android.view.View[contains(@text, '{1}')]")
            .withIos("");
    public static final Locator OPCION_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'Expandable')][{0}]/android.view.View/android.view.View/android.view.View/android.view.View[1]")
            .withIos("");
    public static final Locator OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, '{0}')]/../..")
            .withIos("");
    public static final Locator LBL_SIN_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'No has realizado ningún movimiento con la tarjeta.')]")
            .withIos("");
    public static final Locator BTN_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Detalle del producto')]").withIos("");
    public static final Locator BTN_MOVIMIENTOS_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Movimientos')]").withIos("");

    private SaldosMovimientosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}