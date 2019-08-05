package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ProgramarYpagarFacturasLocator {
    public static final Locator SELECCIONAR_FACTURA_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='{0}']/preceding-sibling::android.view.View[@text='{1}']/..//android.view.View[contains(@text,'{2}')]/../preceding-sibling::android.view.View[1]");
    public static final Locator SELECCIONAR_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Programar']");
    public static final Locator SELECCIONAR_MIS_PRODUCTOS_LOCATOR = locator().withAndroid("xpath$//android.view.View[@text='Mis productos']");
    public static final Locator SELECCIONAR_FECHA_INICIO_FIN_LOCATOR = locator().withAndroid("xpath$//android.widget.Image[@text='Bancolombia_Resources.CalendarIcon']");
    public static final Locator BTN_SELECCIONAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'SELECCIONAR')]");
    public static final Locator BTN_PROGRAMAR_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[contains(@text,'PROGRAMAR')]");
    public static final Locator SELECCIONAR_RANGO_FECHA_LOCATOR = locator().withAndroid("xpath$//android.widget.Button[@text='{0}']");
  }