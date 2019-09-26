package co.com.bancolombia.certificacion.app.userinterface.pages.eprepago;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.eprepago.ActivacionInactivacionEprepagoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ActivacionInactivacionEprepagoPage {

    public static final Target BTN_MAS_OPCIONES_EPREPAGO = Target.the("Boton mas opciones eprepago").located(theElementBy(BTN_MAS_OPCIONES_EPREPAGO_LOCATOR));
    public static final Target OPT_EPREPAGO = Target.the("opciones eprepago").locatedBy(dynamicElement(OPT_EPREPAGO_LOCATOR));
    public static final Target BTN_GENERAR_EPREPAGO = Target.the("boton generar eprepago").located(theElementBy(BTN_GENERAR_EPREPAGO_LOCATOR));
    public static final Target LBL_GENERARACION_EXITOSA = Target.the("label generacion exitosa eprepago").located(theElementBy(LBL_GENERARACION_EXITOSA_LOCATOR));
    public static final Target TXT_CAMPOS_ACTIVACION_EPREPAGO = Target.the("campos activacion eprepago").locatedBy(dynamicElement(TXT_CAMPOS_ACTIVACION_EPREPAGO_LOCATOR));
    public static final Target BTN_CANCELAR_ACTIVACION_EPREPAGO = Target.the("boton cancelar activacion eprepago").located(theElementBy(BTN_CANCELAR_ACTIVACION_EPREPAGO_LOCATOR));

    private ActivacionInactivacionEprepagoPage() {throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}
