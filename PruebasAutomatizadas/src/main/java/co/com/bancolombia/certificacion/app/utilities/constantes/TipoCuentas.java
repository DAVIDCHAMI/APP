package co.com.bancolombia.certificacion.app.utilities.constantes;

public enum TipoCuentas {

    AHORRO("S" , "7"),
    CORRIENTE("D" , "1");


    private String letra;
    private String numero;

   private TipoCuentas(String letra, String numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
