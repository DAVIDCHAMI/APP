package co.com.bancolombia.certificacion.app.models.transaction;

public class TermConditions {

    private String versionTermCond;
    private String fecha;
    private TransactionConfig transactionConfig;

    public String getVersionTermCond() {
        return versionTermCond;
    }

    public void setVersionTermCond(String versionTermCond) {
        this.versionTermCond = versionTermCond;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TransactionConfig getTransactionConfig() {
        return transactionConfig;
    }

    public void setTransactionConfig(TransactionConfig transactionConfig) {
        this.transactionConfig = transactionConfig;
    }


}
