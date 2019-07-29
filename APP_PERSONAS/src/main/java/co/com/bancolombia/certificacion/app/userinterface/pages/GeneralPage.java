package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class GeneralPage {
    public static final Target BTN_SIGUIENTE = Target.the("Boton siguiente").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
    public static final Target LNK_SIGUIENTE = Target.the("Link boton siguiente").located(theElementBy(LNK_SIGUIENTE_LOCATOR));
    public static final Target BTN_PRODUCTO_ORIGEN = Target.the("boton producto origen").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_LOCATOR));
    public static final Target LBL_GUARDADO_EXITOSO = Target.the("Label guardado exitoso").located(theElementBy(LBL_GUARDADO_EXITOSO_LOCATOR));
    public static final Target LBL_GENERACION_EXITOSA = Target.the("Label generación exitosa").located(theElementBy(LBL_GENERACION_EXITOSA_LOCATOR));
    public static final Target LBL_VERIFICACION = Target.the("Label verificación").locatedBy(dynamicElement(LBL_VERIFICACION_LOCATOR));
    public static final Target IMG_LOGO_BANCOLOMBIA = Target.the("Logo Bancolombia").located(theElementBy(IMG_LOGO_BANCOLOMBIA_LOCATOR));
}
