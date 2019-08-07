package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.saldos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarProductosElegidos;
import co.com.bancolombia.certificacion.app.tasks.basededatos.comunes.ConsultarLosArchivosDeIseries;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductos;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException.MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaSaldosStepDefinition {

    @Cuando("^consulto el saldo de mis (.*)$")
    public void consultoElSaldoDeMisCuentasDeposito(String opcionCategoria, List<String> cuentasDeposito) {
        theActorInTheSpotlight().attemptsTo(
                RevisarProductos.enSaldosMovimientos(elProducto()
                        .conTipoCuenta(cuentasDeposito)
                        .conNumero(cuentasDeposito), opcionCategoria)
        );
    }

    @Entonces("^Verifico el resultado de la consulta del saldo$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
        theActorInTheSpotlight().should(seeThat(VerificarProductosElegidos.pertenecenAlUsuario())
                .orComplainWith(ProductosDeUsuarioNoSonCorrectosException.class, MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS));
    }

    @Entonces("^Verifico el resultado de los siguientes archivos de iSeries$")
    public void verificoElResultadoDeLosSiguientesArchivosDeISeries(List<String> archivosBack) {
        theActorInTheSpotlight().attemptsTo(ConsultarLosArchivosDeIseries.enApp(archivosBack));
    }
}
