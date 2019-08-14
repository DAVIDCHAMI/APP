package co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.InscribirFacturasLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class InscribirPage {
    public static final Target BTN_INCRIBIR_MANUALMENTE = Target.the("Botón inscribir manualmente").located(theElementBy(BTN_INCRIBIR_MANUALMENTE_LOCATOR));
    public static final Target TXT_EMPRESA_SERVICIO = Target.the("Texto empresa o servicio").located(theElementBy(TXT_EMPRESA_SERVICIO_LOCATOR));
    public static final Target TXT_EMPRESA_SERVICIO_POP_UP = Target.the("Primer posición pop up empresa o servicio").located(theElementBy(TXT_EMPRESA_SERVICIO_POP_UP_LOCATOR));
    public static final Target TXT_DESCRIPCION = Target.the("Texto descripción").located(theElementBy(TXT_DESCRIPCION_LOCATOR));
    public static final Target TXT_REFERENCIA = Target.the("Texto referencia").located(theElementBy(TXT_REFERENCIA_LOCATOR));
    public static final Target LBL_INSCRIPCION_EXITOSA = Target.the("Mensaje inscripción exitosa").located(theElementBy(LBL_INSCRIPCION_EXITOSA_LOCATOR));

    private InscribirPage(){
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }

}
