package co.com.bancolombia.certificacion.manualtest.runners.pagos;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pagos/trn0529_0429_pagos_tarjeta_credito_propia_no_propia.feature",
        glue = "co.com.bancolombia.certificacion.manualtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Trn0529_0429PagosTarjetaCreditoPropiaNoPropiaRunner {
}
