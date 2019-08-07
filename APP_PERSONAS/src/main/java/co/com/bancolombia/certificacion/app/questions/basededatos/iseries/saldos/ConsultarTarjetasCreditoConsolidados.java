package co.com.bancolombia.certificacion.app.questions.basededatos.iseries.saldos;

import co.com.bancolombia.certificacion.app.integration.fachada.Tarjetas;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.tipoCuentaLetra;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.validarCampo;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;

public class ConsultarTarjetasCreditoConsolidados implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultarTarjetasCreditoConsolidados.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultFinal = false;
        List<Map<String, Object>> registros;
        Producto producto = actor.recall(MODELO_DETALLE_PRODUCTO);
        registros = Tarjetas.saldoConsolidadoTarjetas(actor);

        if (registros.size() > 0){
            Boolean resultadoDato = true;
            String saldoDisponible = producto.getSaldo().getSaldoDisponible().replace("$","").replace("","");
            String saldoCanje = producto.getSaldo().getSaldoEnCanje();
            String saldoTotal = producto.getSaldo().getSaldoTotal();

            resultadoDato = validarCampo("TIPO TARJETA", registros.get(0).get("sdtipocta").toString().trim(), tipoCuentaLetra(producto.getTipo()),resultadoDato);
            resultadoDato = validarCampo("NUMERO TARJETA", registros.get(0).get("sdcuenta").toString().trim(), producto.getNumero().replace("-",""),resultadoDato);
            resultadoDato = validarCampo("CUPO DISPONIBLE", registros.get(0).get("sdsdodsp").toString().trim(), saldoDisponible,resultadoDato);

            if (resultadoDato){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("Verificacion Back Saldos Tarjetas").andContents(Serenity.sessionVariableCalled("informes_serenity"));
        }else{
            LOGGER.info("Sin registros en la consulta");
        }
        return resultFinal;
    }
}
