package co.com.bancolombia.certificacion.app.questions.basededatos.logcanal;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.integration.FachadaIseries;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.LogCanalConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.app.utilidades.logcanal.UtilidadLogCanal.validarCampo;

public class LogCanalParaTRN0325 implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(LogCanalParaTRN0325.class);
    @Override
    public Boolean answeredBy(Actor actor) {
        FachadaIseries.consultChannelLogPlot220230();
        String trama0220 = Serenity.sessionVariableCalled("trama0220LogCanal");
        String trama0230 = Serenity.sessionVariableCalled("trama0230LogCanal");
        Boolean resultFinal = false;
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        Usuario usuario = CargarEntidadUsuario.getUsuario();

        if (trama0220 != "" && trama0230 !=  ""){
            Boolean resultInput = true;
            Boolean resultOutput = true;

            /**
             * This is the Input plot.
             */
            resultInput = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(5,20), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultInput);
            resultInput = validarCampo(LogCanalConstante.TRACE + AdministradorConstante.TRAMAINPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultInput);
            resultInput = validarCampo(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAINPUT, trama0220.substring(313,317), configuracionTransaccion.getCodigoTransaccion(),resultInput);
            resultInput = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(317,332), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultInput);
            resultInput = validarCampo(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(332,333), usuario.getTipoDocumento(),resultInput);
            resultInput = validarCampo(LogCanalConstante.FECHA + AdministradorConstante.TRAMAINPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultInput);

            /**
             * This is the Output plot.
             */
            resultOutput = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(5,20), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.CODIGOERROR + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(69,72), configuracionTransaccion.getCodigoError(),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.TRACE + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(313,317), configuracionTransaccion.getCodigoTransaccion(),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(317,332), StringManager.formatoDocumento(usuario.getNumeroDocumento()),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(332,333), usuario.getTipoDocumento(),resultOutput);
            resultOutput = validarCampo(LogCanalConstante.FECHA + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultOutput);

            if (resultInput && resultOutput){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("ResultLogCanal").andContents(Serenity.sessionVariableCalled("logcanal"));
        }else{
            LOGGER.info("Valores de la trama input y output sin registros");
        }
        return resultFinal;

    }
}
