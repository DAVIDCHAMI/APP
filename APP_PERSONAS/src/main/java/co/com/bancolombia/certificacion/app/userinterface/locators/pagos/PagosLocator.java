package co.com.bancolombia.certificacion.app.userinterface.locators.pagos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class PagosLocator {
    public static final Locator TXT_NUMERO_TARJETA_LOCATOR = locator().withAndroid("xpath$//input[@id='CreditCard']").withIos("xpath$//XCUIElementTypeStaticText[@name='Ingresa el número de la tarjeta']/../../following-sibling:: XCUIElementTypeOther[1]/XCUIElementTypeTextField");
    public static final Locator TXT_VALOR_PAGAR_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]//input[contains(@id,'Input_PaymentValue')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Ingresa el valor a pagar']/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField");
    public static final Locator CHK_MONEDA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/preceding-sibling::button").withIos("xpath$//XCUIElementTypeStaticText[@value='{0}']/../preceding-sibling:: XCUIElementTypeButton[1]");
    public static final Locator LBL_TIPO_PAGO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]").withIos("xpath$//XCUIElementTypeStaticText[@value='{0}']");
    public static final Locator LNK_PRODUCTO_ORIGEN_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto origen']/../..").withIos("xpath$//XCUIElementTypeStaticText[@name='Producto origen']");
    public static final Locator LBL_CREDITOS_LOCATOR = locator().withAndroid("xpath$//span[text()='Créditos']").withIos("xpath$//XCUIElementTypeStaticText[@value='Créditos']");
    public static final Locator FOCO_PAGOS_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeStaticText[contains(@value,'PAGAR')]");
    public static final Locator FOCO_PAGO_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator FOCO_PAGO_PROPIAS_LOCATOR = locator().withAndroid("xpath$test").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator TXT_TARJETAS_LOCATOR = locator().withAndroid("xpath$TEST").withIos("xpath$//XCUIElementTypeStaticText[@value='Tarjetas']");
    public static final Locator BTN_TAREJETA_PAGAR_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div/div/span[text()='{1}']").withIos("xpath$//XCUIElementTypeStaticText[@value='{0}']/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[@value='{1}']");


    private PagosLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
