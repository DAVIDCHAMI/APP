package co.com.bancolombia.certificacion.app.userinterface.locators.cheque;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class ChequeLocator {
  public static final Locator BTN_CONTRAORDENAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='CONTRAORDENAR']/..")
          .withIos("xpath$//XCUIElementTypeButton[@name='CONTRAORDENAR']");
  public static final Locator TXT_NUMERO_CHEQUE_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Input_NumeroDelCheque']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='Ingresa el número del cheque']/../following-sibling::XCUIElementTypeOther//XCUIElementTypeTextField");
  public static final Locator TXT_DESDE_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Input_Desde']")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Desde']/../following-sibling::XCUIElementTypeOther//XCUIElementTypeTextField)[1]");
  public static final Locator TXT_HASTA_LOCATOR =
      locator()
          .withAndroid("xpath$//input[@id='Input_Hasta']")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='Hasta']/../following-sibling::XCUIElementTypeOther//XCUIElementTypeTextField)[1]");
  public static final Locator OPT_CUENTA_ASOCIADA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='{1}']")
          .withIos(
              "xpath$(//XCUIElementTypeStaticText[@name='{0}'])[1]/../following-sibling:: XCUIElementTypeOther[1]//XCUIElementTypeStaticText[@name='{1}']");
  public static final Locator LBL_CONTRAORDEN_EXITOSA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='¡Contraorden exitosa!']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='¡Contraorden exitosa!']");
  public static final Locator LBL_RANGO_CHEQUES_INCORRECTO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='No es posible realizar la operación. El cheque o rango están incorrectos.']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='No es posible realizar la operación. El cheque o rango están incorrectos.']");
  public static final Locator LBL_CONTRAORDEN_SIN_CUENTA_CORRIENTE_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//div[text()='No tienes cuenta corriente para realizar la contraorden.']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='No tienes cuenta corriente para realizar la contraorden.']");
  public static final Locator LBL_COMPROBANTE_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'Comprobante')]")
          .withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'Comprobante')]");
  public static final Locator LBL_NUMERO_CHEQUE_RANGO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'{0}')]/../span[contains(text(),'{1}')]")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[contains(@name,'{0}')]/../XCUIElementTypeStaticText[contains(@name,'{1}')]");
  public static final Locator LBL_NUMERO_CHEQUE_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='Cheques contraordenados']/../child::span[text()='{0}']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='Cheques contraordenados']/../following-sibling:: XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{0}']");
  public static final Locator LBL_CUENTA_ASOCIADA_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='{0}']/../../descendant::span[text()='{1}']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='{0}']/../following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{1}']");
  public static final Locator LBL_FOCO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Cheques a contraordenar']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='Cheques a contraordenar']");

  private ChequeLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}
