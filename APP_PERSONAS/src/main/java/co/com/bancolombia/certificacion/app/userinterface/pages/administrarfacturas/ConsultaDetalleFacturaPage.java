package co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.ConsultarDetalleFacturaLocator.*;
import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.ProgramarPagarFacturasLocator.LBL_CONTENEDOR_HISTORICO_PAGO_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ConsultaDetalleFacturaPage {
    public static final Target LBL_CONTENEDOR_FACTURA = Target.the("Contenedor de factura").locatedBy(dynamicElement(LBL_CONTENEDOR_HISTORICO_PAGO_LOCATOR));
    public static final Target LBL_DETALLE_INSCRITAS = Target.the("Seleccion de factura").locatedBy(dynamicElement(LBL_DETALLE_INSCRITAS_LOCATOR));
    public static final Target LBL_DETALLE_EMPRESA_SERVICIO = Target.the("Label de verificación empresa o servicio").locatedBy(dynamicElement(LBL_DETALLE_EMPRESA_SERVICIO_LOCATOR));
    public static final Target LBL_DETALLE_ESTADO = Target.the("Label de verificación estado").located(theElementBy(LBL_DETALLE_ESTADO_LOCATOR));
    public static final Target LBL_DETALLE_NEGOCIO = Target.the("Label de verificación negocio").located(theElementBy(LBL_DETALLE_NEGOCIO_LOCATOR));
    public static final Target LBL_DETALLE_NIT = Target.the("Label de verificación nit").located(theElementBy(LBL_DETALLE_NIT_LOCATOR));
    public static final Target LBL_DETALLE_VALOR_PAGAR = Target.the("Label de verificación valor").locatedBy(dynamicElement(LBL_DETALLE_VALOR_PAGAR_LOCATOR));
    public static final Target LBL_DETALLE_NUMERO_FACTURA = Target.the("Label de verificación numero factura").located(theElementBy(LBL_DETALLE_NUMERO_FACTURA_LOCATOR));
    public static final Target LBL_DETALLE_FECHA_VENCIMIENTO_FACTURA = Target.the("Label de verificación fecha de vencimiento").locatedBy(dynamicElement(LBL_DETALLE_FECHA_VENCIMIENTO_FACTURA_LOCATOR));
    public static final Target LBL_DETALLE_CANAL_INSCRIPCION_FACTURA = Target.the("Label de verificación canal de inscripcion").located(theElementBy(LBL_DETALLE_CANAL_INSCRIPCION_LOCATOR));
    public static final Target LBL_DETALLE_TIPO_CUENTA = Target.the("Label de verificación tipo de cuenta factura").located(theElementBy(LBL_DETALLE_TIPO_CUENTA_LOCATOR));
    public static final Target LBL_DETALLE_NUMERO_CUENTA = Target.the("Label de verificación tipo de numero cuenta factura").located(theElementBy(LBL_DETALLE_NUMERO_CUENTA_LOCATOR));
    public static final Target OPT_VER_DETALLE_FACTURA_PROGRAMADA = Target.the("Opcion para seleccionar factura programada").locatedBy(dynamicElement(OPT_VER_DETALLE_FAClTURA_PROGRAMADA_LOCATOR));
    public static final Target LBL_DETALLE_FECHA_INICIO = Target.the("Label verificacion fecha inicio").located(theElementBy(LBL_DETALLE_FECHA_INICIO_LOCATOR));
    public static final Target LBL_DETALLE_FECHA_FIN = Target.the("Label verificacion fecha fin").located(theElementBy(LBL_DETALLE_FECHA_FIN_LOCATOR));

    public ConsultaDetalleFacturaPage(){
            throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}