package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.ConfirmarPagoBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ConfirmarPagoBilletera {
    public static final Target LBL_NOMBRE_ESTABLECIMIENTO_CONFIRMAR = Target.the("Nombre del establecimiento").located(theElementBy(LBL_NOMBRE_ESTABLECIMIENTO_CONFIRMAR_LOCATOR));
    public static final Target LBL_TIPO_TARJETA_CONFIRMAR = Target.the("Tipo de tarjeta").located(theElementBy(LBL_TIPO_TARJETA_CONFIRMAR_LOCATOR));
    public static final Target LBL_NUMERO_TARJETA_CONFIRMAR = Target.the("Numero de la tarjeta").located(theElementBy(LBL_NUMERO_TARJETA_CONFIRMAR_LOCATOR));
    public static final Target LBL_NUEVO_SALDO_DISPONIBLE_CONFIRMAR = Target.the("Nuevo saldo disponible de la tarjeta").located(theElementBy(LBL_NUEVO_SALDO_DISPONIBLE_CONFIRMAR_LOCATOR));
    public static final Target LBL_SUBTOTAL_PAGO_CONFIRMAR = Target.the("Subtotal del pago realizado").located(theElementBy(LBL_SUBTOTAL_PAGO_CONFIRMAR_LOCATOR));
    public static final Target LBL_IVA_CONFIRMAR = Target.the("IVA del pago").located(theElementBy(LBL_IVA_CONFIRMAR_LOCATOR));
    public static final Target LBL_INC_CONFIRMAR = Target.the("INC del pago").located(theElementBy(LBL_INC_CONFIRMAR_LOCATOR));
    public static final Target LBL_PROPINA_CONFIRMAR = Target.the("Propina del pago").located(theElementBy(LBL_PROPINA_CONFIRMAR_LOCATOR));
    public static final Target LBL_TOTAL_PAGADO_CONFIRMAR = Target.the("Total pago realizado").located(theElementBy(LBL_TOTAL_PAGADO_CONFIRMAR_LOCATOR));
    public static final Target LBL_COMPROBANTE = Target.the("Numero de comprobante pago realizado").located(theElementBy(LBL_COMPROBANTE_LOCATOR));
    public static final Target LBL_FECHA_PAGO_REALIZADO = Target.the("Fecha del pago realizado").located(theElementBy(LBL_FECHA_PAGO_REALIZADO_LOCATOR));
    public static final Target BTN_REALIZAR_OTRO_PAGO = Target.the("Boton para realizar otro pago").located(theElementBy(BTN_REALIZAR_OTRO_PAGO_LOCATOR));

    private ConfirmarPagoBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
