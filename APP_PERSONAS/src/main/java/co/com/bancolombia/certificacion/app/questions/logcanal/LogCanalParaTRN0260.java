package co.com.bancolombia.certificacion.app.questions.logcanal;

import co.com.bancolombia.certificacion.app.integration.fachada.Depositos;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.clearReport;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.validarCampo;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;

public class LogCanalParaTRN0260 implements Question<Boolean> {
    private static final Logger LOGGER = LogManager.getLogger(LogCanalParaTRN0360.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        clearReport();
        Boolean resultFinal = false;
        List<Map<String, Object>> trama;
        Producto depositos = actor.recall(TIENE_PRODUCTOS);
        trama = Depositos.saldoDepositos(actor);

        if (trama !=  null){
            Boolean resultado = true;

            resultado = validarCampo("CUENTA", trama.get(0).get("sdcuenta").toString(), depositos.getNumero(), resultado);
            resultado = validarCampo("TIPO CUENTA", trama.get(0).get("sdtipocta").toString(), depositos.getTipo(), resultado);
            resultado = validarCampo("SALDO DISPONIBLE", trama.get(0).get("sdsdodsp").toString(), depositos.getSaldo().getSaldoDisponible(), resultado);

            if (resultado){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("ResultLogCanal").
                    andContents(Serenity.sessionVariableCalled("INFORMES_SERENITY"));
        }else{
            LOGGER.info("Consulta sin registros");
        }
        return resultFinal;
    }
}
