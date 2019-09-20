package co.com.bancolombia.certificacion.app.userinterface.pages.pagos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.BTN_PRODUCTO_ORIGEN_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.pagos.PagosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class PagosPage {
    public static final Target TXT_NUMERO_TARJETA = Target.the("Número de tarjeta de crédito").locatedBy(dynamicElement(TXT_NUMERO_TARJETA_LOCATOR));
    public static final Target TXT_VALOR_PAGAR = Target.the("Valor a pagar").locatedBy(dynamicElement(TXT_VALOR_PAGAR_LOCATOR));
    public static final Target CHK_MONEDA = Target.the("Check moneda").locatedBy(dynamicElement(CHK_MONEDA_LOCATOR));
    public static final Target LBL_TIPO_PAGO = Target.the("Tipo pago").locatedBy(dynamicElement(LBL_TIPO_PAGO_LOCATOR));
    public static final Target BTN_TARJETA_CREDITO_PAGAR= Target.the("Tarjeta de crédito a pagar").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_LOCATOR));
    public static final Target LNK_PRODUCTO_ORIGEN= Target.the("Link producto origen question").locatedBy(dynamicElement(LNK_PRODUCTO_ORIGEN_LOCATOR));
    public static final Target LBL_CREDITOS= Target.the("Label créditos").located(theElementBy(LBL_CREDITOS_LOCATOR));
    public static final Target BTN_CREDITO = Target.the("Botón crédito").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_LOCATOR));

    private PagosPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}