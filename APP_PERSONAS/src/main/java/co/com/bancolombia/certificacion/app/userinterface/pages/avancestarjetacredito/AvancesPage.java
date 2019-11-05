package co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito.AvancesLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class AvancesPage
{
    public static final Target BTN_REALIZAR_AVANCES = Target.the("session para avances")
            .located(theElementBy(SESSION_AVANCES));
    public static final Target LIST_CREDIT_CARDS = Target.the("session para avances")
            .located(theElementBy(LIST_CARDS));
    public static final Target SECURITY_CODE = Target.the("session para avances")
            .located(theElementBy(CODE_SECURITY));
    public static final Target BUTTON_SIGUEINTE = Target.the("session para avances")
            .located(theElementBy(BTN_SIGUIENTE));
    public static final Target BTN_TARJETACREDITO = Target.the("Opcion tarjetas de credito").located(By.id("b12-Tab2"));
    public static final Target CONTENEDOR_TARJETAS = Target.the("Boton de continuar billatera").located(theElementBy(LISTA_TARJETAS));
    public static final Target CODIGO_SEGURIDAD= Target.the("CAMPO CODIGO").located(theElementBy(CAMPO_CLAVE));
    private AvancesPage(){throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}
