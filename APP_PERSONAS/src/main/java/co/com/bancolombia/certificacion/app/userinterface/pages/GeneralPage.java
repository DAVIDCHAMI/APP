package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.*;
import static co.com.todo1.utils.ElementFinder.dynamicElement;
import static co.com.todo1.utils.ElementFinder.theElementBy;

public class GeneralPage {
    public static final Target BTN_SIGUIENTE = Target.the("Boton siguiente").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
    public static final Target BTN_PRODUCTO_ORIGEN = Target.the("boton producto origen").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_LOCATOR));
    public static final Target LBL_GUARDADO_EXITOSO = Target.the("Label guardado exitoso").located(theElementBy(LBL_GUARDADO_EXITOSO_LOCATOR));
    public static final Target LBL_VERIFICACION = Target.the("Label verificación").locatedBy(dynamicElement(LBL_VERIFICACION_LOCATOR));
}
