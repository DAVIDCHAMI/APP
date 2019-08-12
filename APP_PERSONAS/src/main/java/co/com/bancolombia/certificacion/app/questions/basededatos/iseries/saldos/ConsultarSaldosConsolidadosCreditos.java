package co.com.bancolombia.certificacion.app.questions.basededatos.iseries.saldos;

import co.com.bancolombia.certificacion.app.integration.fachada.Creditos;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.validarCampo;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS;

public class ConsultarSaldosConsolidadosCreditos implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultarSaldosConsolidadosCreditos.class);

    public ConsultarSaldosConsolidadosCreditos() {
        throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultFinal = false;
        List<Map<String, Object>> registros;
        List<Producto> listaProductos = actor.recall(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS);
        registros = Creditos.saldoCreditosConsolidado(actor);

        if (registros.size() > 0) {
            Boolean resultadoDato = true;

            String valor_total = registros.get(0).get("valor_total").toString().trim();

            String saldoTotalFront = listaProductos.get(0).getSaldo().getSaldoTotal().replace("$", "").replace(".", "").replace(",", ".").trim();

            resultadoDato = validarCampo("CUENTA", registros.get(0).get("numero_credito").toString().trim(), listaProductos.get(0).getNumero().replace("-", ""), resultadoDato);
            resultadoDato = validarCampo("SALDO TOTAL", valor_total, saldoTotalFront, resultadoDato);

            if (resultadoDato) {
                resultFinal = true;
            }
            Serenity.recordReportData().withTitle("Verificacion Back Detalle Depositos").andContents(Serenity.sessionVariableCalled("informes_serenity"));
        } else {
            LOGGER.info("Sin registros en la consulta");
        }
        return resultFinal;
    }


}
