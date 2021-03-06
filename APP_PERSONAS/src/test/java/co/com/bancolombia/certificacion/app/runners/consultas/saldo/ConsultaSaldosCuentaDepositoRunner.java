package co.com.bancolombia.certificacion.app.runners.consultas.saldo;

import co.com.bancolombia.certificacion.app.utilidades.RunnerPersonalizado;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.BeforeSuite;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_RUNNER;

/**
 * The type Runner.
 */
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/consultas/saldo/Trn1756_consulta_saldos_consolidados.feature"},
        glue = {"co.com.bancolombia.certificacion.app.stepdefinitions.consultas",
        "co.com.bancolombia.certificacion.app.stepdefinitions.comunes"},
        snippets = SnippetType.CAMELCASE
)
public class ConsultaSaldosCuentaDepositoRunner {

    private ConsultaSaldosCuentaDepositoRunner(){
        throw new IllegalStateException(CLASE_RUNNER);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/consultas/saldo/Trn1756_consulta_saldos_consolidados.feature");
    }
}
