package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class ProgramarPagarFacturasLocator {
  public static final Locator OPT_FACTURA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../div[2]/div)[1]/..")
          .withIos(
              "xpath$(//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'{0}')]]/preceding-sibling::XCUIElementTypeOther[2][./XCUIElementTypeStaticText[contains(@name,'{1}')]]/preceding-sibling::XCUIElementTypeOther[1][./XCUIElementTypeStaticText[contains(@name,'{2}')]]/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
  public static final Locator OPT_PROGRAMAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Programar']")
          .withIos("xpath$//*[@name='Programar']");
  public static final Locator OPT_MIS_PRODUCTOS_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Mis productos']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='Mis productos']");
  public static final Locator TXT_FECHA_INICIO_FIN_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//img[@src='/Personas/img/Bancolombia_Resources.CalendarIcon.png?uRy3B8C5ZLo++3O61PHZIQ']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='Selecciona fecha inicio - fecha fin']");
  public static final Locator LST_NUMERO_INTENTOS_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[text()='Ingresa los intentos de pago']/following-sibling::div/div[1]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Ingresa los intentos de pago']]/following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeImage");
  public static final Locator LST_NUMERO_INTENTOS_PROGRAMAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Ingresa los intentos de pago']/..")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Ingresa los intentos de pago']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeImage");
  public static final Locator BTN_CERRAR_NUMERO_INTENTOS_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[./div/span[contains(text(),'Selecciona los intentos del pago')]]/following-sibling::div//span[text()='CERRAR']/..")
          .withIos("xpath$(//XCUIElementTypeStaticText[@name='CERRAR'])[1]");
  public static final Locator BTN_SELECCIONAR_LOCATOR =
      locator()
          .withAndroid("xpath$//div[text()='SELECCIONAR']/..")
          .withIos("xpath$//XCUIElementTypeButton[@name='SELECCIONAR']");
  public static final Locator BTN_PROGRAMAR_LOCATOR =
      locator()
          .withAndroid("xpath$//button[@id='btn']")
          .withIos("xpath$//XCUIElementTypeButton[@name='PROGRAMAR']");
  public static final Locator OPT_CUENTA_PRODUCTO_FACTURA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='{0}']/../../following-sibling::div/div/span[text()='{1}']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[contains(@name,'{0}')]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{1}']");
  public static final Locator LST_RANGO_FECHA_LOCATOR =
      locator()
          .withAndroid("xpath$//button[@data-pika-day='{0}' and @data-pika-month='{1}']")
          .withIos("xpath$//XCUIElementTypeButton[@name='{0}']");
  public static final Locator LST_FLECHA_MES_SIGUIENTE_LOCATOR =
      locator()
          .withAndroid("xpath$//button[text()='Próximo']")
          .withIos("xpath$//XCUIElementTypeButton[contains(@name,'Próximo')]");
  public static final Locator LBL_MES_LOCATOR =
      locator()
          .withAndroid("xpath$//div[text()='{0}']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
  public static final Locator LBL_VALOR_MES_LOCATOR =
      locator()
          .withAndroid("xpath$//option[text()='{0}']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
  public static final Locator LST_INTENTOS_PAGO_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[text()='{0}'])[1]")
          .withIos("xpath$(//XCUIElementTypeStaticText[@name='{0}'])[1]");
  public static final Locator LST_INTENTOS_PAGO_PROGRAMAR_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[text()='{0}'])[2]")
          .withIos("xpath$(//XCUIElementTypeStaticText[@name='{0}'])[2]");
  public static final Locator CHK_ACEPTO_TERMINOS_PROGRAMAR_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Checkbox1']")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Seleccionar todas las facturas']]/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeSwitch");
  public static final Locator OPT_MODIFICAR_PROGRAMACION_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[contains(text(),'Modificar programación')])[1]")
          .withIos("xpath$//*[@name='Modificar programación']");
  public static final Locator OPT_PAGAR_FACTURA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Pagar')]")
          .withIos("xpath$//*[@name='Pagar']");
  public static final Locator OPT_ELIMINAR_FACTURA_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[text()='Eliminar factura'])[3]")
          .withIos("xpath$//*[@name='Eliminar factura']");
  public static final Locator OPT_VER_DETALLE_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Ver detalle']/..")
          .withIos("xpath$//*[@name='Ver detalle']");
  public static final Locator OPT_HISTORICO_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[text()='Ver histórico de pagos'])[2]")
          .withIos("xpath$//*[@name='Ver histórico de pagos']");
  public static final Locator FOCO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Verifica la programación']/..")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='Verifica la programación']");
  public static final Locator LNK_CAMBIAR_PRODUCTO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'Producto origen')]/../../following-sibling::div//span/..")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Producto origen']]/following-sibling::XCUIElementTypeOther[5]/XCUIElementTypeStaticText[@name='Cambiar']");
  public static final Locator LNK_CAMBIAR_PERIODICIDAD_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'Periodicidad')]/../../following-sibling::div//span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Periodicidad']]/following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText[@name='Cambiar']");
  public static final Locator TXT_VALOR_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Input_Value']")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Pagar']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeStaticText");
  public static final Locator BTN_MODIFICAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Modificar']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Modificar')]");
  public static final Locator BTN_CONFIRMAR_ELIMINACION_LOCATOR =
      locator()
          .withAndroid("xpath$//button[contains(text(),'ELIMINAR')]")
          .withIos("xpath$//XCUIElementTypeButton[@name='ELIMINAR']");
  public static final Locator LBL_MENSAJE_MODIFICACION_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='¡Modificación exitosa!']")
          .withIos("xpath$//*[@name='¡Modificación exitosa!']");
  public static final Locator LBL_ELIMINACION_EXITOSA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='¡Eliminación exitosa!']")
          .withIos("xpath$//*[@name='¡Eliminación exitosa!']");
  public static final Locator LBL_COMPROBANTE_ELIMINACION_EXITOSA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Comprobante')]")
          .withIos("xpath$//*[contains(@name,'Comprobante')]");
  public static final Locator TXT_PAGO_REDEBAN_EXITOSO_LOCATOR =
      locator()
          .withAndroid("xpath$//*[text(), ¡Pago exitoso!]")
          .withIos("xpath$//*[text(), ¡Pago exitoso!]");
  public static final Locator OPT_PROGRAMADAS_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'programadas')]//ancestor::div[@class='OSInline']")
          .withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'Programadas')]");
  public static final Locator TXT_BUSCAR_PROGRAMADAS_LOCATOR =
      locator().withAndroid("xpath$//input[@id='Input_Description']").withIos("xpath$test");
  public static final Locator BTN_CARGAR_FACTURAS_LOCATOR =
      locator().withAndroid("xpath$//span[text()='Cargar facturas']").withIos("xpath$test");
  public static final Locator CHK_SELECCIONAR_FACTURA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'{0}')]/../../preceding-sibling::div//span[contains(text(),'{1}')]/../../../preceding-sibling::div//span[contains(text(),'{2}')]/../../../../../..//input")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeOther[2]/XCUIElementTypeStaticText[contains(@name,'{0}')]]/preceding-sibling::XCUIElementTypeOther[1][./XCUIElementTypeStaticText[@name='{1}']]/preceding-sibling::XCUIElementTypeOther[4][./XCUIElementTypeStaticText[@name='{2}']]/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeSwitch");
  public static final Locator LBL_PAGO_EXITOSO_FACTURA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'¡Pago exitoso!')]")
          .withIos("xpath$//*[contains(@name,'¡Pago exitoso!')]");
  public static final Locator LBL_NUEVO_SALDO_DISPONIBLE_LOCATOR =
      locator()
          .withAndroid("xpath$//div[./span[contains(text(),'Nuevo saldos disponible')]]/div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Nuevo saldos disponible']]/following-sibling[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_VALOR_PAGAR_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='Valor a pagar']/../following-sibling::div//span[contains(text(),'{0}')]")
          .withIos("xpath$//*[contains(@name,'{0}')]");
  public static final Locator LBL_PRODUCTO_PAGO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='{0}']/../following-sibling::div//span[contains(text(),'{0}')]")
          .withIos("xpath$//*[contains(@name,'{0}')]");
  public static final Locator LBL_ESTADO_HISTORICO_PAGO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//div[@class='list list-group OSFillParent']/div[{0}]/div[2]/div/div/following-sibling::div)[1]/span")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Valor pagado'])[{0}]/../preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
  public static final Locator LBL_CONTENEDOR_HISTORICO_PAGO_LOCATOR =
      locator()
          .withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[{0}]")
          .withIos("xpath$(//XCUIElementTypeStaticText[@name='Valor pagado'])[{0}]");
  public static final Locator LBL_FECHA_HISTORICO_PAGO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[@class='list list-group OSFillParent']/div[1]/div[2]/div/div/div/span")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Valor pagado'])[{0}]/../preceding-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText");
  public static final Locator LBL_REFERENCIA_HISTORICO_PAGO_LOCATOR =
      locator()
          .withAndroid("xpath$//div[@class='list list-group OSFillParent']/div[{0}]/div[1]/span")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Valor pagado'])[{0}]/../preceding-sibling::XCUIElementTypeOther[4]/XCUIElementTypeStaticText");
  public static final Locator CHK_RANGO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Rango de fechas']/preceding-sibling::button")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Rango de fechas']]/preceding-sibling::XCUIElementTypeButton");
  public static final Locator LBL_VALOR_HISTORICO_PAGO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[@class='list list-group OSFillParent']/div[1]/div[2]//div[3]/span")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Valor pagado'])[{0}]/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator OPT_MODIFICAR_DESCRIPCION_LOCATOR =
      locator()
          .withAndroid("xpath$(//span[contains(text(),'Modificar descripción')])[2]")
          .withIos("xpath$//*[@name='Modificar descripción']");
  public static final Locator TXT_DESCRIPCION_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Input_Description']")
          .withIos("xpath$//XCUIElementTypeOther/XCUIElementTypeTextField");
  public static final Locator TXT_FOCO_MODIFICAR_DESCRIPCION_LOCATOR =
      locator()
          .withAndroid("xpath$//*[contains(text(),'MODIFICAR DESCRIPCIÓN')]")
          .withIos("xpath$//XCUIElementTypeStaticText[@name=MODIFICAR DESCRIPCIÓN']");
  public static final Locator TXT_MENSAJE_PROGRAMACION_EXITOSA_LOCATOR =
      locator()
          .withAndroid("xpath$//*[text()='¡Programación exitosa!']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name=‘¡Programación exitosa!’]");
  public static final Locator TXT_MENSAJE_PAGO_EXITOSO_LOCATOR =
      locator()
          .withAndroid("xpath$//*[text()='¡Pago exitoso!']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name=‘¡Pago exitoso!’]");
  public static final Locator LBL_VERIFICACION_MODIFICACION_INSCRITA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../div/span[contains(text(),'{3}')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='{0}']]/preceding-sibling::XCUIElementTypeOther[2][./XCUIElementTypeStaticText[@name='{1}']]/preceding-sibling::XCUIElementTypeOther[1][./XCUIElementTypeStaticText[contains(@name,'{2}')]]/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'{3}')]");
  public static final Locator BTN_HISTORICO_PAGOS_PROGRAMADOS_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Pagos programados']")
          .withIos("xpath$//*[@name='Pagos programados']");

  private ProgramarPagarFacturasLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}
