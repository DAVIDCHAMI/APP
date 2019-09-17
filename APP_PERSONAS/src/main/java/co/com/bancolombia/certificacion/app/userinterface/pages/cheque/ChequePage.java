package co.com.bancolombia.certificacion.app.userinterface.pages.cheque;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.cheque.chequeLocator.*;
import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.CHK_TIPO_CORREO_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ChequePage {
    public static final Target CHK_CHEQUE = Target.the("Selecciona el tipo cheque").locatedBy(dynamicElement(CHK_TIPO_CORREO_LOCATOR));
    public static final Target TXT_NUMERO_CHEQUE = Target.the("Campo de texto para ingresar numero de cheque").located(theElementBy(TXT_NUMERO_CHEQUE_LOCATOR));
    public static final Target BTN_CONTRAORDENAR = Target.the("Boton contraordenar cheque").located(theElementBy(BTN_CONTRAORDENAR_LOCATOR));
    public static final Target OPT_CUENTA_ASOCIADA = Target.the("Opcion para selecciona cuenta asociada a cheque ").locatedBy(dynamicElement(OPT_CUENTA_ASOCIADA_LOCATOR));
}
