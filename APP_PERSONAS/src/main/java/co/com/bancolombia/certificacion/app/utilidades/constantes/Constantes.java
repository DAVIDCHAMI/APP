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
    public static final Character PUNTO = '.';
    public static final Character COMA = ',';

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
