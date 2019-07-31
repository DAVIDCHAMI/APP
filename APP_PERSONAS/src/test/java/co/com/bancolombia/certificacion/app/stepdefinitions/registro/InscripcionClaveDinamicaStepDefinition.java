package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.tasks.registro.InscribirClaveDinamica;
import cucumber.api.java.es.Y;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionClaveDinamicaStepDefinition {
    @Y("gestiona la inscripcion de clave dinámica$")
    public void gestionaInscripcionClaveDinamica(List<String>datos){
        theActorInTheSpotlight().attemptsTo(InscribirClaveDinamica.conDatos(datos));
    }
}
