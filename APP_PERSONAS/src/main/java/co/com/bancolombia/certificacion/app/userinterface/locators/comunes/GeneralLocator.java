package co.com.bancolombia.certificacion.app.userinterface.locators.comunes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class GeneralLocator {
  public static final Locator BTN_PRODUCTO_ORIGEN_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[text()='{0}']/../../following-sibling::div/div/span[text()='{1}']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@value='{0}']/../../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeStaticText[@value='{1}']");
  public static final Locator BTN_SIGUIENTE_LOCATOR =
      locator()
          .withAndroid("xpath$//*[text()='SIGUIENTE']")
          .withIos("xpath$//XCUIElementTypeButton[@name='SIGUIENTE']");
  public static final Locator LNK_SIGUIENTE_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Siguiente']")
          .withIos("xpath$//*[contains(@name,'Siguiente')]");
  public static final Locator FOCO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='GENERAR CÓDIGO QR']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='GENERAR CÓDIGO QR']");
  public static final Locator LBL_GUARDADO_EXITOSO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='¡Guardado exitoso!' or text()='¡Generación exitosa!']")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@value='¡Generación exitosa!' or @value='¡Guardado exitoso!']");
  public static final Locator LBL_VERIFICACION_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'{0}')]")
          .withIos("xpath$//*[contains(@name,'{0}')]");
  public static final Locator LNK_SALTAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Saltar']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Saltar')]");
  public static final Locator LNK_COMENZAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Comenzar']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Comenzar')]");
  public static final Locator IMG_COMUN_CAMPO_TEXTO_LOCATOR =
      locator()
          .withAndroid("xpath$//*[contains(text(),'Inicia el registro')]")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='Inicia el registro']");
  public static final Locator BTN_CANCELAR_TRANSACCION_LOCATOR =
      locator()
          .withAndroid("xpath$//*[contains(text(),'Cancelar')]")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Cancelar')]");
  public static final Locator BTN_SI_CANCELAR_REGISTRO_LOCATOR =
      locator().withAndroid("id$btn_ModalSi").withIos("xpath$//XCUIElementTypeButton[@name='SI']");
  public static final Locator LNK_INSCRIBIR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Inscribir']")
          .withIos("xpath$//*[contains(@name,'Inscribir')]");
  public static final Locator BTN_BLOQUEAR_LOCATOR =
      locator()
          .withAndroid("xpath$//div[contains(@id,'outerlayer')]//*[text()='BLOQUEAR']/..")
          .withIos(
              "xpath$//XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[@name='BLOQUEAR']");
  public static final Locator LNK_BLOQUEAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Bloquear']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Bloquear')]");
  public static final Locator BTN_TARJETA_BLOQUEAR_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'{0}')]/../../following-sibling::div//span[contains(text(),'{1}')]")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='{0}']/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@name,'{1}')]");
  public static final Locator LBL_BLOQUEO_EXITOSO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//span[contains(text(),'¡Bloqueo exitoso!')  or contains(text(),'exitoso!') or contains(text(),'¡Bloqueo')]")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[contains(@name,'¡Bloqueo exitoso!')  or contains(@name,'exitoso!') or contains(@name,'¡Bloqueo')]");
  public static final Locator BTN_PAGAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='PAGAR']/..")
          .withIos("xpath$//XCUIElementTypeButton[@name='PAGAR']");
  public static final Locator LNK_CERRAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Cerrar']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Cerrar')]");
  public static final Locator LBL_TARJETAS_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Tarjetas']")
          .withIos("xpath$//XCUIElementTypeStaticText[@name='Tarjetas']");
  public static final Locator LNK_ACTUALIZAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Actualizar']")
          .withIos("xpath$//XCUIElementTypeButton[@name='ACTUALIZAR']");
  public static final Locator LBL_MENSAJE_CARGA_LOCATOR =
      locator()
          .withAndroid(
              "xpath$//*[contains(text(),'Cargando') or contains(text(),'Validando Clave')]")
          .withIos("xpath$//*[contains(@name,'Cargando') or contains(@name,'Validando Clave')]");
  public static final Locator IMG_CARGA_LOCATOR =
      locator().withAndroid("xpath$//*[@class='spinner-container']").withIos("xpath$q");
  public static final Locator LNK_SOLICITAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Solicitar']")
          .withIos("xpath$//XCUIElementTypeButton[@name='SOLICITAR']");
  public static final Locator LNK_CANCELAR_LOCATOR =
      locator()
          .withAndroid("xpath$//span[text()='Cancelar']")
          .withIos("xpath$//XCUIElementTypeLink[contains(@name,'Cancelar')]");
  public static final Locator BTN_SI_LOCATOR =
      locator()
          .withAndroid("xpath$//button[text()='SI']")
          .withIos("xpath$//XCUIElementTypeButton[@name='SI']");
  public static final Locator LBL_CUENTA_SIN_SALDO_LOCATOR =
      locator()
          .withAndroid("xpath$//*[contains(text(),'Saldo insuficiente en el producto a debitar')]")
          .withIos("xpath$//*[contains(@name,'Saldo insuficiente en el producto a debitar')]");
  public static final Locator ITEM_CORREO_RECIBIDO_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//android.widget.TextView[@resource-id='com.google.android.gm:id/subject'])[1]")
          .withIos("xpath$q");
  public static final Locator TXT_CUERPO_MENSAJE_LOCATOR =
      locator()
          .withAndroid(
              "xpath$(//android.view.View[contains(@resource-id, 'conversation-promotion')]/following-sibling::android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View//android.view.View/android.view.View)[2]")
          .withIos("xpath$q");
  public static final Locator BTN_ELIMINAR_CORREO_LOCATOR =
      locator()
          .withAndroid("xpath$//android.widget.TextView[@content-desc='Eliminar']")
          .withIos("xpath$q");
  public static final Locator BTN_CONFIRMAR_LOCATOR =
      locator()
          .withAndroid("id$Button_Confirm_SecurityCodeDK")
          .withIos("xpath$//XCUIElementTypeButton[@name='CONFIRMAR']");
  public static final Locator LBL_CONFIRMACION_ENVIO_CORREO_LOCATOR =
      locator()
          .withAndroid("xpath$//span[contains(text(),'El código de seguridad fue enviado.')]")
          .withIos(
              "xpath$//XCUIElementTypeStaticText[@name='El código de seguridad fue enviado.']");
  public static final Locator BTN_ENVIAR_LOCATOR =
      locator()
          .withAndroid("id$Button_Send_ValidateSecurityCodeDK")
          .withIos("xpath$//XCUIElementTypeButton[@name='ENVIAR']");
  public static final Locator IMG_CORREO_VACIO_LOCATOR =
      locator().withAndroid("id$com.google.android.gm:id/empty_icon").withIos("xpath$q");
  public static final Locator BTN_INSCRIBIR_CLAVE_DINAMICA_FLOTANTE_LOCATOR =
      locator()
          .withAndroid("xpath$//button[@id='registerDynamicKey']")
          .withIos("xpath$//XCUIElementTypeButton[@name='Inscríbete a clave dinámica']");
  public static final Locator BTN_CLAVE_DINAMICA_INSCRITA_FLOTANTE_LOCATOR =
      locator()
          .withAndroid("xpath$//button[@id='dynamicKey']")
          .withIos("xpath$//XCUIElementTypeButton[contains (@name, 'Clave dinámica')]");

  private GeneralLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}
