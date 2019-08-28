package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GeneralLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class GeneralPage {
    public static final Target BTN_SIGUIENTE = Target.the("Boton siguiente").located(theElementBy(BTN_SIGUIENTE_LOCATOR));
    public static final Target LNK_SIGUIENTE = Target.the("Link boton siguiente").located(theElementBy(LNK_SIGUIENTE_LOCATOR));
    public static final Target BTN_PRODUCTO_ORIGEN = Target.the("Boton producto origen").locatedBy(dynamicElement(BTN_PRODUCTO_ORIGEN_LOCATOR));
    public static final Target LBL_GENERACION_EXITOSA = Target.the("Label generación exitosa").locatedBy(dynamicElement(LBL_GENERACION_EXITOSA_LOCATOR));
    public static final Target LBL_VERIFICACION = Target.the("Label verificación").locatedBy(dynamicElement(LBL_VERIFICACION_LOCATOR));
    public static final Target LNK_SALTAR = Target.the("Link saltar").located(theElementBy(LNK_SALTAR_LOCATOR));
    public static final Target LNK_COMENZAR = Target.the("Link comenzar").located(theElementBy(LNK_COMENZAR_LOCATOR));
    public static final Target IMG_COMUN_CAMPO_TEXTO = Target.the("imagen comun crear usuario").located(theElementBy(IMG_COMUN_CAMPO_TEXTO_LOCATOR));
    public static final Target LNK_INSCRIBIR = Target.the("Link inscribir").located(theElementBy(LNK_INSCRIBIR_LOCATOR));
    public static final Target BTN_CANCELAR_TRANSACCION = Target.the("Boton Cancelar Transaccion").located(theElementBy(BTN_CANCELAR_TRANSACCION_LOCATOR));
    public static final Target BTN_SI_CANCELAR_REGISTRO = Target.the("Boton Si Cancelar Transaccion").located(theElementBy(BTN_SI_CANCELAR_REGISTRO_LOCATOR));

    private GeneralPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}