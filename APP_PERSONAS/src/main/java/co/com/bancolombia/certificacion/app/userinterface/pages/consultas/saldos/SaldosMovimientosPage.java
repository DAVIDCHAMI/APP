package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.theElementBy;

public class SaldosMovimientosPage {
    public static final Target CUENTA_ESPECIFICA_PRODUCTO = Target.the("Producto especifico en saldos y movimientos").locatedBy(dynamicElement(CUENTA_ESPECIFICA_PRODUCTO_LOCATOR));
    public static final Target OPCION_CATEGORIA_PRODUCTOS = Target.the("Categorias productos en saldos y movimientos").locatedBy(dynamicElement(OPCION_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS = Target.the("Categoria especifica en saldos y movimientos").locatedBy(dynamicElement(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target TEXTO_SIN_MOVIMIENTO = Target.the("El número de la tarjeta no tiene movimientos").located(theElementBy(TEXTO_SIN_MOVIMIENTO_LOCATOR));
    private SaldosMovimientosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
