package co.com.bancolombia.certificacion.app.stepdefinitions.transferencia;

import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.tasks.transferencia.RealizarTransferencia;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder.con;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaStepDefinition {
    @Y("diligencios los datos de la transferencia con información$")
    public void diligenciaDatosDeTransferencia(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(RealizarTransferencia.conInfo(
                con().
                        conTipoTransferencia(datos)
                        .conNumeroCuentaOrigen(datos).conTipoCuentaOrigen(datos)
                        .conNumeroCuentaDestino(datos).conTipoCuentaDestino(datos)
                        .conMonto(datos)));
    }
}
