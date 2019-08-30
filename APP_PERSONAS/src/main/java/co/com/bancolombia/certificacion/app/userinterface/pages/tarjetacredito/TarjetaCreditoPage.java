package co.com.bancolombia.certificacion.app.userinterface.pages.tarjetacredito;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.tarjetacredito.TarjetaCreditoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;

public class TarjetaCreditoPage {
    public static final Target TXT_NUMERO_TARJETA = Target.the("Número de tarjeta de crédito").locatedBy(dynamicElement(TXT_NUMERO_TARJETA_LOCATOR));
    public static final Target TXT_VALOR_PAGAR = Target.the("Valor a pagar").locatedBy(dynamicElement(TXT_VALOR_PAGAR_LOCATOR));
    public static final Target CHK_MONEDA = Target.the("Check moneda").locatedBy(dynamicElement(CHK_MONEDA_LOCATOR));
    public static final Target LBL_TIPO_PAGO_TARJETA = Target.the("Tipo pago").locatedBy(dynamicElement(LBL_TIPO_PAGO_TARJETA_LOCATOR));

    private TarjetaCreditoPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
