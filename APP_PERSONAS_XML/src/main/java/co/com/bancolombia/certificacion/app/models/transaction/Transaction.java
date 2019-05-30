package co.com.bancolombia.certificacion.app.models.transaction;

/**
 * The type Transaction.
 */
public class Transaction {

    private String trxCode;
    private String errorCode;
    private String channelType;
    private String orientation;
    private String expectedResult;
    private String evidencePath;
    private String channelLogPath;
    private String evidenceName;

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
     * Gets channel log path.
     *
     * @return the channel log path
     */
    public String getChannelLogPath() {
        return channelLogPath;
    }

    /**
     * Sets channel log path.
     *
     * @param channelLogPath the channel log path
     */
    public void setChannelLogPath(String channelLogPath) {
        this.channelLogPath = channelLogPath;
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
     * Gets orientation.
     *
     * @return the orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets orientation.
     *
     * @param orientation the orientation
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * Gets trx code.
     *
     * @return the trx code
     */
    public String getTrxCode() {
        return trxCode;
    }

    /**
     * Sets trx code.
     *
     * @param trxCode the trx code
     */
    public void setTrxCode(String trxCode) {
        this.trxCode = trxCode;
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
     * Gets channel type.
     *
     * @return the channel type
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets channel type.
     *
     * @param channelType the channel type
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
