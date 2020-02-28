package co.com.bancolombia.certificacion.app.runners.billetera;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_RUNNER;

import co.com.bancolombia.certificacion.app.utilidades.customrunner.RunnerPersonalizado;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.BeforeSuite;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
    features = {"src/test/resources/features/billetera/pagos_billetera_movil.feature"},
    glue = {"co.com.bancolombia.certificacion.app.stepdefinitions"},
    snippets = SnippetType.CAMELCASE)
public class PagosBilleteraMovil {
  private PagosBilleteraMovil() {
    throw new IllegalStateException(CLASE_RUNNER);
  }

  @BeforeSuite
  public static void test() throws InvalidFormatException, IOException {
    DataToFeature.overrideFeatureFiles(
        "./src/test/resources/features/billetera/pagos_billetera_movil.feature");
  }
}