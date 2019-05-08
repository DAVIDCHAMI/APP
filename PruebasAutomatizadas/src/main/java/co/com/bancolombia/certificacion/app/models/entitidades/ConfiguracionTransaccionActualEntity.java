package co.com.bancolombia.certificacion.app.models.entitidades;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.FORMATO_HORA;
import static co.com.bancolombia.certificacion.app.utilities.constantes.CanalesSistemas.*;
import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Current trasaction config entity.
 */
public class ConfiguracionTransaccionActualEntity {

    private static ConfiguracionTransaccion configuracionTransaccion = new ConfiguracionTransaccion();

    private ConfiguracionTransaccionActualEntity() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    /**
     * Gets transaccion.
     *
     * @return the transaccion
     */
    public static ConfiguracionTransaccion getConfiguracionTransaccion() {
        return configuracionTransaccion;
    }

    /**
     * Sets transaccion.
     *
     * @param dataTransaccion Datos que llegan del datadriven
     */
    public static void setConfiguracionTransaccion(List<String> dataTransaccion) {

        String horaTransaccion = DateManager.obtenerFechaSistema(FORMATO_HORA);
        configuracionTransaccion.setIdentificadorCaso(dataTransaccion.get(0));
        configuracionTransaccion.setOrientacionCaso(dataTransaccion.get(1));
        configuracionTransaccion.setCodigoError(dataTransaccion.get(2));
        configuracionTransaccion.setCodigoTransaccion(dataTransaccion.get(3));
        configuracionTransaccion.setResultadoEsperado(dataTransaccion.get(4));
        configuracionTransaccion.setCodigoCanal(SVP.toString());
        configuracionTransaccion.setCodigoSistema(BLP.toString());
        configuracionTransaccion.setTipoLogCanal(WWW.toString());
        configuracionTransaccion.setHoraTransaccion(horaTransaccion);

    }
}
