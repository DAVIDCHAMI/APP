package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class Constantes {
    public static final String CUENTAS_DEPOSITO = "Cuentas";
    public static final String TARJETAS_CREDITO = "Tarjetas de crédito";
    public static final String E_PREPAGO = "e-Prepago";
    public static final String CREDIAGIL = "Crediágil";
    public static final String INVERSIONES = "Inversiones";
    public static final String CREDITOS = "Créditos";
    public static final String AHORROS = "Ahorros";
    public static final String CORRIENTE = "Corriente";
    public static final String CEROS = "0.00";
    public static final Character COMA = ',';
    public static final String PAGAR_TARJETA_CREDITO_NO_PROPIA = "Pagar tarjetas no propias";
    public static final String PAGAR_CREDITOS = "Pagar créditos";
    public static final String PAGAR_TARJETA_CREDITO_PROPIAS = "Pagar tarjetas propias";
    public static final String PESOS = "Pesos";
    public static final String DOLARES = "Dólares";
    public static final String OTRO_VALOR = "Otro valor";
    public static final String SIGUIENTE = "SIGUIENTE";
    public static final String PAGAR = "PAGAR";

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
