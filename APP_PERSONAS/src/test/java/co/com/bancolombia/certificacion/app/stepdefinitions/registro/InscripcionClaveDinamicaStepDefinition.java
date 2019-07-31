package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.tasks.registro.InscribirClaveDinamica;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionClaveDinamicaStepDefinition {

    @Y("gestiona la inscripcion de clave dinámica$")
    public void gestionaInscripcionClaveDinamica(List<Map<String,String>>datos){
        theActorInTheSpotlight().attemptsTo(InscribirClaveDinamica.conDatos(usuario()
                .conNombrePersonalizado(datos)
                .conCorreo(datos)
                .conTipoCorreo(datos)
                .conNumeroCelular(datos).
                        conSegundaClave(datos)));
    }
}