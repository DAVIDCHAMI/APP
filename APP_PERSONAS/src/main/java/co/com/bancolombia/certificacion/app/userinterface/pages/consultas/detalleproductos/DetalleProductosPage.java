package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos.DetalleProductosLocator.LBL_NUMERO_CUENTA_LOCATOR;
import static co.com.todo1.utils.ElementFinder.dynamicElement;

public class DetalleProductosPage {
    public static final Target LBL_NUMERO_CUENTA = Target.the("Numero cuenta deposito").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_LOCATOR));
}
