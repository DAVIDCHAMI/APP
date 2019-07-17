package co.com.bancolombia.certificacion.app.models.entitidades.detalle;


import co.com.bancolombia.certificacion.app.models.productos.InversionVirtual;

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
     * Gets detalleproductos inversion virtual.
     *
     * @return the detalleproductos inversion virtual
     */
    public static InversionVirtual getDetalleInversionVirtual() {
        return detalleInversionVirtual;
    }

    /**
     * Sets detalleproductos inversion virtual.
     *
     * @param data the transaccionCon
     */
    public static void setDetalleInversionVirtual(List<String> data) {
        detalleInversionVirtual.setNumeroInversion(data.get(0));
    }
}
