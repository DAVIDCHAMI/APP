package co.com.bancolombia.certificacion.app.tasks.tarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import net.serenitybdd.screenplay.Performable;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_TASK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pagar {
    public static Performable tarjetaCreditoNoPropia(TarjetaCreditoBuilder tarjetaCredito, ProductoBuilder productoDebitar) {
        return instrumented(NoPropia.class, tarjetaCredito.build(), productoDebitar.build());
    }

    public static Performable tarjetaCreditoPropia(TarjetaCreditoBuilder tarjetaCredito, ProductoBuilder productoDebitar) {
        return instrumented(Propia.class, tarjetaCredito.build(), productoDebitar.build());
    }

    private Pagar() {
        throw new IllegalStateException(CLASE_TASK);
    }
}
