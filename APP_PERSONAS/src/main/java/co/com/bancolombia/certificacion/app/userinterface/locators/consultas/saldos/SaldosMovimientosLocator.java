package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SaldosMovimientosLocator {
    public static final Locator OPT_CUENTA_PRODUCTO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']/../following-sibling::div//span[text()='{1}']").withIos("xpath$a");
    public static final Locator OPT_CUENTA_TAJETA_CREDITO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='{1}']").withIos("xpath$a");
    public static final Locator OPCION_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$(//div[contains(@id,'Expandable')])[{0}]//div[contains(@id,'Title')]//span")
            .withIos("xpath$b");
    public static final Locator OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']")
            .withIos("xpath$c");
    public static final Locator LBL_SIN_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//span[contains(text(),'{0}')]")
            .withIos("xpath$d");
    public static final Locator BTN_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//div[@id='Tabs']//span[text()='Detalle del producto']").withIos("xpath$n");
    public static final Locator BTN_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//div[@id='Tabs']//span[text()='Movimientos']").withIos("xpath$n");
    public static final Locator BTN_OCULTAR_BANNER_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='b5-b1-Content']/android.view.View[2]/android.view.View").withIos("xpath$n");
    public static final Locator CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-Screen_Account_Line']").withIos("xpath$n");
    public static final Locator LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-{0}-AccountContentContainer']//div[1]//i/following-sibling::span")
            .withIos("xpath$e");
    public static final Locator LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-{0}-AccountContentContainer']//div[2]//div[1]//span")
            .withIos("xpath$f");
    public static final Locator LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-0-AccountContentContainer']//div[3]//span")
            .withIos("xpath$g");
    public static final Locator LBL_SALDO_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//*[contains(text(),'{0}')]/ancestor::div[@class='cardlist-item']//*[contains(text(),'{1}')]/ancestor::div[@class='cardlist-item']//div[@class='text-right']")
            .withIos("xpath$g");
    public static final Locator LBL_SALDO_SALDOS_CREDIAGIL_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//android.view.View[contains(@resource-id, '0-{0}')]//android.view.View[3]")
            .withIos("xpath$g");
    public static final Locator VER_MOVIMIENTOS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-AccountDataContainer2']").withIos("xpath$h");
    public static final Locator VER_MOVIMIENTOS_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='l2-{0}-AccountDataContainer3']").withIos("xpath$h");
    public static final Locator LBL_FECHA_MOVIMIENTO_CUENTAS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-AccountDataContainer2']//div/div/div/div/div[1]/span").withIos("xpath$i");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_CUENTAS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-AccountDataContainer2']/div/div/div/div/div[2]/span").withIos("xpath$j");
    public static final Locator LBL_SALDO_CUENTASLOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-AccountDataContainer2']/div/div/div[2]//span").withIos("xpath$k");
    public static final Locator LBL_FECHA_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='l2-{0}-AccountDataContainer3']//div/div/div/div/div[1]/span").withIos("xpath$k");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='l2-{0}-AccountDataContainer3']//div/div/div/div/div[2]/span").withIos("xpath$k");
    public static final Locator LBL_SALDO_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='l2-0-AccountDataContainer3']/div/div/div[2]/div/span").withIos("xpath$k");

    private SaldosMovimientosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}