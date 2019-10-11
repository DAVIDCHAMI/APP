package co.com.bancolombia.certificacion.app.userinterface.pages.crediagil;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.crediagil.CrediagilLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class CrediagilPage {

    public static final Target TXT_VALOR_DESEMBOLSAR = Target.the("Valor a desembolsar").located(theElementBy(TXT_VALOR_DESEMBOLSAR_LOCATOR));
    public static final Target FOCO = Target.the("Foco crediágil").located(theElementBy(FOCO_LOCATOR));
    public static final Target BTN_DESEMBOLSAR = Target.the("Botón desembolsar").located(theElementBy(BTN_DESEMBOLSAR_LOCATOR));
}
