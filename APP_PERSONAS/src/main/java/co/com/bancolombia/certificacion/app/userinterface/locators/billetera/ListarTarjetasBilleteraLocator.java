package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ListarTarjetasBilleteraLocator {
    public static final Locator LBL_TARJETAS_LISTADAS_LOCATOR = locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
    public static final Locator BTN_ACTIVAR_TARJETA_LOCATOR = locator().withAndroid("xpath$//button[text()='ACTIVAR']").withIos("xpath$d");
    public static final Locator BTN_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator BTN_VISTA_LISTA_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator IMG_TARJETA_LISTA_ELEGIR_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator BTN_QR_LISTA_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator LBL_SALDO_DISPONIBLE_LISTA_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator IMG_TARJETA_CARRUSEL_ELEGIR_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator BTN_QR_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");
    public static final Locator LBL_SALDO_DISPONIBLE_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$d");

    private ListarTarjetasBilleteraLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
