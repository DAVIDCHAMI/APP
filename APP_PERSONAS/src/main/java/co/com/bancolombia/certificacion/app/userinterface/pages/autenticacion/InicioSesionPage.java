package co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.autenticacion.InicioSesionLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder.ElementFinder.theElementBy;

public class InicioSesionPage {
    public static final Target TXT_USUARIO = Target.the("Campo ingresar usuario").located(theElementBy(TXT_USUARIO_LOCATOR));
    public static final Target LBL_HOLA_PROVISIONAL = Target.the("Label Hola para Continuar").located(theElementBy(LABEL_HOLA_PROVIVIONAL_LOCATOR));
    public static final Target LBL_IMAGEN_PROVISIONAL = Target.the("Label Hola para Continuar").located(theElementBy(LABEL_IMAGEN_PROVIVIONAL_LOCATOR));
    public static final Target BTN_CONTINUAR = Target.the("Botón Continuar").located(theElementBy(BTN_CONTINUAR_LOCATOR));
    public static final Target TXT_CLAVE_DIGITOS= Target.the("Digito para clave2").located(theElementBy(TXT_CLAVE_DIGITOS_LOCATOR));
    public static final Target LBL_SALDOS = Target.the("validar logueo OK").located(theElementBy(LBL_SALDOS_LOCATOR));
    public static final Target LBL_CLAVE_INVALIDA = Target.the("clave invalida").located(theElementBy(LBL_CLAVE_INVALIDA_LOCATOR));
    public static final Target BTN_CERRAR_SESION = Target.the("Botón cerrar sesion").located(theElementBy(BTN_CERRAR_SESION_LOCATOR));
    public static final Target BTN_SI_CERRAR_SESION = Target.the("Botón SI cerrar sesion").located(theElementBy(BTN_SI_CERRAR_SESION_LOCATOR_));
}
