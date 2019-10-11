package co.com.bancolombia.certificacion.app.userinterface.pages.eprepago;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.eprepago.CargarTarjetaVirtualEprepagoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class CargarTarjetaVirtualEprepagoPage {
    public static final Target BTN_SUB_MENU_EPREPAGO = Target.the("Submenu ePrepago").located(theElementBy(BTN_SUB_MENU_EPREPAGO_LOCATOR));
    public static final Target BTN_SELECCIONAR_OPCION = Target.the("Selecciona la opción del subMenu de ePrepago con el que se desea interactuar").locatedBy(dynamicElement(BTN_SELECCIONAR_OPCION_LOCATOR));
    public static final Target TXT_VALOR_RECARGA_EPREPAGO = Target.the("Input que recibe el valor de recarga").located(theElementBy(TXT_VALOR_RECARGA_EPREPAGO_LOCATOR));
    public static final Target LNK_RECARGAR_EPREPAGO = Target.the("Link para confirmar recarga ePrepago").located(theElementBy(LNK_RECARGAR_EPREPAGO_LOCATOR));
    public static final Target LBL_RECARGA_EXITOSA_EPREPAGO = Target.the("Mensaje recarga exitosa tarjeta virtual ePrepago").located(theElementBy(LBL_RECARGA_EXITOSA_EPREPAGO_LOCATOR));
    public static final Target LBL_PRODUCTO_ORIGEN_EPREPAGO = Target.the("Foco para identificar cunado un cliente cuenta con mas de una cuenta").located(theElementBy(LBL_PRODUCTO_ORIGEN_EPREPAGO_LOCATOR));
    public static final Target LBL_VALOR_RECARGA_NO_PERMITIDO = Target.the("Label que muestra mensaje sobre el valor permitido al cargar ePrepago").located(theElementBy(LBL_VALOR_RECARGA_NO_PERMITIDO_LOCATOR));
    public static final Target LBL_VALOR_RECARGADO_EPREPAGO = Target.the("Label en el que aparece el valor recargado a la tarjeta virtual ePrepago").locatedBy(dynamicElement(LBL_VALOR_RECARGADO_EPREPAGO_LOCATOR));

    private CargarTarjetaVirtualEprepagoPage(){throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}