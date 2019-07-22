package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.BilleteraLocator.*;
import static co.com.todo1.utils.ElementFinder.theElementBy;

public class BilleteraPage {
    public static final Target BTN_SIGUIENTE_ON_BOARDING = Target.the("Boton siguiente on boparding billetera").located(theElementBy(BTN_SIGUIENTE_ON_BOARDING_LOCATOR));
    public static final Target CHK_TERMINOS_CONDICIONES_BILLETERA = Target.the("Check Terminos Condiciones billetera").located(theElementBy(CHK_TERMINOS_CONDICIONES_BILLETERA_LOCATOR));
    public static final Target BTN_COMENZAR_REGISTRO_BILLETERA = Target.the("Boton Comenzar registro billetera").located(theElementBy(BTN_COMENZAR_REGISTRO_BILLETERA_LOCATOR));
}
