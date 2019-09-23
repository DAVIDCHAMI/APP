package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class Constantes {
    public static final String CUENTAS = "Cuentas";
    public static final String TARJETAS_CREDITO = "CreditCards";
    public static final String E_PREPAGO = "ePrepaid";
    public static final String CREDIAGIL = "Crediagil";
    public static final String INVERSIONES = "Investments";
    public static final String CREDITOS = "Credits";
    public static final String AHORROS = "Ahorros";
    public static final String CORRIENTE = "Corriente";
    public static final Character COMA = ',';
    public static final Character NUMERO_VISA = '4';
    public static final String VISA = "Visa";
    public static final String OTRO_VALOR = "Otro valor";
    public static final String CEROS = "0.00";
    public static final String SIN_VALOR = "Sin valor";
    public static final String PRODUCTO_ORIGEN = "Producto origen";
    public static final String PAGO_EXITOSO = "¡Pago exitoso!";
    public static final String TRANSFERIR_PRODUCTOS_NO_INSCRITOS = "Productos no inscritos";
    public static final String TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS = "Productos propios e inscritos";
    public static final String VALOR_PAGAR = "Valor a pagar";
    public static final String PERIODICIDAD = "Periodicidad";
    public static final int NUMERO_PANTALLAS_ONBOARDING = 5;
    public static final String INSCRITAS = "INSCRITAS";
    public static final String RANGO_FECHAS = "RANGO DE FECHAS";
    public static final String FONDO_INVERSION = "Fondo de inversión";
    public static final String OPCION_INVERSIONES = "Inversiones";

    private Constantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
