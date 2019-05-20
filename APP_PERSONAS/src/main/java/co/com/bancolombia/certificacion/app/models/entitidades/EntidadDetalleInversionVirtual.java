package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.producto.InversionVirtual;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Virtual investment detail entity.
 */
public class EntidadDetalleInversionVirtual {

    private static InversionVirtual detalleInversionVirtual = new InversionVirtual();

    private EntidadDetalleInversionVirtual() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    /**
     * Gets detalle inversion virtual.
     *
     * @return the detalle inversion virtual
     */
    public static InversionVirtual getDetalleInversionVirtual() {
        return detalleInversionVirtual;
    }

    /**
     * Sets detalle inversion virtual.
     *
     * @param data the transaccionCon
     */
    public static void setDetalleInversionVirtual(List<String> data) {
        detalleInversionVirtual.setNumeroInversion(data.get(0));
    }
}
