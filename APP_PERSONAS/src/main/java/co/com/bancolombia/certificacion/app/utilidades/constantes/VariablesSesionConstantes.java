package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class VariablesSesionConstantes {
    public static final String TIENE_PRODUCTOS = "tiene productos";
    public static final String NUMERO_CUENTA = "NUMERO DE CUENTA PRODUCTO";
    public static final String TIPO_CUENTA = "TIPO CUENTA";
    public static final String TIPO_DOCUMENTO = "TIPO DOCUMENTO";
    public static final String NUMERO_DOCUMENTO = "NUMERO DOCUMENTO";
    public static final String NOMBRE_BANCO = "NOMBRE BANCO";
    public static final String LISTA_CUENTAS_DEPOSITO = "CUENTAS DEPOSITO";
    public static final String DETALLE_PRODUCTO = "Detalle Producto";

    private VariablesSesionConstantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}