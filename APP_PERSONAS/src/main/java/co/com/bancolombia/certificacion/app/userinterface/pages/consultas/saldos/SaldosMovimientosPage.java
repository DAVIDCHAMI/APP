package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.CUENTA_ESPECIFICA_PRODUCTO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.dynamicElement;

public class SaldosMovimientosPage {
    public static final Target CUENTA_ESPECIFICA_PRODUCTO = Target.the("Producto especifico en saldos y movimientos").locatedBy(dynamicElement(CUENTA_ESPECIFICA_PRODUCTO_LOCATOR));
    public static final Target OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS = Target.the("Categoria especifica en saldos y movimientos").locatedBy(dynamicElement(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR));

    private SaldosMovimientosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
