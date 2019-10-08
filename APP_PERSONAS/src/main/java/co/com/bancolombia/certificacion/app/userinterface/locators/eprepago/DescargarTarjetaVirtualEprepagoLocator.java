package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DescargarTarjetaVirtualEprepagoLocator {
    public static final Locator BTN_DESCARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='DESCARGAR']").withIos("xpath$q");
    public static final Locator LNK_DESCARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Descargar']").withIos("xpath$q");
    public static final Locator CHK_DESCARGA_TOTAL_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Total']/../button").withIos("xpath$q");

    private DescargarTarjetaVirtualEprepagoLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}