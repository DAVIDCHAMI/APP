package co.com.bancolombia.certificacion.app.userinterface.pages.comunes;

import static co.com.bancolombia.certificacion.app.userinterface.locators.comunes.MenuLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
  public static final Target OPT_MENU_PRINCIPAL =
      Target.the("Opcion de Menu principal").locatedBy(dynamicElement(OPT_MENU_PRINCIPAL_LOCATOR));
  public static final Target OPT_SUB_MENU =
      Target.the("Opcion SubMenu").locatedBy(dynamicElement(OPT_SUB_MENU_LOCATOR));
  public static final Target OPT_TERCER_NIVEL =
      Target.the("Opcion SubMenu").locatedBy(dynamicElement(OPT_TERCER_NIVEL_LOCATOR));

  private MenuPage() {
    throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
  }
}
