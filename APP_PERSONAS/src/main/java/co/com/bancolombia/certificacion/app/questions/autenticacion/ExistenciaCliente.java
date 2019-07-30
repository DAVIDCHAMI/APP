package co.com.bancolombia.certificacion.app.questions.autenticacion;

import co.com.bancolombia.certificacion.app.integration.fachada.Autenticacion;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.ConstantesIseries;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
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
        List<Map<String, Object>> registros;
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        Usuario usuario = EntidadUsuarioActual.getUsuario();
        registros = Autenticacion.consultaDeExistenciaDelCliente();

        if (registros !=  null){
            Boolean resultadoDato = true;

            resultadoDato = validarCampo(ConstantesIseries.DOCUMENTO, registros.get(0).get("cnnoss").toString(), StringManager.formatoDocumento("58156994"),resultadoDato);
            resultadoDato = validarCampo(ConstantesIseries.TIPODOCUMENTO, registros.get(0).get("cncdti").toString(), "1",resultadoDato);
            resultadoDato = validarCampo(ConstantesIseries.ESTADOUSUARIO, registros.get(0).get("estado").toString(), "A",resultadoDato);
            resultadoDato = validarCampo("NOMBRE DE USUARIO", registros.get(0).get("idusuario").toString(), "INVICTUS01",resultadoDato);

            if (resultadoDato){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("Verificacion Back Autenticacion").andContents(Serenity.sessionVariableCalled("log"));
        }else{
            LOGGER.info("Sin registros en la consulta");
        }
        return resultFinal;
    }


}
