package co.com.bancolombia.certificacion.app.userinterface.pages.tarjetacredito;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.tarjetacredito.TarjetaCreditoLocator.CHK_MONEDA_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.tarjetacredito.TarjetaCreditoLocator.TXT_VALOR_PAGAR_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;

public class TarjetaCreditoPage {
    public static final Target TXT_VALOR_PAGAR = Target.the("Valor a pagar").locatedBy(dynamicElement(TXT_VALOR_PAGAR_LOCATOR));
    public static final Target CHK_MONEDA = Target.the("Check moneda").locatedBy(dynamicElement(CHK_MONEDA_LOCATOR));
}
