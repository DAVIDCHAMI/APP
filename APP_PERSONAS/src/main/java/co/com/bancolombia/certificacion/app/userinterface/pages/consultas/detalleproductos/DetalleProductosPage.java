package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos.DetalleProductosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class DetalleProductosPage {
    public static final Target LBL_SALDO_DISPONIBLE_DETALLE = Target.the("Saldo disponible producto").located(theElementBy(LBL_SALDO_DISPONIBLE_DETALLE_LOCATOR));
    public static final Target LBL_SALDO_CANJE_DETALLE = Target.the("Saldo canje cuenta producto").located(theElementBy(LBL_SALDO_CANJE_DETALLE_LOCATOR));
    public static final Target LBL_SALDO_TOTAL_DETALLE = Target.the("Saldo total cuenta producto").located(theElementBy(LBL_SALDO_TOTAL_DETALLE_LOCATOR));

    private DetalleProductosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
