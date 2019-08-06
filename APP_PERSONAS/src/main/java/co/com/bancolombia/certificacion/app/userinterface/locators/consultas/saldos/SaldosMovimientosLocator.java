package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SaldosMovimientosLocator {
    public static final Locator CUENTA_ESPECIFICA_PRODUCTO_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/../..//android.view.View[contains(@text, '{1}')]")
            .withIos("xpath$n");
    public static final Locator OPCION_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'Expandable')][{0}]/android.view.View/android.view.View/android.view.View/android.view.View[1]")
            .withIos("xpath$n");
    public static final Locator OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text, '{0}')]/../..")
            .withIos("xpath$n");
    public static final Locator LBL_SIN_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'{0}')]")
            .withIos("xpath$n");
    public static final Locator BTN_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Detalle del producto')]").withIos("xpath$n");
    public static final Locator BTN_OCULTAR_BANNER_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='b5-b1-Content']/android.view.View[2]/android.view.View").withIos("xpath$n");
    public static final Locator CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@resource-id,'l1-{0}-Screen_Account_Line')]").withIos("xpath$n");
    public static final Locator LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'l1-{0}-AccountContentContainer')]//android.view.View[1]//android.view.View[2]")
            .withIos("xpath$n");
    public static final Locator LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'l1-{0}-AccountContentContainer')]/android.view.View[2]")
            .withIos("xpath$n");
    public static final Locator LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, 'l1-{0}-AccountContentContainer')]//android.view.View[1]//following-sibling::android.view.View[3]")
            .withIos("xpath$n");
    public static final Locator VER_MOVIMIENTOS_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='l1-{0}-AccountDataContainer2']").withIos("xpath$n");
    public static final Locator LBL_FECHA_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='l1-{0}-b35-Column1']//android.view.View[1]").withIos("xpath$n");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='l1-{0}-b35-Column1']//android.view.View[2]").withIos("xpath$n");
    public static final Locator LBL_SALDO_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='l1-{0}-b35-Column2']//android.view.View[1]").withIos("xpath$n");

    private SaldosMovimientosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}