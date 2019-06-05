package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.transaction.Inscripcion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.models.products.DepositAccount;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;

import java.util.List;

/**
 * The type Inscripcion entity.
 */
public class CargarEntidadInscripcion {

    /**
     * The constantes inscripcion.
     */
    private static Inscripcion inscripcion = new Inscripcion();

    private CargarEntidadInscripcion() {
        throw new IllegalStateException(TipoClaseConstante.ENTITY_CLASS);
    }

    /**
     * Gets insciption.
     *
     * @return the insciption
     */
    public static Inscripcion getInsciption() {
        return inscripcion;
    }

    /**
     * Sets insciption.
     *
     * @param data the data
     */
    public static void setInsciption(List<String> data) {
        DepositAccount depositAccount = new DepositAccount();
        User user = new User();

        inscripcion.setBankName(data.get(0));
        depositAccount.setProductType(data.get(1));
        depositAccount.setAccountNumberFormat(data.get(2));
        inscripcion.setCustomName(data.get(3));
        user.setDocumenType(data.get(4));
        user.setDocumentNumber(data.get(5));

        inscripcion.setUser(user);
        inscripcion.setDepositAccount(depositAccount);
    }
}
