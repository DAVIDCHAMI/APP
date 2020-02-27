package co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito;

import static co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito.AvancesLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

public class AvancesPage {
  public static final Target BTN_SIGUIENTE =
      Target.the("Boton siguiente").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
  public static final Target BTN_TARJETA_CREDITO =
      Target.the("Opcion tarjetas de credito").located(theElementBy(BTN_TARJETA_CREDITO_LOCATOR));
  public static final Target BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO =
      Target.the("Producto Origen tarjeta credito")
          .locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO_LOCATOR));
  public static final Target TXT_CODIGO_SEGURIDAD =
      Target.the("Campo de texto para codigo de seguridad")
          .located(theElementBy(LST_CAMPO_CLAVE_LOCATOR));
  public static final Target IMG_TARJETA_GENERAL_SELECCIONADA =
      Target.the("Imagen seleccionada de la tarjeta")
          .located(theElementBy(IMG_TARJETA_GENERAL_SELECCIONADA_LOCATOR));
  public static final Target BTN_REALIZAR_AVANCES =
      Target.the("Boton realizar avances").located(theElementBy(BTN_REALIZA_AVANCES_LOCATOR));
  public static final Target BOTON_SIGUIENTE_AVANCE =
      Target.the("Boton siguiente avance").located(theElementBy(BTN_SIGUIENTE_AVANCE_LOCATOR));
  public static final Target TXT_MONTO_AVANCE =
      Target.the("Campo de texto avance").located(theElementBy(TXT_VALOR_AVANCE_LOCATOR));
  public static final Target LISTADO_TARJETAS_DESTINO_AVANCE =
      Target.the("Listado tarjetas destino")
          .locatedBy(dynamicElement(LST_PRODUCTO_DESTINO_LOCATOR));
  public static final Target BTN_REALIZAR_AVANCE =
      Target.the("Boton realizar avances").located(theElementBy(BTN_REALIZA_AVANCE_LOCATOR));
  public static final Target BTN_MIS_PRODUCTOS =
      Target.the("Boton mis productos").located(theElementBy(MIS_PRODUCTOS_AVANCE_LOCATOR));
  public static final Target LBL_CUPO_INSUFICIENTE_AVANCE =
      Target.the("Label mensaje cupo insuficiente")
          .located(theElementBy(LBL_CUPO_INSUFICIENTE_AVANCE_LOCATOR));
  public static final Target LBL_AVANCE_EXISTOSO =
      Target.the("Mensaje ¡Avance exitoso!").located(theElementBy(LBL_AVANCE_EXISTOSO_LOCATOR));
  public static final Target BTN_CUENTAS_INSCRITAS =
      Target.the("Boton cuentas inscritas").located(theElementBy(BTN_CUENTAS_INSCRITAS_LOCATOR));

  private AvancesPage() {
    throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
  }
}
