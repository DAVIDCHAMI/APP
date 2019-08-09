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
    public static final String CEROS = "0.00";
    public static final String TRANSFERIR_PRODUCTOS_NO_INSCRITOS = "Productos no inscritos";
    public static final String TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS = "Productos propios e inscritos";
    public static final String TRANSFERIR_PRODUCTOS_OTROS_BANCOS = "Productos inscritos de otros";
    public static final int NUMERO_PANTALLAS_ONBOARDING = 5;

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
