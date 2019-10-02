package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder.factura;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_HISTORICO_FACTURA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HistoricoPago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int iterador = 1;
        List<Factura> listaHistoricoPago = new ArrayList<>();
        actor.attemptsTo(
                WaitUntil.the(LBL_CONTENEDOR_HISTORICO_PAGO.of(String.valueOf(iterador)), isVisible())
        );
        while (Verificar.elementoVisible(actor, LBL_CONTENEDOR_HISTORICO_PAGO.of(String.valueOf(iterador)))) {
            listaHistoricoPago.add(factura().
                    conReferencia(LBL_REFERENCIA_HISTORICO_PAGO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conFechaFactura(LBL_FECHA_HISTORICO_PAGO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conEstadoHistorico(LBL_ESTADO_HISTORICO_PAGO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conValor(LBL_VALOR_HISTORICO_PAGO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .build()
            );
            iterador++;
        }
        actor.remember(MODELO_HISTORICO_FACTURA,listaHistoricoPago );
    }
}