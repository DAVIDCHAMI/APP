package co.com.bancolombia.certificacion.app.stepdefinitions.billetera;

import static co.com.bancolombia.certificacion.app.models.builders.ConfiguracionTransaccionBuilder.informacion;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.bancolombia.certificacion.app.tasks.autenticacion.IniciarSesion;
import cucumber.api.java.es.Dado;
import java.util.List;
import java.util.Map;

public class ListarTarjetasBilleteraStepDefinition {

  @Dado("^que el (.*) se autentica en la app Billetera$")
  public void autenticacionAppBilleteraInt(String actor, List<Map<String, String>> datos) {
    theActorCalled(actor).wasAbleTo(IniciarSesion.enBilletera(informacion().deTransaccion(datos)));
  }
}
