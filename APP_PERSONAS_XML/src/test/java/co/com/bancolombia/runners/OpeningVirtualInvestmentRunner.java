package co.com.bancolombia.runners;

import co.com.bancolombia.utilities.exceldata.BeforeSuite;
import co.com.bancolombia.utilities.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/virtualinvestment/Trn0326OpeningInvestment.feature"},
        tags = {"@TestCase1"},
        glue = {"co.com.bancolombia.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class OpeningVirtualInvestmentRunner {

    private OpeningVirtualInvestmentRunner(){}

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/virtualinvestment/Trn0326OpeningInvestment.feature");
    }
}
