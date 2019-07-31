package co.com.bancolombia.certificacion.app.tasks.tarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pagar {
    public static PagarTC tarjetaCreditoNoPropia(TarjetaCreditoBuilder tarjetaCredito, ProductoBuilder productoDebitar){
        return instrumented(NoPropia.class, tarjetaCredito, productoDebitar);
    }
}
