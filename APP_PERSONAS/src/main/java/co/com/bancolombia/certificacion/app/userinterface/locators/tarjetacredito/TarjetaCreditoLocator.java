package co.com.bancolombia.certificacion.app.userinterface.locators.tarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class TarjetaCreditoLocator {
    public static final Locator TXT_NUMERO_TARJETA_LOCATOR = locator().withAndroid("xpath$//input[@id='CreditCard']");
    public static final Locator TXT_VALOR_PAGAR_LOCATOR = locator().withAndroid("xpath$//span[text()='Ingresa el valor a pagar']/ancestor::div[contains(@id,'Label')]/following-sibling::div/div/div/div/div[1]//input");
    public static final Locator CHK_MONEDA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/preceding-sibling::button");
    public static final Locator LBL_TIPO_PAGO_TARJETA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]");
    public static final Locator LNK_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto origen']/../..");

    private TarjetaCreditoLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
