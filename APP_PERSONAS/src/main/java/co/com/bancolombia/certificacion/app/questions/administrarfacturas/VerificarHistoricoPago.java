package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_HISTORICO_FACTURA;

public class VerificarHistoricoPago implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Factura factura = actor.recall(MODELO_HISTORICO_FACTURA);
        return (factura.getReferencia() != null
                && factura.getFechaFactura() != null
                && factura.getEstadoFactura() != null
                && factura.getValorFactura() != null
        );
    }

    public static VerificarHistoricoPago enFacturas() {
        return new VerificarHistoricoPago();
    }
}