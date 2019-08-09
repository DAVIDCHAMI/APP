package co.com.bancolombia.certificacion.app.utilidades.enumeradores;

public enum TipoProductosEnum {
    CUENTAS("AccountContentContainer"),
    TARJETAS("CreditCardContentContainer"),
    E_PREPAGO("EprepagoContentContainer"),
    CREDIAGIL("CrediagilContentContainer"),
    INVERSIONES("InvestmentContentContainer"),
    CREDITOS("LoansContentContainer");

    private String tipoProducto;

    TipoProductosEnum(String tipoProducto) {
        this.tipoProducto= tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }
}
