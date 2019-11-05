package co.com.bancolombia.certificacion.app.runners.rutacritica.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.customrunner.RunnerPersonalizado;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.BeforeSuite;
import co.com.bancolombia.certificacion.app.utilidades.datosexcel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_RUNNER;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/features/eprepago/solicitar_tarjeta_virtual_eprepago.feature"},
        glue = {"co.com.bancolombia.certificacion.app.stepdefinitions"},
        tags = "@RutaCritica",
        snippets = SnippetType.CAMELCASE)
public class SolicitarTarjetaVirtualEprepagoRunner {

    public SolicitarTarjetaVirtualEprepagoRunner() {
        throw new IllegalStateException(CLASE_RUNNER);
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/eprepago/solicitar_tarjeta_virtual_eprepago.feature");
    }
}