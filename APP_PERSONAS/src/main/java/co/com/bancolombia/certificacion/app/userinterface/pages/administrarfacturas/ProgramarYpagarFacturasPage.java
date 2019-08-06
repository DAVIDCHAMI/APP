package co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.ProgramarYpagarFacturasLocator.*;
import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos.SaldosMovimientosLocator.CUENTA_ESPECIFICA_PRODUCTO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.CHECK_TIPO_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ProgramarYpagarFacturasPage {
    public static final Target SELECCIONAR_FACTURA = Target.the("Seleccionar factura").locatedBy(dynamicElement(SELECCIONAR_FACTURA_LOCATOR));
    public static final Target SELECCIONAR_PROGRAMAR = Target.the("Seleccionar la opción programar").located(theElementBy(SELECCIONAR_PROGRAMAR_LOCATOR));
    public static final Target SELECCIONAR_MIS_PRODUCTOS = Target.the("Seleccionar la opción desde mis productos").located(theElementBy(SELECCIONAR_MIS_PRODUCTOS_LOCATOR));
    public static final Target SELECCIONAR_FECHA_INICIO_FIN = Target.the("Seleccionar fecha inicio y fecha fin").located(theElementBy(SELECCIONAR_FECHA_INICIO_FIN_LOCATOR));
    public static final Target BTN_PROGRAMAR= Target.the("Botón programar").located(theElementBy(BTN_PROGRAMAR_LOCATOR));
    public static final Target SELECCIONAR_CUENTA= Target.the("Seleccionar la cuenta a programar").locatedBy(dynamicElement(CUENTA_ESPECIFICA_PRODUCTO_LOCATOR));
    public static final Target CHECK_FECHA_VENCIMIENTO= Target.the("Seleccionar la opción de fecha vencimiento").locatedBy(dynamicElement(CHECK_TIPO_LOCATOR));
    public static final Target SELECCIONAR_INTENTOS_PAGO= Target.the("Seleccionar el número de intentos de pago").locatedBy(dynamicElement(SELECCIONAR_INTENTOS_PAGO_LOCATOR));
    public static final Target CHECK_ACEPTO_TERMINOS= Target.the("Click en el check Acepto terminos y condiciones").located(theElementBy(CHECK_ACEPTO_TERMINOS_PROGRAMAR_LOCATOR));
    public static final Target SELECCIONAR_RANGO_FECHA= Target.the("Seleccionar rago de fecha inicio y fecha fin").locatedBy(dynamicElement(SELECCIONAR_RANGO_FECHA_LOCATOR));
    public static final Target SELECCIONAR_NUMERO_INTENTOS= Target.the("Clic para seleccionar numero de intentos").locatedBy(dynamicElement(SELECCIONAR_NUMERO_INTENTOS_LOCATOR));
    public static final Target BTN_SELECCIONAR= Target.the("Clic para seleccionar numero de intentos").locatedBy(dynamicElement(BTN_SELECCIONAR_LOCATOR));

    private ProgramarYpagarFacturasPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}