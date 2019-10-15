package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas.ProgramarPagarFacturasLocator.LBL_VALOR_PAGAR_LOCATOR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_VERIFICACION;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_FACTURA;

public class VerificarPagoFacturaInscrita implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Factura factura = actor.recall(MODELO_FACTURA);
        return LBL_PAGO_EXITOSO_FACTURA.resolveFor(actor).isVisible() &&
                LBL_COMPROBANTE_EXITOSA.of(factura.getConvenio()).resolveFor(actor).isVisible() &&
                LBL_NUEVO_SALDO_DISPONIBLE.resolveFor(actor).isVisible() &&
                LBL_PRODUCTO_PAGO.of(factura.getProducto().getTipo(), factura.getProducto().getTipo()).resolveFor(actor).isVisible() &&
                LBL_VALOR_PAGADO.of(factura.getValorFacturaReferenciaPago()).resolveFor(actor).isVisible();
    }

    public static VerificarPagoFacturaInscrita factura() {
        return new VerificarPagoFacturaInscrita();
    }
}
