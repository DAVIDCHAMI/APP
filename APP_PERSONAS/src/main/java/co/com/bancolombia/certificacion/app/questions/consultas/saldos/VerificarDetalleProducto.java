package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

public class VerificarDetalleProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Producto producto = actor.recall(DETALLE_PRODUCTO);
        return (producto.getTipo() != null
                && producto.getNumero() != null
                && producto.getSaldo().getSaldoDisponible() != null
                && producto.getSaldo().getSaldoEnCanje() != null
                && producto.getSaldo().getSaldoTotal() != null);
    }

    public static VerificarDetalleProducto esExitoso() {
        return new VerificarDetalleProducto();
    }
}