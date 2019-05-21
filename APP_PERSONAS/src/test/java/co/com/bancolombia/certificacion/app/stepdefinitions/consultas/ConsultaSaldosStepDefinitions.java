package co.com.bancolombia.certificacion.app.stepdefinitions.consultas;

import co.com.bancolombia.certificacion.app.tasks.autenticacion.Autenticarse;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatos;
import co.com.bancolombia.certificacion.app.tasks.menu.Seleccionar;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaSaldosStepDefinitions {


    @Before
    public void configuracionInicial() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) subo los datos para la prueba$")
    public void queSuboLosDatosParaLaPrueba(String actor, List<List<String>> datosTransaccion) {
        theActorCalled(actor)
                .wasAbleTo(
                        CargarDatos.transaccionCon(datosTransaccion.get(0)).datosDelUsuarioCon(datosTransaccion.get(1))
                );
    }

    @Dado("^quiero ([^\"]*) del usuario ([^\"]*) con clave ([^\"]*)$")
    public void quieroTransarConElUsuarioYClave(String tipoTransaccion, String usuario, String  clave) {
        theActorInTheSpotlight().attemptsTo(
                Seleccionar.opcionDelMenu(tipoTransaccion),
                Autenticarse.conUsuario(usuario).yClave(clave)
        );
    }

    @Cuando("^consulto el saldo de mis cuentas deposito$")
    public void consultoElSaldoDeMisCuentasDeposito() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^Verifico el resultado de la consulta del saldo$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^Verifico el resultado de los siguientes archivos de iSeries$")
    public void verificoElResultadoDeLosSiguientesArchivosDeISeries(List<String> archivosBack) {
        throw new PendingException();
    }
}
