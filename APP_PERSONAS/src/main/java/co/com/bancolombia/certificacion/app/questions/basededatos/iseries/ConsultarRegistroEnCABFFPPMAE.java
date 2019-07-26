package co.com.bancolombia.certificacion.app.questions.basededatos.iseries;

import co.com.bancolombia.certificacion.app.integration.fachada.Eprepago;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultarRegistroEnCABFFPPMAE implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        if(AdministradorConstante.CODIGO_TRN_ACTIVATION_EPREPAGO.equals(configuracionTransaccion.getCodigoTransaccion())){
            result = Eprepago.verificoEstadoDeLaActivacionDeLaEprepago();
        }
        if(AdministradorConstante.CODIGO_TRN_INACTIVATION_EPREPAGO.equals(configuracionTransaccion.getCodigoTransaccion())){
            result = Eprepago.verificoEstadoDeLaInactivacionDeLaEprepago();
        }
        return result;
    }
}
