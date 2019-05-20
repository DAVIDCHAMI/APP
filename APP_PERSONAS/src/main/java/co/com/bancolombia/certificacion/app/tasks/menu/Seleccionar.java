package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Task {

    private String tipoTransaccion;

    public Seleccionar(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }


    public static Seleccionar opcionDelMenu(String tipoTransaccion) {

        return instrumented(Seleccionar.class,tipoTransaccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        TipoTransaccion transaccion = TipoTransaccion.getTransaccion(this.tipoTransaccion);


    }
}
