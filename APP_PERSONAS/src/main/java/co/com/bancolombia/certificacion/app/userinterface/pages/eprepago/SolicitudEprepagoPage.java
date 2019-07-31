package co.com.bancolombia.certificacion.app.userinterface.pages.eprepago;

import net.serenitybdd.screenplay.targets.Target;
import static co.com.bancolombia.certificacion.app.userinterface.locators.eprepago.SolicitudEprepagoLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class SolicitudEprepagoPage {
    public static final Target CHK_TYC = Target.the("check terminos y condiciones").located(theElementBy(CHK_TYC_LOCATOR));
    public static final Target BTN_SOLICITAR_EPREPAGO = Target.the("boton solicitar eprepago").located(theElementBy(BTN_SOLICITAR_EPREPAGO_LOCATOR));
    public static final Target LBL_SOLICITUD_EPREPAGO_EXITOSA = Target.the("solicitud eprepago exitosa").located(theElementBy(LBL_SOLICITUD_EPREPAGO_EXITOSA_LOCATOR));
    public static final Target LBL_EPREPAGO = Target.the("label eprepago").located(theElementBy(LBL_EPREPAGO_LOCATOR));
    public static final Target LBL_DETALLE_PRODUCTO = Target.the("label detalle del producto").located(theElementBy(LBL_DETALLE_PRODUCTO_LOCATOR));

    public SolicitudEprepagoPage() {throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);}
}