package co.com.bancolombia.certificacion.app.stepdefinitions.consultas;

import co.com.bancolombia.certificacion.app.tasks.categorias.SeleccionarCategoria;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaSaldosStepDefinitions {

    @Cuando("^consulto el saldo de mis cuentas deposito$")
    public void consultoElSaldoDeMisCuentasDeposito() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoria.cuentasDeposito()
        );
    }

    @Entonces("^Verifico el resultado de la consulta del saldo$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
        throw new PendingException();
    }

    @Entonces("^Verifico el resultado de los siguientes archivos de iSeries$")
    public void verificoElResultadoDeLosSiguientesArchivosDeISeries(List<String> archivosBack) {
        throw new PendingException();
    }
}
