package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class VariablesSesionConstantes {
    public static final String TIENE_PRODUCTOS = "tiene productos";
    public static final String NUMERO_CUENTA = "NUMERO DE CUENTA PRODUCTO";
    public static final String TIPO_CUENTA = "TIPO CUENTA";
    public static final String SALDO_DISPONIBLE = "SALDO DISPONIBLE";
    public static final String INFO_CODIGO_QR = "INFO_CODIGO_QR";

    private VariablesSesionConstantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}