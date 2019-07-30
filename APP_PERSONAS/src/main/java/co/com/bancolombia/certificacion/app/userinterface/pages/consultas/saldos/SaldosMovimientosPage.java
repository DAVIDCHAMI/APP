package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class SaldosMovimientosPage {
    public static final Target CUENTA_ESPECIFICA_PRODUCTO = Target.the("Producto especifico en saldos y movimientos").locatedBy(dynamicElement(CUENTA_ESPECIFICA_PRODUCTO_LOCATOR));
    public static final Target OPCION_CATEGORIA_PRODUCTOS = Target.the("Categorias productos en saldos y movimientos").locatedBy(dynamicElement(OPCION_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS = Target.the("Categoria especifica en saldos y movimientos").locatedBy(dynamicElement(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target LBL_SIN_MOVIMIENTOS = Target.the("label cuenta sin movimientos").located(theElementBy(LBL_SIN_MOVIMIENTOS_LOCATOR));
    public static final Target BTN_DETALLE_PRODUCTO = Target.the("Boton detalles de producto").located(theElementBy(BTN_DETALLE_PRODUCTO_LOCATOR));
    public static final Target BTN_MOVIMIENTOS = Target.the("Boton Movimientos").located(theElementBy(BTN_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_BANNER_CONTENIDO = Target.the("Label titulo banner Contenido en saldos movimientos").located(theElementBy(LBL_BANNER_CONTENIDO_LOCATOR));
    public static final Target BTN_OCULTAR_BANNER = Target.the("Boton ocultar banner saldos movimientos").located(theElementBy(BTN_OCULTAR_BANNER_LOCATOR));
    //Productos asociados
    public static final Target CONTENEDOR_INFORMACION_PRODUCTO = Target.the("Contenedor Informacion producto").locatedBy(dynamicElement(CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR));
    public static final Target OPT_CATEGORIA_PRODUCTOS = Target.the("Opcion categoria de productos Saldos Movimientos").locatedBy(dynamicElement(OPT_CATEGORIA_PRODUCTOS_LOCATOR));

    private SaldosMovimientosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}