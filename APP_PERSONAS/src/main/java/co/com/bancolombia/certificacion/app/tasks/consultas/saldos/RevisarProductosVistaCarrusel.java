package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel.*;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisarProductosVistaCarrusel {

    public static Performable DeCuentasDeposito(String opcionCategoria) {
        return instrumented(DeCuentasDeposito.class, opcionCategoria);
    }

    public static Performable DeTarjetasCredito(String opcionCategoria) {
        return instrumented(DeTarjetasCredito.class,opcionCategoria);
    }

    public static Performable DeCreditos(String opcionCategoria) {
        return instrumented(DeCreditos.class,opcionCategoria);
    }

    public static Performable DeInversiones(String opcionCategoria) {
        return instrumented(DeInversiones.class,opcionCategoria);
    }

    public static Performable DeEprepago(String opcionCategoria) {
        return instrumented(DeEprepago.class,opcionCategoria);
    }
}