package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.*;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class SaldosMovimientosPage {
    public static final Target CUENTA_ESPECIFICA_PRODUCTO = Target.the("Producto especifico en saldos y movimientos").locatedBy(dynamicElement(OPT_CUENTA_PRODUCTO_LOCATOR));
    public static final Target OPCION_CATEGORIA_PRODUCTOS = Target.the("Categorias productos en saldos y movimientos").locatedBy(dynamicElement(OPCION_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS = Target.the("Categoria especifica en saldos y movimientos").locatedBy(dynamicElement(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target LBL_SIN_MOVIMIENTOS = Target.the("label cuenta sin movimientos").locatedBy(dynamicElement(LBL_SIN_MOVIMIENTOS_LOCATOR));
    public static final Target BTN_DETALLE_PRODUCTO = Target.the("Boton detalles de producto").located(theElementBy(BTN_DETALLE_PRODUCTO_LOCATOR));
    public static final Target BTN_OCULTAR_BANNER = Target.the("Boton ocultar banner saldos movimientos").locatedBy(dynamicElement(BTN_OCULTAR_BANNER_LOCATOR));
    public static final Target CONTENEDOR_INFORMACION_PRODUCTO = Target.the("Contenedor Informacion producto").locatedBy(dynamicElement(CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS = Target.the("Tipo cuenta deposito").locatedBy(dynamicElement(LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS = Target.the("Numero cuenta deposito").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target CONTENEDOR_MOVIMIENTOS = Target.the("Contenedor con detalles de movimiento").locatedBy(dynamicElement(VER_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_FECHA_MOVIMIENTO = Target.the("Label que muestra la fecha del movimiento").locatedBy(dynamicElement(LBL_FECHA_MOVIMIENTO_LOCATOR));
    public static final Target LBL_DESCRIPCION_MOVIMIENTO = Target.the("Label que muestra la descripción del movimiento").locatedBy(dynamicElement(LBL_DESCRIPCION_MOVIMIENTO_LOCATOR));
    public static final Target LBL_SALDO_MOVIMIENTO = Target.the("Label que muestra saldo del movimiento").locatedBy(dynamicElement(LBL_SALDO_LOCATOR));

    private SaldosMovimientosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}