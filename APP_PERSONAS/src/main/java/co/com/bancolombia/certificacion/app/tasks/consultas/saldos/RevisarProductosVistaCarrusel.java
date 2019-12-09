package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel.DeCuentasDeposito;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel.DeTarjetasCredito;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisarProductosVistaCarrusel {

    public static Performable deCuentasDeposito(String opcionCategoria) {
        return instrumented(DeCuentasDeposito.class, opcionCategoria);
    }

    public static Performable DeTarjetasCredito() {
        return instrumented(DeTarjetasCredito.class);
    }
}