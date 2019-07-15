package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.saldos;

import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductos;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaSaldosStepDefinition {

    @Cuando("^consulto el saldo de mis cuentas deposito$")
    public void consultoElSaldoDeMisCuentasDeposito(List<String> cuentasDeposito) {
        theActorInTheSpotlight().attemptsTo(
                RevisarProductos.enSaldosMovimientos(elProducto()
                .conTipoCuenta(cuentasDeposito)
                .conNumero(cuentasDeposito))
        );
    }

    @Entonces("^Verifico el resultado de la consulta del saldo$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
    }

    @Entonces("^Verifico el resultado de los siguientes archivos de iSeries$")
    public void verificoElResultadoDeLosSiguientesArchivosDeISeries(List<String> archivosBack) {
        throw new PendingException();
    }
}
