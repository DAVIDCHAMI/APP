package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class SaldosMovimientosPage {
    public static final Target CUENTA_ESPECIFICA_PRODUCTO = Target.the("Producto especifico en saldos y movimientos").locatedBy(dynamicElement(OPT_CUENTA_PRODUCTO_LOCATOR));
    public static final Target CUENTA_ESPECIFICA_TARJETA_CREDITO = Target.the("Producto especifico en saldos y movimientos para tarjeta de crédito").locatedBy(dynamicElement(OPT_CUENTA_TAJETA_CREDITO_LOCATOR));
    public static final Target CUENTA_ESPECIFICA_EPREPAGO = Target.the("Producto especifico en saldos y movimientos para eprepago").locatedBy(dynamicElement(OPT_CUENTA_EPREPAGO_LOCATOR));
    public static final Target OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS = Target.the("Categoria especifica en saldos y movimientos").locatedBy(dynamicElement(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR));
    public static final Target LBL_SIN_MOVIMIENTOS = Target.the("label cuenta sin movimientos").locatedBy(dynamicElement(LBL_SIN_MOVIMIENTOS_LOCATOR));
    public static final Target BTN_DETALLE_PRODUCTO = Target.the("Boton detalles de producto").located(theElementBy(BTN_DETALLE_PRODUCTO_LOCATOR));
    public static final Target BTN_MOVIMIENTO = Target.the("Boton movimientos").located(theElementBy(BTN_MOVIMIENTO_LOCATOR));
    public static final Target BTN_OCULTAR_BANNER = Target.the("Boton ocultar banner saldos movimientos").locatedBy(dynamicElement(BTN_OCULTAR_BANNER_LOCATOR));
    public static final Target CONTENEDOR_INFORMACION_PRODUCTO = Target.the("Contenedor Informacion producto").locatedBy(dynamicElement(CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS = Target.the("Tipo cuenta deposito").locatedBy(dynamicElement(LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS = Target.the("Numero cuenta deposito").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_SALDO_MOVIMIENTOS = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_SALDOS_MOVIMIENTOS_LOCATOR));
    public static final Target LBL_SALDO_CUENTAS = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_SALDO_CUENTAS_LOCATOR));
    public static final Target CONTENEDOR_MOVIMIENTOS_CUENTA = Target.the("Contenedor con detalles de movimiento").locatedBy(dynamicElement(VER_MOVIMIENTOS_LOCATOR));
    public static final Target CONTENEDOR_MOVIMIENTOS_TARJETA = Target.the("Contenedor con detalles de movimiento de tarjetas de credito").locatedBy(dynamicElement(VER_MOVIMIENTOS_TARJETA_CREDITO_LOCATOR));
    public static final Target CONTENEDOR_MOVIMIENTOS_EPREPAGO = Target.the("Contenedor con detalles de movimiento de e prepago").locatedBy(dynamicElement(VER_MOVIMIENTOS_EPREPAGO_LOCATOR));
    public static final Target LBL_FECHA_CUENTA_MOVIMIENTO = Target.the("Label que muestra la fecha del movimiento").locatedBy(dynamicElement(LBL_FECHA_MOVIMIENTO_CUENTAS_LOCATOR));
    public static final Target LBL_DESCRIPCION_CUENTA_MOVIMIENTO = Target.the("Label que muestra la descripcion del movimiento").locatedBy(dynamicElement(LBL_DESCRIPCION_MOVIMIENTO_CUENTAS_LOCATOR));
    public static final Target LBL_SALDO_CUENTA_MOVIMIENTO = Target.the("Label que muestra saldo del movimiento").locatedBy(dynamicElement(LBL_SALDO_CUENTASLOCATOR));
    public static final Target LBL_FECHA_MOVIMIENTO_TARJETA_CREDITO = Target.the("Label que muestra la fecha del movimiento de tarjeta de credito").locatedBy(dynamicElement(LBL_FECHA_MOVIMIENTO_TARJETA_CREDITO_LOCATOR));
    public static final Target LBL_FECHA_MOVIMIENTO_EPREPAGO = Target.the("Label que muestra la fecha del movimiento de e prepago").locatedBy(dynamicElement(LBL_FECHA_MOVIMIENTO_EPREPAGO_LOCATOR));
    public static final Target LBL_DESCRIPCION_MOVIMIENTO_TARJETA_CREDITO = Target.the("Label que muestra la descripcion del movimiento de tarjeta de credito").locatedBy(dynamicElement(LBL_DESCRIPCION_MOVIMIENTO_TARJETA_CREDITO_LOCATOR));
    public static final Target LBL_DESCRIPCION_MOVIMIENTO_EPREPAGO = Target.the("Label que muestra la descripcion del movimiento de e prepago").locatedBy(dynamicElement(LBL_DESCRIPCION_MOVIMIENTO_EPREPAGO_LOCATOR));
    public static final Target LBL_SALDO_MOVIMIENTO_TARJETA_CREDITO = Target.the("Label que muestra saldo del movimiento de tarjeta de credito").locatedBy(dynamicElement(LBL_SALDO_MOVIMIENTO_TARJETA_CREDITO_LOCATOR));
    public static final Target LBL_SALDO_MOVIMIENTO_EPREPAGO = Target.the("Label que muestra saldo del movimiento de e prepago").locatedBy(dynamicElement(LBL_SALDO_MOVIMIENTO_EPREPAGO_LOCATOR));
    public static final Target LBL_SALDO_CREDIAGIL_MOVIMIENTOS = Target.the("Saldo disponible cuenta crediagil").locatedBy(dynamicElement(LBL_SALDO_CREDIAGIL_MOVIMIENTOS_LOCATOR));
    public static final Target BTN_FILTRO_BUSQUEDA_MOVIMIENTO = Target.the("Boton para buscar un movimiento por descripcion o fecha").located(theElementBy(BTN_FILTRO_BUSQUEDA_MOVIMIENTO_LOCATOR));
    public static final Target BTN_LIMPIAR_CAMPOS = Target.the("Boton para limpiar campos de busqueda").located(theElementBy(BTN_LIMPIAR_CAMPOS_LOCATOR));
    public static final Target TXT_DESCRIPCION = Target.the("Campo de texto para filtrar por descripcion").located(theElementBy(TXT_DESCRIPCION_LOCATOR));
    public static final Target TXT_RANGO_FECHAS = Target.the("Campo de texto para filtrar por rango de fechas").located(theElementBy(TXT_RANGO_FECHAS_LOCATOR));
    public static final Target FOCO_MOVIMIENTOS = Target.the("Foco en busqueda de movimientos").located(theElementBy(FOCO_MOVIMIENTOS_LOCATOR));
    public static final Target BTN_BUSCAR_MOVIMIENTO = Target.the("Boton para filtrar los movimientos").located(theElementBy(BTN_BUSCAR_MOVIMIENTO_LOCATOR));
    public static final Target BTN_VISTA_CARRUSEL = Target.the("Boton para la vista carrusel").located(theElementBy(BTN_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_VISTA_CARRUSEL = Target.the("Tipo de cuenta vista carrusel").locatedBy(dynamicElement(LBL_TIPO_CUENTA_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_VISTA_CARRUSEL = Target.the("Numero de cuenta vista carrusel").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL = Target.the("Saldo disponible vista carrusel").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL_LOCATOR));
    public static final Target CATEGORIA_PRODUCTOS_VISTA_CARRUSEL = Target.the("Categoria productos vista carrusel").locatedBy(dynamicElement(CATEGORIA_PRODUCTOS_VISTA_CARRUSEL_LOCATOR));
    public static final Target CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL = Target.the("Categoria tarjetas credito vista carrusel").locatedBy(dynamicElement(CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_TC_VISTA_CARRUSEL = Target.the("Numero de cuenta tarjeta de credito vista carrusel").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_TC_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_TC_VISTA_CARRUSEL = Target.the("Tipo de cuenta tarjeta de credito vista carrusel").locatedBy(dynamicElement(LBL_TIPO_CUENTA_TC_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_TC_VISTA_CARRUSEL = Target.the("Saldo disponible tarjeta de credito vista carrusel").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_TC_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_CREDITOS_VISTA_CARRUSEL = Target.the("Numero de cuenta del credito vista carrusel").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_CREDITOS_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_CREDITOS_VISTA_CARRUSEL = Target.the("Tipo de cuenta del credito vista carrusel").locatedBy(dynamicElement(LBL_TIPO_CUENTA_CREDITOS_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_CREDITOS_VISTA_CARRUSEL = Target.the("Saldo disponible del credito vista carrusel").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_CREDITOS_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA_INVERSIONES_VISTA_CARRUSEL = Target.the("Numero de cuenta de inversiones vista carrusel").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_INVERSIONES_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_INVERSIONES_VISTA_CARRUSEL = Target.the("Tipo de cuenta de inversiones vista carrusel").locatedBy(dynamicElement(LBL_TIPO_CUENTA_INVERSIONES_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_INVERSIONES_VISTA_CARRUSEL = Target.the("Saldo disponible de inversiones vista carrusel").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_INVERSIONES_VISTA_CARRUSEL_LOCATOR));

    public static final Target LBL_NUMERO_CUENTA_EPREPAGO_VISTA_CARRUSEL = Target.the("Numero de cuenta de eprepago vista carrusel").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_EPREPAGO_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_TIPO_CUENTA_EPREPAGO_VISTA_CARRUSEL = Target.the("Tipo de cuenta de eprepago vista carrusel").locatedBy(dynamicElement(LBL_TIPO_CUENTA_EPREPAGO_VISTA_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_EPREPAGO_VISTA_CARRUSEL = Target.the("Saldo disponible de eprepago vista carrusel").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_EPREPAGO_VISTA_CARRUSEL_LOCATOR));

    private SaldosMovimientosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}