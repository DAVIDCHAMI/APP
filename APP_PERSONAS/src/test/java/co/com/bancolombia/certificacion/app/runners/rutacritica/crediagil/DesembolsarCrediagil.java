package co.com.bancolombia.certificacion.app.runners.rutacritica.crediagil;

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
    features = {"src/test/resources/features/crediagil/desembolso_crediagil.feature"},
    glue = {"co.com.bancolombia.certificacion.app.stepdefinitions"},
    tags = "@RutaCritica",
    snippets = SnippetType.CAMELCASE)
public class DesembolsarCrediagil {

  private DesembolsarCrediagil() {}

  @BeforeSuite
  public static void test() throws InvalidFormatException, IOException {
    DataToFeature.overrideFeatureFiles(
        "./src/test/resources/features/crediagil/desembolso_crediagil.feature");
  }
}
