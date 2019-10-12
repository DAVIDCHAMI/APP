package co.com.bancolombia.certificacion.app.userinterface.locators.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DescargarTarjetaVirtualEprepagoLocator {
    public static final Locator BTN_DESCARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='DESCARGAR']").withIos("xpath$q");
    public static final Locator LNK_DESCARGAR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Descargar']").withIos("xpath$q");
    public static final Locator CHK_DESCARGA_TOTAL_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Total']/preceding-sibling::button").withIos("xpath$q");
    public static final Locator CHK_DESCARGA_OTRO_VALOR_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Otro valor']/preceding-sibling::button").withIos("xpath$q");
    public static final Locator LBL_PRODUCTO_DESTINO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='Producto destino']").withIos("xpath$q");
    public static final Locator LBL_DESCARGA_EXITOSA_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Descarga exitosa!']").withIos("xpath$q");
    public static final Locator LBL_VALOR_DESCARGA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]").withIos("xpath$q");

    private DescargarTarjetaVirtualEprepagoLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}