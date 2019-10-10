package co.com.bancolombia.certificacion.app.questions.eprepago;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.LBL_CUENTA_ASOCIADA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_RECARGA_EXITOSA_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_VALOR_RECARGADO_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.RECARGAR_EPREPAGO;

public class RecargaTarjetaEprepago implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Producto producto = actor.recall(MODELO_PRODUCTO);
        String valorCargado = actor.recall(RECARGAR_EPREPAGO);

        return LBL_RECARGA_EXITOSA_EPREPAGO.resolveFor(actor).isVisible() &&
                LBL_CUENTA_ASOCIADA.of(producto.getTipo(),producto.getNumero()).resolveFor(actor).waitUntilVisible().isVisible() &&
                LBL_VALOR_RECARGADO_EPREPAGO.of(valorCargado).resolveFor(actor).waitUntilVisible().isVisible();
    }

    public static RecargaTarjetaEprepago exitosa(){return new RecargaTarjetaEprepago();}
}