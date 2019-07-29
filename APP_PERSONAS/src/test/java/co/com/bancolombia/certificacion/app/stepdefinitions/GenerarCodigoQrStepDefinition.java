package co.com.bancolombia.certificacion.app.stepdefinitions;

import co.com.bancolombia.certificacion.app.questions.VerificarGeneracion;
import co.com.bancolombia.certificacion.app.questions.VerificarGuardado;
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
                GenerarCodigoQr.ConInicioSesion(con().conTipoCuenta(datos).conNumeroCuenta(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR con valor$")
    public void generarCodigooQrConValor(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.ConInicioSesion(con().conTipoCuenta(datos).conNumeroCuenta(datos).conMonto(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR con valor sin iniciar sesión con nombre (.*)$")
    public void generarCodigooQrSinIniciarSesionConValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.SinInciarSesion(nombrePersonalizado, con().conTipoCuenta(datos).conNumeroCuenta(datos).conMonto(datos).conDescripcion(datos))
        );
    }

    @Cuando("^quiere generar un codigo QR sin valor sin iniciar sesión con nombre (.*)$")
    public void generarCodigooQrSinIniciarSesionSinValor(String nombrePersonalizado, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                GenerarCodigoQr.SinInciarSesion(nombrePersonalizado, con().conTipoCuenta(datos).conNumeroCuenta(datos).conDescripcion(datos))
        );
    }

    @Entonces("^el deberia de ver un mensaje de confirmación y el código QR$")
    public void deberiaVerMensajeConfirmacionCodigoQr() {
        theActorInTheSpotlight().should(
                seeThat(VerificarGuardado.exitoso()),
                seeThat(VerificarGeneracion.qr())
        );
    }
}
