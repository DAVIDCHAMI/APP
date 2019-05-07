
package co.com.bancolombia.certificacion.manualtest.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static co.com.bancolombia.certification.manualtestlib.ManualTest.validate;

public class ManualTestDefinitions {
    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTestDefinitions(String step){
        validate(step, scenario.getName());
    }
}
