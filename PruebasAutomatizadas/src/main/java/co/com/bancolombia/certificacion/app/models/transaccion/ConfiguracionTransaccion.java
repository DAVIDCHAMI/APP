package co.com.bancolombia.certificacion.app.models.transaccion;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Transaction config.
 */
public class ConfiguracionTransaccion {

    private String identificadorCaso;
    private String logCanalPath;
    private String logCanalName;
    private String logStiPath;
    private String logStiName;
    private String orientationCase;
    private String transactionCode;
    private String errorCode;
    private String expectedResult;
    private String canalCode;
    private String systemCode;
    private String transactionType;
    private String transactionHour;
    private String typeLogCanal;
    private String operationCode;


    public String getIdentificadorCaso() {
        return identificadorCaso;
    }

    public void setIdentificadorCaso(String identificadorCaso) {
        this.identificadorCaso = identificadorCaso;
    }

    public String getLogCanalPath() {
        return logCanalPath;
    }

    public void setRutaLogCanal(String logCanalPath) {
        this.logCanalPath = logCanalPath;
    }


    public String getLogCanalName() {
        return logCanalName;
    }


    public void setLogCanalName(String logCanalName) {
        this.logCanalName = logCanalName;
    }

    public String getLogStiPath() {
        return logStiPath;
    }

    public void setLogStiPath(String logStiPath) {
        this.logStiPath = logStiPath;
    }

    public String getLogStiName() {
        return logStiName;
    }

    public void setLogStiName(String logStiName) {
        this.logStiName = logStiName;
    }


    public String getOrientationCase() {
        return orientationCase;
    }

    public void setOrientacionCaso(String orientationCase) {
        this.orientationCase = orientationCase;
    }

    public String getCodigoTransaccion() {
        return transactionCode;
    }

    public void setCodigoTransaccion(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getCodigoError() {
        return errorCode;
    }

    public void setCodigoError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getResultadoEsperado() {
        return expectedResult;
    }

    public void setResultadoEsperado(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getCanalCode() {
        return canalCode;
    }

    public void setCodigoCanal(String canalCode) {
        this.canalCode = canalCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setCodigoSistema(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getTipoTransaccion() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionHour() {
        return transactionHour;
    }

    public void setHoraTransaccion(String transactionHour) {
        this.transactionHour = transactionHour;
    }

    public String getTypeLogCanal() {
        return typeLogCanal;
    }

    public void setTipoLogCanal(String typeLogCanal) {
        this.typeLogCanal = typeLogCanal;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ConfiguracionTransaccion)) return false;

        ConfiguracionTransaccion that = (ConfiguracionTransaccion) o;

        return new EqualsBuilder()
                .append(getIdentificadorCaso(), that.getIdentificadorCaso())
                .append(getLogCanalPath(), that.getLogCanalPath())
                .append(getLogCanalName(), that.getLogCanalName())
                .append(getLogStiPath(), that.getLogStiPath())
                .append(getLogStiName(), that.getLogStiName())
                .append(getOrientationCase(), that.getOrientationCase())
                .append(getCodigoTransaccion(), that.getCodigoTransaccion())
                .append(getCodigoError(), that.getCodigoError())
                .append(getResultadoEsperado(), that.getResultadoEsperado())
                .append(getCanalCode(), that.getCanalCode())
                .append(getSystemCode(), that.getSystemCode())
                .append(getTipoTransaccion(), that.getTipoTransaccion())
                .append(getTransactionHour(), that.getTransactionHour())
                .append(getTypeLogCanal(), that.getTypeLogCanal())
                .append(getOperationCode(), that.getOperationCode())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getIdentificadorCaso())
                .append(getLogCanalPath())
                .append(getLogCanalName())
                .append(getLogStiPath())
                .append(getLogStiName())
                .append(getOrientationCase())
                .append(getCodigoTransaccion())
                .append(getCodigoError())
                .append(getResultadoEsperado())
                .append(getCanalCode())
                .append(getSystemCode())
                .append(getTipoTransaccion())
                .append(getTransactionHour())
                .append(getTypeLogCanal())
                .append(getOperationCode())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("identificadorCaso", identificadorCaso)
                .append("logCanalPath", logCanalPath)
                .append("logCanalName", logCanalName)
                .append("logStiPath", logStiPath)
                .append("logStiName", logStiName)
                .append("orientationCase", orientationCase)
                .append("transactionCode", transactionCode)
                .append("errorCode", errorCode)
                .append("expectedResult", expectedResult)
                .append("canalCode", canalCode)
                .append("systemCode", systemCode)
                .append("transactionType", transactionType)
                .append("transactionHour", transactionHour)
                .append("typeLogCanal", typeLogCanal)
                .append("operationCode", operationCode)
                .toString();
    }
}
