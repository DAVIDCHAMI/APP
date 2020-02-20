package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cambiar {

    public static Performable valorPagarQrEstatico(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder){
        return instrumented(CambiarValorPagarQr.class, datosPagoBilleteraBuilder.build());
    }

    public static Performable tarjetaEnBIlleteraParaPago(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder){
        return instrumented(CambiarTarjetaBilletera.class, datosPagoBilleteraBuilder.build());
    }
}
