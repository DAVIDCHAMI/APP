package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.TermsAndConditions;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;

import java.util.List;

/**
 * The type Current user entity.
 */
public class CargarEntidadTerminos {

    private static TermsAndConditions termsAndConditions = new TermsAndConditions();

    private CargarEntidadTerminos() {
        throw new IllegalStateException(TipoClaseConstante.ENTITY_CLASS);
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public static TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets user.
     *
     * @param data the data
     */
    public static void setTermsAndConditions(List<String> data) {
        termsAndConditions.setTyc(data.get(0));
    }
}