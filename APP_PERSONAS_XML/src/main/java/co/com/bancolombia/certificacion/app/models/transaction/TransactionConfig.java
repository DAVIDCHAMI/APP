package co.com.bancolombia.certificacion.app.models.transaction;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Transaction config.
 */
public class TransactionConfig{

    private String idCase;
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
    private String evidencePath;
    private String evidenceName;
    private String transactionValue;


    /**
     * Gets id case.
     *
     * @return the id case
     */
    public String getIdCase() {
        return idCase;
    }

    /**
     * Sets id case.
     *
     * @param idCase the id case
     */
    public void setIdCase(String idCase) {
        this.idCase = idCase;
    }

    /**
     * Gets log canal path.
     *
     * @return the log canal path
     */
    public String getLogCanalPath() {
        return logCanalPath;
    }

    /**
     * Sets log canal path.
     *
     * @param logCanalPath the log canal path
     */
    public void setLogCanalPath(String logCanalPath) {
        this.logCanalPath = logCanalPath;
    }

    /**
     * Gets log canal name.
     *
     * @return the log canal name
     */
    public String getLogCanalName() {
        return logCanalName;
    }

    /**
     * Sets log canal name.
     *
     * @param logCanalName the log canal name
     */
    public void setLogCanalName(String logCanalName) {
        this.logCanalName = logCanalName;
    }

    /**
     * Gets log sti path.
     *
     * @return the log sti path
     */
    public String getLogStiPath() {
        return logStiPath;
    }

    /**
     * Sets log sti path.
     *
     * @param logStiPath the log sti path
     */
    public void setLogStiPath(String logStiPath) {
        this.logStiPath = logStiPath;
    }

    /**
     * Gets log sti name.
     *
     * @return the log sti name
     */
    public String getLogStiName() {
        return logStiName;
    }

    /**
     * Sets log sti name.
     *
     * @param logStiName the log sti name
     */
    public void setLogStiName(String logStiName) {
        this.logStiName = logStiName;
    }

    /**
     * Gets orientation case.
     *
     * @return the orientation case
     */
    public String getOrientationCase() {
        return orientationCase;
    }

    /**
     * Sets orientation case.
     *
     * @param orientationCase the orientation case
     */
    public void setOrientationCase(String orientationCase) {
        this.orientationCase = orientationCase;
    }

    /**
     * Gets transaction code.
     *
     * @return the transaction code
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets transaction code.
     *
     * @param transactionCode the transaction code
     */
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets expected result.
     *
     * @return the expected result
     */
    public String getExpectedResult() {
        return expectedResult;
    }

    /**
     * Sets expected result.
     *
     * @param expectedResult the expected result
     */
    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    /**
     * Gets canal code.
     *
     * @return the canal code
     */
    public String getCanalCode() {
        return canalCode;
    }

    /**
     * Sets canal code.
     *
     * @param canalCode the canal code
     */
    public void setCanalCode(String canalCode) {
        this.canalCode = canalCode;
    }

    /**
     * Gets system code.
     *
     * @return the system code
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets system code.
     *
     * @param systemCode the system code
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    /**
     * Gets transaction type.
     *
     * @return the transaction type
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets transaction type.
     *
     * @param transactionType the transaction type
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Gets transaction hour.
     *
     * @return the transaction hour
     */
    public String getTransactionHour() {
        return transactionHour;
    }

    /**
     * Sets transaction hour.
     *
     * @param transactionHour the transaction hour
     */
    public void setTransactionHour(String transactionHour) {
        this.transactionHour = transactionHour;
    }

    /**
     * Gets type log canal.
     *
     * @return the type log canal
     */
    public String getTypeLogCanal() {
        return typeLogCanal;
    }

    /**
     * Sets type log canal.
     *
     * @param typeLogCanal the type log canal
     */
    public void setTypeLogCanal(String typeLogCanal) {
        this.typeLogCanal = typeLogCanal;
    }

    /**
     * Gets operation code.
     *
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets operation code.
     *
     * @param operationCode the operation code
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets evidence path.
     *
     * @return the evidence path
     */
    public String getEvidencePath() {
        return evidencePath;
    }

    /**
     * Sets evidence path.
     *
     * @param evidencePath the evidence path
     */
    public void setEvidencePath(String evidencePath) {
        this.evidencePath = evidencePath;
    }

    /**
     * Gets evidence name.
     *
     * @return the evidence name
     */
    public String getEvidenceName() {
        return evidenceName;
    }

    /**
     * Sets evidence name.
     *
     * @param evidenceName the evidence name
     */
    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
    }

    /**
     * Gets transactionValue
     *
     * @return the transactionValue
     */
    public String getTransactionValue() {
        return transactionValue;
    }

    /**
     * Sets transactionValue.
     *
     * @param transactionValue the transactionValue
     */
    public void setTransactionValue(String transactionValue) {
        this.transactionValue = transactionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof TransactionConfig)) {
            return false;
        }

        TransactionConfig that = (TransactionConfig) o;

        return new EqualsBuilder()
                .append(getIdCase(), that.getIdCase())
                .append(getLogCanalPath(), that.getLogCanalPath())
                .append(getLogCanalName(), that.getLogCanalName())
                .append(getLogStiPath(), that.getLogStiPath())
                .append(getLogStiName(), that.getLogStiName())
                .append(getOrientationCase(), that.getOrientationCase())
                .append(getTransactionCode(), that.getTransactionCode())
                .append(getErrorCode(), that.getErrorCode())
                .append(getExpectedResult(), that.getExpectedResult())
                .append(getCanalCode(), that.getCanalCode())
                .append(getSystemCode(), that.getSystemCode())
                .append(getTransactionType(), that.getTransactionType())
                .append(getTransactionHour(), that.getTransactionHour())
                .append(getTypeLogCanal(), that.getTypeLogCanal())
                .append(getOperationCode(), that.getOperationCode())
                .append(getEvidencePath(), that.getEvidencePath())
                .append(getEvidenceName(), that.getEvidenceName())
                .append(getTransactionValue(), that.getTransactionValue())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getIdCase())
                .append(getLogCanalPath())
                .append(getLogCanalName())
                .append(getLogStiPath())
                .append(getLogStiName())
                .append(getOrientationCase())
                .append(getTransactionCode())
                .append(getErrorCode())
                .append(getExpectedResult())
                .append(getCanalCode())
                .append(getSystemCode())
                .append(getTransactionType())
                .append(getTransactionHour())
                .append(getTypeLogCanal())
                .append(getOperationCode())
                .append(getEvidencePath())
                .append(getEvidenceName())
                .append(getTransactionValue())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("idCase", idCase)
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
                .append("evidencePath", evidencePath)
                .append("evidenceName", evidenceName)
                .append("transactionValue", transactionValue)
                .toString();
    }
}
