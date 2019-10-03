package co.com.bancolombia.certificacion.app.userinterface.pages.eprepago;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.eprepago.CargarTarjetaVirtualEprepagoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class CargarTarjetaVirtualEprepagoPage {
    public static final Target BTN_DESPLEGAR_EPREPAGO = Target.the("Arrow Down que despliega el detalle de ePrepago").located(theElementBy(BTN_DESPLEGAR_EPREPAGO_LOCATOR));
    public static final Target BTN_SUB_MENU_EPREPAGO = Target.the("Sub menu ePrepago").located(theElementBy(BTN_SUB_MENU_EPREPAGO_LOCATOR));
    public static final Target BTN_RECARGAR_EPREPAGO = Target.the("Botón de recarga ePrepago").located(theElementBy(BTN_RECARGAR_EPREPAGO_LOCATOR));
    public static final Target TXT_VALOR_RECARGA = Target.the("Input que recibe el valor de recarga").located(theElementBy(TXT_VALOR_RECARGA_LOCATOR));
    public static final Target BTN_CARGAR_EPREPAGO = Target.the("Boton confirmación recarga ePrepago").located(theElementBy(BTN_CARGAR_EPREPAGO_LOCATOR));
    public static final Target LNK_RECARGAR_EPREPAGO = Target.the("Link para confirmar recarga ePrepago").located(theElementBy(LNK_RECARGAR_EPREPAGO_LOCATOR));
}