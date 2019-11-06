package co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito.AvancesLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class AvancesPage
{
    public static final Target BTN_SIGUIENTE = Target.the("session para avances").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
    public static final Target BTN_TARJETA_CREDITO = Target.the("Opcion tarjetas de credito").located(theElementBy(BTN_TARJETA_CREDITO_LOCATOR));
    public static final Target LST_CONTENEDOR_TARJETAS = Target.the("Boton de continuar billatera").located(theElementBy(LST_TARJETAS_CREDITO_LOCATOR));
    public static final Target TXT_CODIGO_SEGURIDAD = Target.the("CAMPO CODIGO").located(theElementBy(LST_CAMPO_CLAVE_LOCATOR));

    private AvancesPage(){throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}
