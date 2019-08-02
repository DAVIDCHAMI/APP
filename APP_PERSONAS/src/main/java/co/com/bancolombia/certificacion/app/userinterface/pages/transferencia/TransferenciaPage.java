package co.com.bancolombia.certificacion.app.userinterface.pages.transferencia;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.LBL_VERIFICACION_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.CHECK_TIPO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.transferenciaLocator.TransferenciaLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class TransferenciaPage {
    public static final Target VALOR_TRANSFERENCIA = Target.the("Campo de texto para ingresar valor de la transferencia").located(theElementBy(VALOR_TRANSFERENCIA_LOCATOR));
    public static final Target NUMERO_CUENTA_DESTINO = Target.the("Número de cuenta destino").located(theElementBy(NUMERO_CUENTA_DESTINO_LOCATOR));
    public static final Target BTN_ENVIAR_DINERO = Target.the("Botón enviar dinero").located(theElementBy(BTN_ENVIAR_DINERO_LOCATOR));
    public static final Target CHECK_TIPO_CUENTA = Target.the("Selecciona el tipo cuenta").locatedBy(dynamicElement(CHECK_TIPO_LOCATOR));
    public static final Target TIPO_TRANSFERENCIA = Target.the("Selecciona el tipo de tranferencia a realizar").locatedBy(dynamicElement(LBL_VERIFICACION_LOCATOR));

}
