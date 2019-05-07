package co.com.bancolombia.certificacion.app.runners.autenticacion;


import co.com.bancolombia.certificacion.app.utilities.RunnerPersonalizado;
import co.com.bancolombia.certificacion.app.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.certificacion.app.utilities.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_RUNNER;

/**
 * The type Runner.
 */
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/autenticacion/Trn0369Autenticacion.feature"},
      //  tags = {"@CasoExitoso"},
        glue = {"co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion"},
        snippets = SnippetType.CAMELCASE
)
public class AutenticacionRunner {

    private AutenticacionRunner(){
        throw new IllegalStateException(CLASE_RUNNER);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/autenticacion/Trn0369Autenticacion.feature");
    }
 }


