package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class Constantes {
    public static final String CUENTAS = "Cuentas";
    public static final String TARJETAS_CREDITO = "CreditCards";
    public static final String TARJETAS_CREDITO_MOVIMIENTOS = "Tarjetas de crédito";
    public static final String E_PREPAGO = "ePrepaid";
    public static final String CREDIAGIL = "Crediagil";
    public static final String INVERSIONES = "Investments";
    public static final String CREDITOS = "Credits";
    public static final String AHORROS="Ahorros";
    public static final String CORRIENTE="Corriente";
    public static final Character COMA = ',';
    public static final String CEROS = "0.00";
    public static final String SIN_VALOR = "Sin valor";
    public static final String TRANSFERIR_PRODUCTOS_NO_INSCRITOS = "Productos no inscritos";
    public static final String TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS = "Productos propios e inscritos";
    public static final String TRANSFERIR_PRODUCTOS_OTROS_BANCOS = "Productos inscritos de otros";
    public static final String PRODUCTO_ORIGEN = "Producto origen";
    public static final String VALOR_PAGAR = "Valor a pagar";
    public static final String PERIODICIDAD = "Periodicidad";
    public static final int NUMERO_PANTALLAS_ONBOARDING = 5;
    public static final String INSCRITAS = "INSCRITAS";

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
