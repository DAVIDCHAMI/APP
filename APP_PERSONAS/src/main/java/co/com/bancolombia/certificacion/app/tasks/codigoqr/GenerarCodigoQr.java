package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarCodigoQr {
    public static GenerarQR SinInciarSesion(String nombrePersonalizado, TransferenciaBuilder transferencia) {
        return instrumented(SinInicioSesion.class, nombrePersonalizado, transferencia);
    }

    public static GenerarQR ConInicioSesion(TransferenciaBuilder transferencia) {
        return instrumented(ConInicioSesion.class, transferencia);
    }
}
