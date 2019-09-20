package co.com.bancolombia.certificacion.app.userinterface.locators.pagos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class PagosLocator {
    public static final Locator TXT_NUMERO_TARJETA_LOCATOR = locator().withAndroid("xpath$//input[@id='CreditCard']");
    public static final Locator TXT_VALOR_PAGAR_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]//input[contains(@id,'Input_PaymentValue')]");
    public static final Locator CHK_MONEDA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/preceding-sibling::button");
    public static final Locator LBL_TIPO_PAGO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]");
    public static final Locator LNK_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto origen']/../..");
    public static final Locator LBL_CREDITOS_LOCATOR = locator().withAndroid("xpath$//span[text()='Créditos']");

    private PagosLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
