package co.com.bancolombia.certificacion.app.models.entities;

import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantTypeClass;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager.HOUR_FORMAT;

/**
 * The type Current trasaction config entity.
 */
public class CurrentTrasactionConfigEntity {

    private static TransactionConfig transactionConfig = new TransactionConfig();

    private CurrentTrasactionConfigEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets transaccion.
     *
     * @return the transaccion
     */
    public static TransactionConfig getTransactionConfig() {
        return transactionConfig;
    }

    /**
     * Sets transaccion.
     *
     * @param dataTransaccion the data transaccion
     */
    public static void setTransactionConfig(List<String> dataTransaccion) {
        String transaccionHour = DateManager.obtenerFechaSistema(HOUR_FORMAT);
        transactionConfig.setIdCase(dataTransaccion.get(0));
        transactionConfig.setOrientationCase(dataTransaccion.get(1));
        transactionConfig.setErrorCode(dataTransaccion.get(2));
        transactionConfig.setTransactionCode(dataTransaccion.get(3));
        transactionConfig.setExpectedResult(dataTransaccion.get(4));
        transactionConfig.setTypeLogCanal("WWW");
        transactionConfig.setTransactionHour(transaccionHour);
    }
}
