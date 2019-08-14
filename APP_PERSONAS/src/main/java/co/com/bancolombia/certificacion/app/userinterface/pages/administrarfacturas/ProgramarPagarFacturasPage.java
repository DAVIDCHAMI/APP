package co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.LNK_SIGUIENTE_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.ProgramarPagarFacturasLocator.*;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.OPT_CUENTA_PRODUCTO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.CHK_TIPO_CORREO_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ProgramarPagarFacturasPage {
    public static final Target OPT_FACTURA = Target.the("Seleccionar factura").locatedBy(dynamicElement(OPT_FACTURA_LOCATOR));
    public static final Target OPT_PROGRAMAR = Target.the("Seleccionar la opción programar").located(theElementBy(OPT_PROGRAMAR_LOCATOR));
    public static final Target OPT_MIS_PRODUCTOS = Target.the("Seleccionar la opción desde mis productos").located(theElementBy(OPT_MIS_PRODUCTOS_LOCATOR));
    public static final Target TXT_FECHA_INICIO_FIN = Target.the("Seleccionar fecha inicio y fecha fin").located(theElementBy(TXT_FECHA_INICIO_FIN_LOCATOR));
    public static final Target BTN_PROGRAMAR= Target.the("Botón programar").located(theElementBy(BTN_PROGRAMAR_LOCATOR));
    public static final Target OPT_CUENTA_PRODUCTO = Target.the("Seleccionar la cuenta a programar").locatedBy(dynamicElement(OPT_CUENTA_PRODUCTO_LOCATOR));
    public static final Target CHK_FECHA_VENCIMIENTO = Target.the("Seleccionar la opción de fecha vencimiento").locatedBy(dynamicElement(CHK_TIPO_CORREO_LOCATOR));
    public static final Target LST_INTENTOS_PAGO = Target.the("Seleccionar el número de intentos de pago").locatedBy(dynamicElement(LST_INTENTOS_PAGO_LOCATOR));
    public static final Target CHK_ACEPTO_TERMINOS = Target.the("Click en el check Acepto terminos y condiciones").located(theElementBy(CHK_ACEPTO_TERMINOS_PROGRAMAR_LOCATOR));
    public static final Target LST_RANGO_FECHA = Target.the("Seleccionar rago de fecha inicio y fecha fin").locatedBy(dynamicElement(LST_RANGO_FECHA_LOCATOR));
    public static final Target LST_NUMERO_INTENTOS = Target.the("Clic para seleccionar numero de intentos").locatedBy(dynamicElement(LST_NUMERO_INTENTOS_LOCATOR));
    public static final Target BTN_SELECCIONAR= Target.the("Clic para seleccionar numero de intentos").locatedBy(dynamicElement(BTN_SELECCIONAR_LOCATOR));
    public static final Target OPT_MODIFICAR_PROGRAMACION= Target.the("Clic para seleccionar la opción modificar programación").located(theElementBy(OPT_MODIFICAR_PROGRAMACION_LOCATOR));
    public static final Target OPT_SUB_MENU_PROGRAMADAS= Target.the("Seleccionar la opcion Programadas del sub menú").located(theElementBy(OPT_SUB_MENU_PROGRAMADAS_LOCATOR));
    public static final Target LNK_CAMBIAR= Target.the("Clic para seleccionar la opción modificar programación").locatedBy(dynamicElement(LNK_CAMBIAR_LOCATOR));
    public static final Target LNK_SIGUIENTE= Target.the("Clic para seleccionar la opción modificar programación").locatedBy(dynamicElement(LNK_SIGUIENTE_LOCATOR));
    public static final Target TXT_VALOR= Target.the("Campo de texto para ingresar valor").locatedBy(dynamicElement(TXT_VALOR_LOCATOR));
    public static final Target IMG_PERIODICIDAD = Target.the("Clic en el foco periodicidad").locatedBy(dynamicElement(IMG_PERIODICIDAD_LOCATOR));
    public static final Target LST_FRECUENCIA_PERIODICAD = Target.the("Opcion frecuencia del pago").locatedBy(dynamicElement(LST_FRECUENCIA_PERIODICAD_LOCATOR));

    private ProgramarPagarFacturasPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}