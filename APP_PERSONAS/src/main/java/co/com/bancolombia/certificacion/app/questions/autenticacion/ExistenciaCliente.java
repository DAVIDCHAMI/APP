package co.com.bancolombia.certificacion.app.questions.autenticacion;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.integration.fachada.Autenticacion;
import co.com.bancolombia.certificacion.app.integration.fachada.LogCanal;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.LogCanalConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.validarCampo;

public class ExistenciaCliente implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ExistenciaCliente.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultFinal = false;
        List<Map<String, Object>> trama;
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        Usuario usuario = EntidadUsuarioActual.getUsuario();
        trama = Autenticacion.consultaDeExistenciaDelCliente();

        if (trama !=  null){
            String trama0220 = trama.get(0).toString().replace("datos=","");
            String trama0230 = trama.get(1).toString().replace("datos=","");
            Boolean resultadoEntrada = true;
            Boolean resultadoSalida = true;

            resultadoEntrada = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(5,20), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultadoEntrada);
            resultadoEntrada = validarCampo(LogCanalConstante.TRACE + AdministradorConstante.TRAMAINPUT, trama0220.substring(301,313), configuracionTransaccion.getTrace(),resultadoEntrada);
            resultadoEntrada = validarCampo(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAINPUT, trama0220.substring(313,317), configuracionTransaccion.getCodigoTransaccion(),resultadoEntrada);
            resultadoEntrada = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(317,332), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultadoEntrada);
            resultadoEntrada = validarCampo(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(332,333), "0",resultadoEntrada);
            resultadoEntrada = validarCampo(LogCanalConstante.FECHA + AdministradorConstante.TRAMAINPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultadoEntrada);


            resultadoSalida = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(5,20), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.CODIGOERROR + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(69,72), configuracionTransaccion.getCodigoError(),resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.TRACE + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(301,313), configuracionTransaccion.getTrace(),resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(313,317), configuracionTransaccion.getCodigoTransaccion(),resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(317,332), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(332,333), "0",resultadoSalida);
            resultadoSalida = validarCampo(LogCanalConstante.FECHA + AdministradorConstante.TRAMAOUTPUT, trama0230.substring(349,357), DateManager.obtenerFechaSistema("YYYYMMdd"),resultadoSalida);

            if (resultadoEntrada && resultadoSalida){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("ResultLogCanal").andContents(Serenity.sessionVariableCalled("log"));
        }else{
            LOGGER.info("Valores de la trama input y output sin registros");
        }
        return resultFinal;
    }
}
