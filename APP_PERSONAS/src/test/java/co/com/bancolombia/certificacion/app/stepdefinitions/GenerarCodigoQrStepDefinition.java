package co.com.bancolombia.certificacion.app.stepdefinitions;

import co.com.bancolombia.certificacion.app.questions.VerificarGeneracion;
import co.com.bancolombia.certificacion.app.questions.VerificarGuardado;
import co.com.bancolombia.certificacion.app.tasks.GenerarCodigo;
import cucumber.api.java.es.Cuando;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerarCodigoQrStepDefinition {

    @Cuando("^quiere generar un codigo QR sin valor con nombre (.*)$")
    public void generarCodigoQrSinValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigo.qr(con().conTipoCuenta(datos).conNumeroCuenta(datos).conDescripcion(datos), nombrePersonalizado)
        );
    }

    @Cuando("^quiere generar un codigo QR con valor con nombre (.*)$")
    public void generarCodigooQrConValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigo.qr(con().conTipoCuenta(datos).conNumeroCuenta(datos).conMonto(datos).conDescripcion(datos), nombrePersonalizado)
        );
    }

    @Cuando("^el deberia de ver un mensaje de confirmación y el código QR$")
    public void deberiaVerMensajeConfirmacionCodigoQr() {
        theActorInTheSpotlight().should(
                seeThat(VerificarGuardado.exitoso()),
                seeThat(VerificarGeneracion.qr())
        );
    }
}
