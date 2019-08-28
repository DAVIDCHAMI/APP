package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DetalleProductosLocator {
    public static final Locator LBL_SALDO_DISPONIBLE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$(//div/span[contains(@class,'font-family-nunito font-family-nunito-bold text-black')])[1]")
            .withIos("");
    public static final Locator LBL_SALDO_CANJE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$(//div/span[contains(@class,'font-family-nunito font-family-nunito-bold text-black')])[3]")
            .withIos("");
    public static final Locator LBL_SALDO_TOTAL_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$(//div/span[contains(@class,'font-family-nunito font-family-nunito-bold text-black')])[4]")
            .withIos("");

    private DetalleProductosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
