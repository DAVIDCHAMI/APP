package co.com.bancolombia.certificacion.app.runners;

import co.com.bancolombia.certificacion.app.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.certificacion.app.utilities.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/virtualinvestment/trn0325_simulate_investment.feature"},
        tags = {"@TestCase1"},
        glue = {"co.com.bancolombia.certificacion.app.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class SimulateVirtualInvestmentRunner {

    private SimulateVirtualInvestmentRunner(){}

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/virtualinvestment/trn0325_simulate_investment.feature");
    }
}
