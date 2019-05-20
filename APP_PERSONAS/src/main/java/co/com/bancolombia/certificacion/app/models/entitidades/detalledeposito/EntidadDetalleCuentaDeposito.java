package co.com.bancolombia.certificacion.app.models.entitidades.detalledeposito;


import co.com.bancolombia.certificacion.app.models.producto.CuentaDeposito;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Detail query deposit account entity.
 */
public class EntidadDetalleCuentaDeposito {

    private static CuentaDeposito cuentaDeposito = new CuentaDeposito();

    private EntidadDetalleCuentaDeposito() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    /**
     * Gets detalle consulta cuenta deposito.
     *
     * @return the detalle consulta cuenta deposito
     */
    public static CuentaDeposito getCuentaDeposito() {
        return cuentaDeposito;
    }

    /**
     * Sets detalle consulta cuenta deposito.
     *
     * @param data the transaccionCon
     */
    public static void setCuentaDeposito(List<String> data) {
        cuentaDeposito.setNumeroCuentaFormateado(data.get(0));
        cuentaDeposito.setTipoProducto(data.get(1));

    }


}
