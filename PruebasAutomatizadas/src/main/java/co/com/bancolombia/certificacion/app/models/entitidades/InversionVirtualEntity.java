package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.producto.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.producto.InversionVirtual;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.EXPIRATION;
import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.MONTHLY;
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
        inversionVirtual.setInvestmentValue(data.get(0));
        inversionVirtual.setDaysTerm(data.get(1));
        inversionVirtual.setPeriodicityPaymentInterest(data.get(2));
        inversionVirtual.setPeriodicityPaymentInterestNumber(castPeriodicity(data.get(2)));

        cuentaDeposito.setNumeroCuentaFormateado(data.get(3));
        cuentaDeposito.setTipoProducto(data.get(4));

        inversionVirtual.setDepositAccount(cuentaDeposito);

    }

    private static int castPeriodicity(String periodicity) {
        int result = 0;
        if (periodicity.equalsIgnoreCase(MONTHLY)) {
            result = 1;
        } else if (periodicity.equalsIgnoreCase(EXPIRATION)) {
            result = 2;
        }
        return result;
    }
}
