package co.com.bancolombia.certificacion.app.tasks;

import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Transaction data task.
 */
public class TransactionDataTask implements Task {
    private final List<String> transactionData;

    /**
     * Instantiates a new Transaction data task.
     *
     * @param transactionData the transaccion data
     */
    public TransactionDataTask(List<String> transactionData) {
        this.transactionData = transactionData;
    }

    /**
     * Instantiates a new Transaction data task.
     */
    public TransactionDataTask() {
        this.transactionData = null;
    }

    /**
     * Data transaccion data task.
     *
     * @param data the data
     * @return the transaccion data task
     */
    public static TransactionDataTask data(List<String> data) {
        return instrumented(TransactionDataTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CargarEntidadTransaccion.conEstos(transactionData);
    }
}
