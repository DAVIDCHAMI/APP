package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.RegistroBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class RegistroBilletera {
    public static final Target BTN_CONTINUAR_BILLETERA = Target.the("Boton de continuar billatera").located(theElementBy(BTN_CONTINUAR_BILLETERA_LOCATOR));
    public static final Target CHK_TERMINOS_CONDICIONES_BILLETERA = Target.the("Check Terminos Condiciones billetera").located(theElementBy(CHK_TERMINOS_CONDICIONES_BILLETERA_LOCATOR));
    public static final Target BTN_COMENZAR_REGISTRO_BILLETERA = Target.the("Boton Comenzar registro billetera").located(theElementBy(BTN_COMENZAR_REGISTRO_BILLETERA_LOCATOR));
    public static final Target LBL_ACTIVACION_EXITOSA = Target.the("Titulo Activacion exitosa").located(theElementBy(LBL_ACTIVACION_EXITOSA_LOCATOR));
    public static final Target BTN_PAGAR_CON_BILLETERA = Target.the("Boton Pagar con Billetera").located(theElementBy(BTN_PAGAR_CON_BILLETERA_LOCATOR));

    private RegistroBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
