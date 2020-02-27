package co.com.bancolombia.certificacion.app.userinterface.locators.billetera;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

public class ListarTarjetasBilleteraLocator {
  public static final Locator LBL_TARJETAS_LISTADAS_LOCATOR =
      locator().withAndroid("xpath$//div[@class='content']").withIos("xpath$d");
  public static final Locator LBL_ELIGE_UNA_TARJETA_LOCATOR =
      locator().withAndroid("xpath$SD").withIos("xpath$d");
  public static final Locator BTN_ACTIVAR_TARJETA_LOCATOR =
      locator().withAndroid("id$Button_Next_ActivateBiometricsStep1").withIos("xpath$d");
  public static final Locator BTN_VISTA_CARRUSEL_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator BTN_VISTA_LISTA_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator IMG_TARJETA_LISTA_ELEGIR_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator BTN_QR_LISTA_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator LBL_SALDO_DISPONIBLE_LISTA_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator IMG_TARJETA_CARRUSEL_ELEGIR_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator BTN_QR_CARRUSEL_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");
  public static final Locator LBL_SALDO_DISPONIBLE_CARRUSEL_LOCATOR =
      locator().withAndroid("xpath$f").withIos("xpath$d");

  private ListarTarjetasBilleteraLocator() {
    throw new IllegalStateException(CLASE_LOCATOR);
  }
}
