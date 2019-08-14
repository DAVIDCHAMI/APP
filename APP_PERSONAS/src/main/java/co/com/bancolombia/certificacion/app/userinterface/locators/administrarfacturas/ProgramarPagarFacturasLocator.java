package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ProgramarPagarFacturasLocator {
    public static final Locator OPT_FACTURA_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/preceding-sibling::android.view.View[@text='{1}']/..//android.view.View[contains(@text,'{2}')]/../preceding-sibling::android.view.View[1]");
    public static final Locator OPT_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Programar']");
    public static final Locator OPT_MIS_PRODUCTOS_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Mis productos']");
    public static final Locator TXT_FECHA_INICIO_FIN_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Selecciona fecha inicio - fecha fin']");
    public static final Locator LST_NUMERO_INTENTOS_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[@text='Bancolombia_Resources.payReturn']");
    public static final Locator BTN_SELECCIONAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SELECCIONAR')]");
    public static final Locator BTN_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'PROGRAMAR')]");
    public static final Locator LST_RANGO_FECHA_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@text='{0}']");
    public static final Locator LST_INTENTOS_PAGO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Selecciona los intentos del pago')]/..//android.view.View[@text='{0}']");
    public static final Locator CHK_ACEPTO_TERMINOS_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//android.widget.CheckBox[@resource-id='Checkbox1']");
    public static final Locator OPT_MODIFICAR_PROGRAMACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Modificar programación']");
    public static final Locator OPT_ELIMINAR_FACTURA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Eliminar factura']");
    public static final Locator OPT_SUB_MENU_PROGRAMADAS_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Programadas(7)')]");
    public static final Locator LNK_CAMBIAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/..//android.view.View[contains(@text,'Cambiar')]");
    public static final Locator TXT_VALOR_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Value']");
    public static final Locator IMG_PERIODICIDAD_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Periodicidad']/following-sibling::android.view.View[1]/android.view.View/android.widget.Image[@text='Bancolombia_Resources.CalendarIcon']");
    public static final Locator LST_FRECUENCIA_PERIODICAD_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Selecciona la frecuencia']/..//android.view.View[@text='{0}']");
    public static final Locator BTN_MODIFICAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='MODIFICAR']");
    public static final Locator BTN_CONFIRMAR_ELIMINACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='ELIMINAR']");
    public static final Locator LBL_MENSAJE_MODIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='¡Modificación exitosa!']");
    public static final Locator LBL_ELIMINACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='¡Eliminación exitosa!']");
    public static final Locator LBL_EMPRESA_SERIVICIO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Empresa o servicio')]/..//android.view.View[contains(@text,'{0}')]");

    private ProgramarPagarFacturasLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
  }