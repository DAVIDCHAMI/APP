package co.com.bancolombia.certificacion.app.models.entitidades;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.models.builders.ConfiguracionTransaccionBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.FORMATO_HORA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.CanalesSistemas.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;


public class EntidadConfiguracionTransaccionActual {

    private static ConfiguracionTransaccion configuracionTransaccion = new ConfiguracionTransaccion(ConfiguracionTransaccionBuilder.informacion());

    private EntidadConfiguracionTransaccionActual() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static ConfiguracionTransaccion getConfiguracionTransaccion() {
        return configuracionTransaccion;
    }

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
