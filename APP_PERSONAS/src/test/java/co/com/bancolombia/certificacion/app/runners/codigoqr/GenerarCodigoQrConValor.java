package co.com.bancolombia.certificacion.app.runners.codigoqr;

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
    features = {"src/test/resources/features/codigoqr/generar_codigo_qr_con_valor.feature"},
    glue = {"co.com.bancolombia.certificacion.app.stepdefinitions"},
    snippets = SnippetType.CAMELCASE)
public class GenerarCodigoQrConValor {
  public GenerarCodigoQrConValor() {
    throw new IllegalStateException(CLASE_RUNNER);
  }

  @BeforeSuite
  public static void test() throws InvalidFormatException, IOException {
    DataToFeature.overrideFeatureFiles(
        "./src/test/resources/features/codigoqr/generar_codigo_qr_con_valor.feature");
  }
}