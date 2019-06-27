package co.com.bancolombia.certificacion.app.runners.consultas.saldo;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion/prueba.feature",
        glue = "co.com.bancolombia.certificacion.app.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AbrirOspRunner {
}
