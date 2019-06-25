package co.com.bancolombia.certificacion.manualtest.runners.consulta.movimientos;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consulta/movimientos/trn0464_consulta_movimientos_cuentas_deposito.feature",
        glue = "co.com.bancolombia.certificacion.manualtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class Trn0464ConsultaMovimientosCuentasDepositoRunner {
}
