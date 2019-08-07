package co.com.bancolombia.certificacion.app.questions.basededatos.iseries.saldos;

import co.com.bancolombia.certificacion.app.integration.fachada.Autenticacion;
import co.com.bancolombia.certificacion.app.integration.fachada.Depositos;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades;
import co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.ConstantesIseries;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.tipoCuentaLetra;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.validarCampo;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;

public class ConsultarDetalleDepositos implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultarDetalleDepositos.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultFinal = false;
        List<Map<String, Object>> registros;
        Producto depositos = actor.recall(TIENE_PRODUCTOS);
        registros = Depositos.saldoDepositos(actor);

        if (registros.size() > 0){
            Boolean resultadoDato = true;
            resultadoDato = validarCampo("CUENTA", registros.get(0).get("sdcuenta").toString().trim(), depositos.getNumero().replace("-",""),resultadoDato);
            resultadoDato = validarCampo("TIPO CUENTA", registros.get(0).get("sdtipocta").toString().trim(), tipoCuentaLetra(depositos.getTipo()),resultadoDato);
            resultadoDato = validarCampo("SALDO DISPONOBLE", registros.get(0).get("sdsdodsp").toString().trim(), depositos.getSaldo().getSaldoDisponible(),resultadoDato);

            if (resultadoDato){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("Verificacion Back Detalle Depositos").andContents(Serenity.sessionVariableCalled("log"));
        }else{
            LOGGER.info("Sin registros en la consulta");
        }
        return resultFinal;
    }


}
