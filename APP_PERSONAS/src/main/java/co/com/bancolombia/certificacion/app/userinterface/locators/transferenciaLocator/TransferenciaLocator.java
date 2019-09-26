package co.com.bancolombia.certificacion.app.userinterface.locators.transferenciaLocator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class TransferenciaLocator {
    public static final Locator TXT_VALOR_TRANSFERENCIA_LOCATOR = locator().withAndroid("xpath$//div[contains(@id,'MaskedContent')]//input[@id='Currency']").withIos("");
    public static final Locator TXT_FOCO_LOCATOR = locator().withAndroid("xpath$//span[text()='Selecciona el tipo de producto']").withIos("");
    public static final Locator TXT_NUMERO_CUENTA_DESTINO_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_ProductNumber']").withIos("");
    public static final Locator BTN_ENVIAR_DINERO_LOCATOR = locator().withAndroid("xpath$//span[text()='ENVIAR DINERO']/..").withIos("");
    public static final Locator LBL_TRANFERENCIA_EXITOSA_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Transferencia realizada!' or text()='¡Transferencia exitosa!']").withIos("");
    public static final Locator LBL_CUENTA_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../following-sibling::div//span[contains(text(),'{1}')]").withIos("");
    public static final Locator BTN_INVERSIONES_LOCATOR = locator().withAndroid("xpath$//span[text()='Inversiones']").withIos("xpath$n");
    public static final Locator BTN_CUENTAS_LOCATOR = locator().withAndroid("xpath$//span[text()='Cuentas']").withIos("xpath$n");
    public static final Locator LBL_VALOR_LOCATOR = locator().withAndroid("xpath$//span[text()='Valor enviado']/../following-sibling::div/span[contains(text(),'{0}')]").withIos("xpath$n");
    public static final Locator BTN_TIPO_PRODUCTO_DESTINO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']").withIos("xpath$n");

    private TransferenciaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}