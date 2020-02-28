package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class VerificarPagoBilleteraLocator {
  public static final Locator LBL_TIPO_TARJETA_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_NOMBRE_ESTABLECIMIENTO_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_NUMERO_TARJETA_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator BTN_CAMBIAR_TARJETA_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator BTN_CAMBIAR_VALOR_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_SUBTOTAL_PAGO_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_IVA_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_INC_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_PROPINA_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_TOTAL_PAGAR_VERIFICAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_VERIFICAR_PAGO_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator BTN_BILLETERA_PAGAR_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");

  private VerificarPagoBilleteraLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}