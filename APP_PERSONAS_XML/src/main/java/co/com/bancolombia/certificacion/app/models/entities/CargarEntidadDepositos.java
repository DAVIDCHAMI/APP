package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.Deposit;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;

import java.util.List;

/**
 * The type Current Deposit entity.
 */

public class CargarEntidadDepositos {


    private static Deposit deposit = new Deposit();
    private CargarEntidadDepositos() {
        throw new IllegalStateException(TipoClaseConstante.ENTITY_CLASS);
    }

    /**
     * Gets deposit.
     *
     * @return  deposit
     */
    public static Deposit getDeposit() {
        return deposit;
    }

    /**
     * Sets deposit.
     *
     * @param data the data
     */
    public static void setDeposit(List<String> data){
        deposit.setAccount(data.get(0));
        deposit.setTypeAccount(data.get(1));
        deposit.setBalance(Double.parseDouble(data.get(2)));
    }
}
