package co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito.AvancesLocator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito.AvancesLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class AvancesPage
{
    public static final Target BTN_SIGUIENTE = Target.the("session para avances").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
    public static final Target BTN_TARJETA_CREDITO = Target.the("Opcion tarjetas de credito").located(theElementBy(BTN_TARJETA_CREDITO_LOCATOR));
    public static final Target BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO = Target.the("Producto Origen tarjeta credito").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO_LOCATOR));
    public static final Target LST_CONTENEDOR_TARJETAS = Target.the("Boton de continuar billatera").located(theElementBy(LST_TARJETAS_CREDITO_LOCATOR));
    public static final Target TXT_CODIGO_SEGURIDAD = Target.the("CAMPO CODIGO").located(theElementBy(LST_CAMPO_CLAVE_LOCATOR));
    public static final Target BTN_REALIZAR_AVANCES = Target.the("session para avances").located(theElementBy(SESSION_AVANCES));
    public static final Target LISTADO_TARJETAS_CREDITO = Target.the("session para avances").located(theElementBy(LISTADO_TARJETAS));
    public static final Target BOTON_SIGUIENTE_AVANCE= Target.the("session para avances").located(theElementBy(BTN_SIGUIENTE_AVANCE));
    public static final Target TXT_MONTO_AVANCE = Target.the("session para avances").located(theElementBy(TXT_VALOR_AVANCE));
    public static final Target LISTADO_TARJETAS_DESTINO_AVANCE = Target.the("session para avances").located(theElementBy(LST_PRODUCTO_DESTINO));
    public static final Target LISTADO_TARJETAS_INSCRITAS_AVANCE = Target.the("session para avances").located(theElementBy(TARJETAS_INSCRITAS_LOCATOR));
    public static final Target BTN_REALIZAR_AVANCE = Target.the("session para avances").located(theElementBy(BTN_REALIZA_AVANCE));
    public static final Target BTN_MIS_PRODUCTOS = Target.the("session para avances").located(theElementBy(MIS_PRODUCTOS_AVANCE_LOCATOR));
    public static final Target MENSAJE_CUPO_INSUFICIENTE_AVANCE = Target.the("session para avances").located(theElementBy(MENSAJE_CUPO_INSUFICIENTE_LOCATOR));
    public static final Target MENSAJE_EXISTOSO_AVANCE= Target.the("¡Avance exitoso!").located(theElementBy(MENSAJE_AVANCE_EXITOSO_LOCATOR));
    public static final Target BTN_CUENTAS_INSCRITAS= Target.the("¡Avance exitoso!").located(theElementBy(BTN_INSCRITOS_LOCATORS));

    private AvancesPage(){throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}
