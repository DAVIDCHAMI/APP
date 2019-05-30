package co.com.bancolombia.runners;

import co.com.bancolombia.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.utilities.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


/**
 * The type Runner.
 */
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/authentication/Trn0369Authentication.feature"},
        tags = {"@CasoExitoso"},
        glue = {"co.com.bancolombia.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class AuthenticationRunner {

    AuthenticationRunner(){}

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/authentication/Trn0369Authentication.feature");
    }
 }


