package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class Constantes {
    public static final String CUENTAS = "Cuentas";
    public static final String TARJETAS_CREDITO = "CreditCards";
    public static final String E_PREPAGO = "ePrepaid";
    public static final String CREDIAGIL = "Crediagil";
    public static final String INVERSIONES = "Investments";
    public static final String CREDITOS = "Credits";
    public static final String AHORROS="Ahorros";
    public static final String CORRIENTE="Corriente";
    public static final Character COMA = ',';
    public static final String PAGAR_TARJETA_CREDITO_NO_PROPIA = "Pagar tarjetas no propias";
    public static final String PAGAR_CREDITOS = "Pagar créditos";
    public static final String PAGAR_TARJETA_CREDITO_PROPIAS = "Pagar tarjetas propias";
    public static final String PESOS = "Pesos";
    public static final String DOLARES = "Dólares";
    public static final String OTRO_VALOR = "Otro valor";
    public static final String SIGUIENTE = "SIGUIENTE";
    public static final String PAGAR = "PAGAR";
    public static final String CEROS = "0.00";

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
