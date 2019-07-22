package co.com.bancolombia.certificacion.app.models.entitidades.detalle;

import co.com.bancolombia.certificacion.app.models.productos.InversionVirtual;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class EntidadDetalleInversionVirtual {

    private static InversionVirtual detalleInversionVirtual = new InversionVirtual();

    private EntidadDetalleInversionVirtual() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static InversionVirtual getDetalleInversionVirtual() {
        return detalleInversionVirtual;
    }

    public static void setDetalleInversionVirtual(List<String> data) {
        detalleInversionVirtual.setNumeroInversion(data.get(0));
    }
}
