package co.com.bancolombia.certificacion.app.questions.billetera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ConfirmarPagoBilletera.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_BILLETERA;

public class PagoExitoso implements Question<Boolean> {

    public static PagoExitoso realizadoConBilletera() {
        return new PagoExitoso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> informacionVerificarPago = actor.recall(MODELO_BILLETERA);
        return LBL_NOMBRE_ESTABLECIMIENTO_CONFIRMAR.of(informacionVerificarPago.get(0)).resolveFor(actor).isVisible()
                && LBL_TIPO_TARJETA_CONFIRMAR.of(informacionVerificarPago.get(1)).resolveFor(actor).isVisible()
                && LBL_NUMERO_TARJETA_CONFIRMAR.of(informacionVerificarPago.get(2)).resolveFor(actor).isVisible()
                && LBL_SUBTOTAL_PAGO_CONFIRMAR.of(informacionVerificarPago.get(3)).resolveFor(actor).isVisible()
                && LBL_IVA_CONFIRMAR.of(informacionVerificarPago.get(4)).resolveFor(actor).isVisible()
                && LBL_INC_CONFIRMAR.of(informacionVerificarPago.get(5)).resolveFor(actor).isVisible()
                && LBL_PROPINA_CONFIRMAR.of(informacionVerificarPago.get(6)).resolveFor(actor).isVisible()
                && LBL_TOTAL_PAGADO_CONFIRMAR.of(informacionVerificarPago.get(7)).resolveFor(actor).isVisible()
                && LBL_COMPROBANTE.resolveFor(actor).isVisible()
                && LBL_FECHA_PAGO_REALIZADO.resolveFor(actor).isVisible();
    }
}
