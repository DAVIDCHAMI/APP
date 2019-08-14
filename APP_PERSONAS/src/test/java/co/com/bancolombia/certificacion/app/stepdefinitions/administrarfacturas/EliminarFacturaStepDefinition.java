package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.exceptions.EliminacionFacturasException;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarEliminacionFactura;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.AdministrarFactura;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.EliminacionFacturasException.MENSAJE_ELIMINACION;
import static co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder.programarFactura;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarFacturaStepDefinition {

    @Cuando("el actor elimina sus factura inscritica con la información con opción (.*)$")
    public void eliminaSusFacturasInscritas(String opcion,List<Map<String,String>>datos){
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionELiminar(
                programarFactura().conValor(datos)
                        .conFechaInicioFin(datos)
                        .conDescripcionFactura(datos),
                opcion
                )
        );
    }

    @Entonces("debería ver el mensaje de eliminación exitosa$")
    public void mensajeEliminaciónExitosa(){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarEliminacionFactura.inscritas()).orComplainWith(EliminacionFacturasException.class,MENSAJE_ELIMINACION));
    }
}