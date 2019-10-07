package co.com.bancolombia.certificacion.app.userinterface.pages.eprepago;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.eprepago.DescargarTarjetaVirtualEprepagoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class DescargarTarjetaVirtualEprepagoPage {
    public static final Target BTN_DESCARGAR_EPREPAGO = Target.the("Botón descargar ePrepago").located(theElementBy(BTN_DESCARGAR_EPREPAGO_LOCATOR));
    public static final Target BTN_DESCARGA_TOTAL_EPREPAGO = Target.the("Botón descarga saldo total ePrapago").located(theElementBy(BTN_DESCARGA_TOTAL_EPREPAGO_LOCATOR));
    public static final Target LNK_DESCARGAR_EPREPAGO = Target.the("Link descargar ePrepago").located(theElementBy(LNK_DESCARGAR_EPREPAGO_LOCATOR));

    private DescargarTarjetaVirtualEprepagoPage(){throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}