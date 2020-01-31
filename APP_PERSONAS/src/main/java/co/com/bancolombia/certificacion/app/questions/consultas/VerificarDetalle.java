package co.com.bancolombia.certificacion.app.questions.consultas;

import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;

public class VerificarDetalle implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        TarjetaCredito tarjetaCredito = actor.recall(MODELO_DETALLE_PRODUCTO);
        return (tarjetaCredito.getFechaVencimiento() != null
                && tarjetaCredito.getCodigoSeguridad() != null
                && tarjetaCredito.getFechaProximoPago() != null
                && tarjetaCredito.getDeudaALaFechaEnPesos() != null
                && tarjetaCredito.getDeudaTotalEnDolares() != null
                && tarjetaCredito.getAvancesDisponiblesEnPesos() != null
                && tarjetaCredito.getTrm() != null
                && tarjetaCredito.getPagoMinimoEnPesos() != null
                && tarjetaCredito.getPagoMinimoEnDolares() != null
                && tarjetaCredito.getPagoTotalEnPesos() != null
                && tarjetaCredito.getTotalPagoEnDolares() != null);
    }

    public static VerificarDetalle deEcard() {
        return new VerificarDetalle();
    }
}