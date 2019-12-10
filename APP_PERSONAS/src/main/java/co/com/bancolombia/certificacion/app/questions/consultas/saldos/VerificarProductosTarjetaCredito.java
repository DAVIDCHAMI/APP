package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_PRODUCTOS;

public class VerificarProductosTarjetaCredito implements Question<Boolean> {
    private String numeroProductos;

    public VerificarProductosTarjetaCredito(String numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int numeroProductosCarrusel = actor.recall(NUMERO_PRODUCTOS);
        return numeroProductos.equals(Integer.toString(numeroProductosCarrusel));
    }

    public static VerificarProductosTarjetaCredito desdeVistaCarrusel(String numeroProductos) {
        return new VerificarProductosTarjetaCredito(numeroProductos);
    }
}