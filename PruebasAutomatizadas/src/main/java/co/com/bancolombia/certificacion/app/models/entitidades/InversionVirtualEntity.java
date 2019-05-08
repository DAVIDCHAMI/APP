package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.producto.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.producto.InversionVirtual;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.EXPIRACION;
import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.MENSUAL;
import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Virtual investment entity.
 */
public class InversionVirtualEntity {

    private static InversionVirtual inversionVirtual = new InversionVirtual();

    private InversionVirtualEntity() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    /**
     * Gets inversion virtual.
     *
     * @return the inversion virtual
     */
    public static InversionVirtual getInversionVirtual() {
        return inversionVirtual;
    }

    /**
     * Sets inversion virtual.
     *
     * @param data the transaccionCon
     */
    public static void setInversionVirtual(List<String> data) {
        CuentaDeposito cuentaDeposito = new CuentaDeposito();
        inversionVirtual.setValorInversion(data.get(0));
        inversionVirtual.setTerminoDias(data.get(1));
        inversionVirtual.setPeriodicidadPagoInteres(data.get(2));
        inversionVirtual.setPeriodicidadPagoInteresNumero(castearPeriodicidad(data.get(2)));

        cuentaDeposito.setNumeroCuentaFormateado(data.get(3));
        cuentaDeposito.setTipoProducto(data.get(4));

        inversionVirtual.setCuentaDeposito(cuentaDeposito);

    }

    private static int castearPeriodicidad(String periodicity) {
        int result = 0;
        if (periodicity.equalsIgnoreCase(MENSUAL)) {
            result = 1;
        } else if (periodicity.equalsIgnoreCase(EXPIRACION)) {
            result = 2;
        }
        return result;
    }
}
