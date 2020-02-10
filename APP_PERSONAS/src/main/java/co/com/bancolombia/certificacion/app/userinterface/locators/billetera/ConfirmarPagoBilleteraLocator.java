package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ConfirmarPagoBilleteraLocator {
    public static final Locator LBL_NOMBRE_ESTABLECIMIENTO_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_TIPO_TARJETA_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_NUMERO_TARJETA_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_NUEVO_SALDO_DISPONIBLE_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_SUBTOTAL_PAGO_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_IVA_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_INC_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_PROPINA_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_TOTAL_PAGADO_CONFIRMAR_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_COMPROBANTE_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator LBL_FECHA_PAGO_REALIZADO_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator BTN_REALIZAR_OTRO_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");

    private ConfirmarPagoBilleteraLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
