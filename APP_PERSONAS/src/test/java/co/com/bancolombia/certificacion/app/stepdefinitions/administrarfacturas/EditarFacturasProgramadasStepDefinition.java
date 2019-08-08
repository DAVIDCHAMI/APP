package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

public class EditarFacturasProgramadasStepDefinition {

    @Cuando("el actor modifica sus facturas programadas por la opcion (.*)$")
    public void elActorModificaSusFacturasProgramadas(List<Map<String,String>>datos, String opcion){

    }

    @Entonces("debería ver el mensaje de modificación exitosa$")
    public void deberiaVerMensajeModificacionExitosa(){

    }
}