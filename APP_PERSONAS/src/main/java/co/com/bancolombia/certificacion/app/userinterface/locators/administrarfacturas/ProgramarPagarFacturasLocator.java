package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ProgramarPagarFacturasLocator {
    public static final Locator OPT_FACTURA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/../preceding-sibling::div/span[text()='{1}']/../../preceding-sibling::div/span[text()='{2}']/../../div[2]/div");
    public static final Locator OPT_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//span[text()='Programar']");
    public static final Locator OPT_MIS_PRODUCTOS_LOCATOR = locator().withAndroid("xpath$//span[text()='Mis productos']");
    public static final Locator TXT_FECHA_INICIO_FIN_LOCATOR = locator().withAndroid("xpath$//div[text()='Selecciona fecha inicio - fecha fin']");
    public static final Locator LST_NUMERO_INTENTOS_LOCATOR = locator().withAndroid("xpath$//img[@src='/Personas/img/Bancolombia_Resources.payReturn.png?kr6jYOBKSaL7PGCBdnRReA']");
    public static final Locator BTN_SELECCIONAR_LOCATOR = locator().withAndroid("xpath$//div[text()='SELECCIONAR']/..");
    public static final Locator BTN_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//button[@id='btn']");
    public static final Locator OPT_CUENTA_PRODUCTO_FACTURA_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div/div/span[text()='{1}']");
    public static final Locator LST_RANGO_FECHA_LOCATOR = locator().withAndroid("xpath$//button[@data-pika-day='{0}' and @data-pika-month='{1}']");
    public static final Locator LST_FLECHA_MES_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//button[text()='Próximo']");
    public static final Locator LBL_MES_LOCATOR = locator().withAndroid("xpath$//div[text()='{0}']");
    public static final Locator LBL__VALOR_MES_LOCATOR = locator().withAndroid("xpath$//option[text()='{0}']");
    public static final Locator LST_INTENTOS_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class]/span[text()='{0}']");
    public static final Locator CHK_ACEPTO_TERMINOS_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//input[@id='Checkbox1']");
    public static final Locator OPT_MODIFICAR_PROGRAMACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Modificar programación']");
    public static final Locator OPT_ELIMINAR_FACTURA_LOCATOR = locator().withAndroid("xpath$//span[text()='Eliminar']");
    public static final Locator OPT_VER_DETALLE_LOCATOR = locator().withAndroid("xpath$//span[text()='Ver detalle']/..");
    public static final Locator OPT_SUB_MENU_PROGRAMADAS_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Programadas(7)')]");
    public static final Locator LNK_CAMBIAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'{0}')]/..//android.view.View[contains(@text,'Cambiar')]");
    public static final Locator TXT_VALOR_LOCATOR = locator().withAndroid("xpath$//android.widget.EditText[@resource-id='Input_Value']");
    public static final Locator IMG_PERIODICIDAD_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Periodicidad']/following-sibling::android.view.View[1]/android.view.View/android.widget.Image[@text='Bancolombia_Resources.CalendarIcon']");
    public static final Locator LST_FRECUENCIA_PERIODICAD_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Selecciona la frecuencia']/..//android.view.View[@text='{0}']");
    public static final Locator BTN_MODIFICAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='MODIFICAR']");
    public static final Locator BTN_CONFIRMAR_ELIMINACION_LOCATOR = locator().withAndroid("xpath$//button[text()='ELIMINAR']");
    public static final Locator LBL_MENSAJE_MODIFICACION_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='¡Modificación exitosa!']");
    public static final Locator LBL_ELIMINACION_EXITOSA_LOCATOR = locator().withAndroid("xpath$//span[text()='¡Eliminación exitosa!']");
    public static final Locator LBL_EMPRESA_SERIVICIO_LOCATOR = locator().withAndroid("xpath$//android.view.View[contains(@text,'Empresa o servicio')]/..//android.view.View[contains(@text,'{0}')]");
    public static final Locator LBL_ESTADO_HISTORICO_PAGO_LOCATOR = locator().withAndroid("xpath$(//div[@class='list list-group OSFillParent']/div[{0}]/div[2]/div/div/following-sibling::div)[1]/span");
    public static final Locator LBL_CONTENEDOR_HISTORICO_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[{0}]");
    public static final Locator LBL_FECHA_HISTORICO_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[1]/div[2]/div/div/div/span");
    public static final Locator LBL_REFERENCIA_HISTORICO_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[{0}]/div[1]/span");
    public static final Locator LBL_VALOR_HISTORICO_PAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[1]/div[2]//div[3]/span");

    private ProgramarPagarFacturasLocator(){
        throw new IllegalStateException(CLASE_LOCATOR);
    }
  }