package co.com.bancolombia.certificacion.app.questions.eprepago;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.LBL_CUENTA_ASOCIADA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_COMPROBATE_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.LBL_DESCARGA_EXITOSA_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO;

public class DescargaTarjetaVirtuaEprepago implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Producto producto = actor.recall(MODELO_PRODUCTO);
        
        return LBL_DESCARGA_EXITOSA_EPREPAGO.resolveFor(actor).waitUntilVisible().isVisible() &&
                LBL_COMPROBATE_EPREPAGO.resolveFor(actor).waitUntilVisible().isVisible() &&
                LBL_CUENTA_ASOCIADA.of(producto.getTipo(), producto.getNumero()).resolveFor(actor).waitUntilVisible().isVisible();
    }

    public static DescargaTarjetaVirtuaEprepago esExitosa(){
        return new DescargaTarjetaVirtuaEprepago();
    }
}