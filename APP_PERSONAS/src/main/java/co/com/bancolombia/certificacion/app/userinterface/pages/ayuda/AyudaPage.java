package co.com.bancolombia.certificacion.app.userinterface.pages.ayuda;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.ayuda.AyudaLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class AyudaPage {
    public static final Target LNK_AYUDA = Target.the("Link de botón ayuda").located(theElementBy(LNK_AYUDA_LOCATOR));
    public static final Target LBL_MENSAJE_PANTALLA = Target.the("Mensaje en pantalla de verificación").locatedBy(dynamicElement(LBL_MENSAJE_PANTALLA_LOCATOR));
    public static final Target BTN_OPCION = Target.the("Submenu ayuda").locatedBy(dynamicElement(BTN_OPCION_LOCATOR));
    public static final Target LBL_TITULO_VISTA_WEB = Target.the("Label título de vista web").locatedBy(dynamicElement(LBL_TITULO_VISTA_WEB_LOCATOR));

    private AyudaPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}