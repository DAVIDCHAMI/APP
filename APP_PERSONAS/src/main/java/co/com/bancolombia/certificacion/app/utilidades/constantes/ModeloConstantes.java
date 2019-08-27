package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class ModeloConstantes {
    public static final String MODELO_LISTA_CUENTAS_DEPOSITO = "CUENTAS DEPOSITO";
    public static final String MODELO_LISTA_MOVIMIENTOS = "LISTA MOVIMIENTOS";
    public static final String MODELO_DETALLE_PRODUCTO = "Detalle Producto";
    public static final String MODELO_PRODUCTO_SALDOS_MOVIMIENTOS = "Detalle Producto";
    public static final String MODELO_INFO_CODIGO_QR = "INFO_CODIGO_QR";
    public static final String MODELO_DATOS_TRANSACCION = "MODELO DATOS TRANSACCION";
    public static final String MODELO_FACTURA = "MODELO FACTURA";
    public static final String MODELO_DATOS_AUTENTICACION = "MODELO DATOS AUTENTICACION";


    private ModeloConstantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}