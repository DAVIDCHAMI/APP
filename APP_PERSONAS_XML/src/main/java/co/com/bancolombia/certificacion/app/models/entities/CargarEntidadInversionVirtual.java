package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.products.DepositAccount;
import co.com.bancolombia.certificacion.app.models.products.VirtualInvestment;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.EXPIRATION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.MONTHLY;


/**
 * The type Virtual investment entity.
 */
public class CargarEntidadInversionVirtual {

    private static VirtualInvestment virtualInvestment = new VirtualInvestment();

    private CargarEntidadInversionVirtual() {
        throw new IllegalStateException(TipoClaseConstante.ENTITY_CLASS);
    }

    /**
     * Gets inversion virtual.
     *
     * @return the inversion virtual
     */
    public static VirtualInvestment getVirtualInvestment() {
        return virtualInvestment;
    }

    /**
     * Sets inversion virtual.
     *
     * @param data the data
     */
    public static void setVirtualInvestment(List<String> data) {
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        DepositAccount depositAccount = new DepositAccount();

        if (AdministradorConstante.TRANSACTION_CODE_OPENING_VIRTUAL_INVESTMENT.equals(configuracionTransaccion.getTransactionCode())||
                AdministradorConstante.TRANSACTION_CODE_SIMULATION_VIRTUAL_INVESTMENT.equals(configuracionTransaccion.getTransactionCode())){
            virtualInvestment.setInvestmentValue(data.get(0));
            virtualInvestment.setPeriodicityPaymentInterest(data.get(1));
            virtualInvestment.setDaysTerm(data.get(2));
            virtualInvestment.setAnnualEffectiveRate(data.get(3));


        }else{
            virtualInvestment.setInvestmentValue(data.get(0));
            virtualInvestment.setDaysTerm(data.get(1));
            virtualInvestment.setPeriodicityPaymentInterest(data.get(2));
            virtualInvestment.setPeriodicityPaymentInterestNumber(castPeriodicity(data.get(2)));
            depositAccount.setAccountNumberFormat(data.get(3));
            depositAccount.setProductType(data.get(4));
        }
        virtualInvestment.setDepositAccount(depositAccount);

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
