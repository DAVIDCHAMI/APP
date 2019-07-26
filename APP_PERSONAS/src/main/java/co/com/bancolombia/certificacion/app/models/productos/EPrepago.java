package co.com.bancolombia.certificacion.app.models.productos;


public class EPrepago {
    private String originAccount;
    private String amount;
    private String movementDate;
    private String movementDescription;
    private String movementValue;
    private String dateto;
    private String datefrom;
    private double balnceBefore;
    private double balanceAfter;
    private String tyc;
    private String listDescriptionMoments;
    private String listCoinMoments;


    public String getListDescriptionMoments() {
        return listDescriptionMoments;
    }

    public void setListDescriptionMoments(String listDescriptionMoments) {
        this.listDescriptionMoments = listDescriptionMoments;
    }

    public String getListCoinMoments() {
        return listCoinMoments;
    }

    public void setListCoinMoments(String listCoinMoments) {
        this.listCoinMoments = listCoinMoments;
    }

    public String getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(String datefrom) {
        this.datefrom = datefrom;
    }

    public String getDateto() {
        return dateto;
    }

    public void setDateto(String dateto) {
        this.dateto = dateto;
    }

    public String getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(String movementDate) {
        this.movementDate = movementDate;
    }

    public String getMovementDescription() {
        return movementDescription;
    }

    public void setMovementDescription(String movementDescription) {
        this.movementDescription = movementDescription;
    }

    public String getMovementValue() {
        return movementValue;
    }

    public void setMovementValue(String movementValue) {
        this.movementValue = movementValue;
    }

    public String getTyc() {
        return tyc;
    }

    public void setTyc(String tyc) {
        this.tyc = tyc;
    }

    public double getBalnceBefore() {
        return balnceBefore;
    }

    public void setBalnceBefore(double balnceBefore) {
        this.balnceBefore = balnceBefore;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
