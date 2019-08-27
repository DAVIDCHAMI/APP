package co.com.bancolombia.certificacion.app.stepdefinitions.codigoqr;

import co.com.bancolombia.certificacion.app.questions.codigoqr.VerificarGeneracion;
import co.com.bancolombia.certificacion.app.questions.codigoqr.VerificarGuardado;
import co.com.bancolombia.certificacion.app.tasks.codigoqr.GenerarCodigoQr;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenerarCodigoQrStepDefinition {

    @Cuando("^quiere generar un codigo QR sin valor$")
    public void generarCodigoQrSinValor(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.conInicioSesion(con().conTipoCuentaOrigen(datos).conNumeroCuentaOrigen(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR con valor$")
    public void generarCodigoQrConValor(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.conInicioSesion(con().conTipoCuentaOrigen(datos).conNumeroCuentaOrigen(datos).conMonto(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR con valor sin iniciar sesión con nombre (.*)$")
    public void generarCodigoQrSinIniciarSesionConValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.sinInciarSesion(nombrePersonalizado, con().conTipoCuentaOrigen(datos).conNumeroCuentaOrigen(datos).conMonto(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR sin valor sin iniciar sesión con nombre (.*)$")
    public void generarCodigoQrSinIniciarSesionSinValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.sinInciarSesion(nombrePersonalizado, con().conTipoCuentaOrigen(datos).conNumeroCuentaOrigen(datos).conDescripcion(datos))
        );
    }

    @Entonces("^el deberia de ver un mensaje de confirmacion y el codigo QR$")
    public void deberiaVerMensajeConfirmacionCodigoQr() {
        theActorInTheSpotlight().should(
                seeThat(VerificarGuardado.exitoso()),
                seeThat(VerificarGeneracion.qr())
        );
    }
}
