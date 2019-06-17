package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.integration.BackendFacadeEprepago;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultarRegistroEnCABFFPPMAE implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        if(AdministradorConstante.TRANSACTIONCODE_ACTIVATION_EPREPAGO.equals(configuracionTransaccion.getCodigoTransaccion())){
            result = BackendFacadeEprepago.verifyEprepagoStateActivation();
        }
        if(AdministradorConstante.TRANSACTIONCODE_INACTIVATION_EPREPAGO.equals(configuracionTransaccion.getCodigoTransaccion())){
            result = BackendFacadeEprepago.verifyEprepagoStateInactivation();
        }
        return result;
    }
}
