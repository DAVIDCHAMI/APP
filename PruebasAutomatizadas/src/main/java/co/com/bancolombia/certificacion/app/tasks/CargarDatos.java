package co.com.bancolombia.certificacion.app.tasks;

import co.com.bancolombia.certificacion.app.models.entitidades.ConfiguracionTransaccionActualEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Transaction transaccionCon task.
 */
public class CargarDatos implements Task {
    private final List<String> datosTransaccion;

    /**
     * Instantiates a new Transaction transaccionCon task.
     *
     * @param transactionData the transaction transaccionCon
     */
    public CargarDatos(List<String> transactionData) {
        this.datosTransaccion = transactionData;
    }

    /**
     * Instantiates a new Transaction transaccionCon task.
     */
    public CargarDatos() {
        this.datosTransaccion = null;
    }

    /**
     * Data transaction transaccionCon task.
     *
     * @param data the transaccionCon
     * @return the transaction transaccionCon task
     */
    public static CargarDatos transaccionCon(List<String> data) {
        return instrumented(CargarDatos.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ConfiguracionTransaccionActualEntity.setConfiguracionTransaccion(datosTransaccion);
    }
}
