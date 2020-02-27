package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class ConsultarDetalleFacturaLocator {
  public static final Locator LBL_DETALLE_INSCRITAS_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='INSCRITAS']")
          .withIos("xpath$//*[@name='INSCRITAS']");
  public static final Locator LBL_DETALLE_EMPRESA_SERVICIO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'Empresa o servicio')]/../following-sibling::div//span[contains(text(),'{0}')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Empresa o servicio']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_ESTADO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Estado')]/../following-sibling::div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'Estado')]]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_NEGOCIO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Negocio')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='NEGOCIO']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_NIT_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'NIT')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='NIT']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_VALOR_PAGAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Valor a pagar']/../following-sibling::div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Valor a pagar']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_NUMERO_FACTURA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Numero de factura']/../following-sibling::div//span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='NUMERO DE FACTURA']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_FECHA_VENCIMIENTO_FACTURA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='Fecha de vencimiento']/../following-sibling::div/span[contains(text(),'{0}')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Fecha de vencimiento']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_CANAL_INSCRIPCION_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Canal')]/../following-sibling::div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'Canal')]]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_TIPO_CUENTA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//span[contains(text(),'Producto origen')]/../following-sibling::div//span)[2]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'Producto origen')]]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_NUMERO_CUENTA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//span[contains(text(),'Producto origen')]/../following-sibling::div//span)[3]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'Producto origen')]]/following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_REFERENCIA_LOCATOR =
      locator().withAndroid("xpath$//span[contains(@id,'Ref1Value')]").withIos("xpath$test");
  public static final Locator OPT_VER_DETALLE_FAClTURA_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../../../..//div//span[contains(text(),'VER DETALLE')]")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'{0}')]]/preceding-sibling::XCUIElementTypeOther[2][./XCUIElementTypeStaticText[contains(@name,'{1}')]]/preceding-sibling::XCUIElementTypeOther[1][./XCUIElementTypeStaticText[contains(@name,'{2}')]]/../following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText[@name='VER DETALLE']");
  public static final Locator OPT_PAGAR_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../../../..//div//span[contains(text(),'PAGAR')])[1]")
          .withIos(
              "xpath$(//XCUIElementTypeOther[./XCUIElementTypeStaticText[contains(@name,'{0}}')]]/preceding-sibling::XCUIElementTypeOther[2][./XCUIElementTypeStaticText[@name='{1}']]/preceding-sibling::XCUIElementTypeOther[1][./XCUIElementTypeStaticText[contains(@name,'{2}')]]/../following-sibling::XCUIElementTypeOther)[2]/XCUIElementTypeStaticText[@name='PAGAR']");
  public static final Locator LBL_DETALLE_FECHA_INICIO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='Fecha inicio de la programación']/../following-sibling::div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Fecha inicio de la programación']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DETALLE_FECHA_FIN_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='Fecha fin de la programación']/../following-sibling::div/span")
          .withIos(
              "xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Fecha fin de la programación']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DESCRIPCION_FACTURA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[@id='l1-{0}-AccountDataContainer']//div[@class='break-Big-Words ThemeGrid_Width11']']//span)[1]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../preceding-sibling::XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeStaticText");
  public static final Locator LBL_EMPRESA_CONVENIO_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[2]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
  public static final Locator LBL_FECHA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[3]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar')[{0}]/../preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_VALOR_FACTURA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[5]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar')[{0}]/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
  public static final Locator LBL_DESCRIPCION_FACTURA_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l2-{0}-AccountDataContainer']//span)[1]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../preceding-sibling::XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeStaticText");
  public static final Locator LBL_EMPRESA_CONVENIO_FACTURA_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l2-{0}-AccountDataContainer']//span)[2]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
  public static final Locator LBL_FECHA_FACTURA_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l2-{0}-AccountDataContainer']//span)[3]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../preceding-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText");
  public static final Locator LBL_VALOR_FACTURA_PROGRAMADA_LOCATOR =
      locator()
          .withAndroid("xpath$(//div[@id='l2-{0}-AccountDataContainer']//span)[5]")
          .withIos(
              "xpath$((//XCUIElementTypeStaticText[@name='Buscar'])[2]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther//XCUIElementTypeStaticText[@name='Valor a pagar'])[{0}]/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");

  public ConsultarDetalleFacturaLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}
