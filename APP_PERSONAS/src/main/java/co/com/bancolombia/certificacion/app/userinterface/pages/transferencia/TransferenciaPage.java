package co.com.bancolombia.certificacion.app.userinterface.pages.transferencia;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.LBL_VERIFICACION_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.CHK_TIPO_CORREO_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.locators.transferenciaLocator.TransferenciaLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class TransferenciaPage {
    public static final Target TXT_VALOR_TRANSFERENCIA = Target.the("Campo de texto para ingresar valor de la transferencia").located(theElementBy(TXT_VALOR_TRANSFERENCIA_LOCATOR));
    public static final Target TXT_FOCO = Target.the("foco").located(theElementBy(TXT_FOCO_LOCATOR));
    public static final Target TXT_NUMERO_CUENTA_DESTINO = Target.the("Numero de cuenta destino").located(theElementBy(TXT_NUMERO_CUENTA_DESTINO_LOCATOR));
    public static final Target BTN_ENVIAR_DINERO = Target.the("Boton enviar dinero").located(theElementBy(BTN_ENVIAR_DINERO_LOCATOR));
    public static final Target CHK_TIPO_CUENTA = Target.the("Selecciona el tipo cuenta").locatedBy(dynamicElement(CHK_TIPO_CORREO_LOCATOR));
    public static final Target OPT_TIPO_TRANSFERENCIA = Target.the("Selecciona el tipo de tranferencia a realizar").locatedBy(dynamicElement(LBL_VERIFICACION_LOCATOR));
    public static final Target LBL_TRANFERENCIA_EXITOSA = Target.the("Mensaje exitoso").located(theElementBy(LBL_TRANFERENCIA_EXITOSA_LOCATOR));
    public static final Target LBL_CUENTA_ORIGEN = Target.the("Label para verificar cuenta origen").locatedBy(dynamicElement(LBL_CUENTA_ORIGEN_LOCATOR));
    public static final Target LBL_CUENTA_DESTINO = Target.the("Label para verificar cuenta destino").locatedBy(dynamicElement(LBL_CUENTA_DESTINO_LOCATOR));

    private TransferenciaPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}