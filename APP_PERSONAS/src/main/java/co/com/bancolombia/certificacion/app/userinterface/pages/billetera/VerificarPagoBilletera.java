package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.VerificarPagoBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class VerificarPagoBilletera {
    public static final Target LBL_TIPO_TARJETA_VERIFICAR = Target.the("Tipo de tarjeta").located(theElementBy(LBL_TIPO_TARJETA_VERIFICAR_LOCATOR));
    public static final Target LBL_NOMBRE_ESTABLECIMIENTO_VERIFICAR = Target.the("Nombre del establecimiento").located(theElementBy(LBL_NOMBRE_ESTABLECIMIENTO_VERIFICAR_LOCATOR));
    public static final Target LBL_NUMERO_TARJETA_VERIFICAR = Target.the("Numero de la tarjeta").located(theElementBy(LBL_NUMERO_TARJETA_VERIFICAR_LOCATOR));
    public static final Target BTN_CAMBIAR_TARJETA_VERIFICAR = Target.the("Boton cambiar tarjeta").located(theElementBy(BTN_CAMBIAR_TARJETA_VERIFICAR_LOCATOR));
    public static final Target BTN_CAMBIAR_VALOR_VERIFICAR = Target.the("Boton cambiar valor a pagar").located(theElementBy(BTN_CAMBIAR_VALOR_VERIFICAR_LOCATOR));
    public static final Target LBL_SUBTOTAL_PAGO_VERIFICAR = Target.the("Subtotal del pago realizado").located(theElementBy(LBL_SUBTOTAL_PAGO_VERIFICAR_LOCATOR));
    public static final Target LBL_IVA_VERIFICAR = Target.the("IVA del pago").located(theElementBy(LBL_IVA_VERIFICAR_LOCATOR));
    public static final Target LBL_INC_VERIFICAR = Target.the("INC del pago").located(theElementBy(LBL_INC_VERIFICAR_LOCATOR));
    public static final Target LBL_PROPINA_VERIFICAR = Target.the("Propina del pago").located(theElementBy(LBL_PROPINA_VERIFICAR_LOCATOR));
    public static final Target LBL_TOTAL_PAGADO_VERIFICAR = Target.the("Total pago realizado").located(theElementBy(LBL_TOTAL_PAGAR_VERIFICAR_LOCATOR));
    public static final Target LBL_VERIFICAR_PAGO = Target.the("Total pago realizado").located(theElementBy(LBL_VERIFICAR_PAGO_LOCATOR));
    public static final Target BTN_BILLETERA_PAGAR = Target.the("Total pago realizado").located(theElementBy(BTN_BILLETERA_PAGAR_LOCATOR));

    private VerificarPagoBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
