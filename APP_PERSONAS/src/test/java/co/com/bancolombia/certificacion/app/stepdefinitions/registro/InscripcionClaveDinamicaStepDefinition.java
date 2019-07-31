package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.exceptions.ClaveNoInscrptaCorrectamente;
import co.com.bancolombia.certificacion.app.questions.registro.VerificarInscripcionClaveDinamica;
import co.com.bancolombia.certificacion.app.tasks.registro.InscribirClaveDinamica;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.ClaveNoInscrptaCorrectamente.NO_INCRIBE_CLAVE_DINAMICA;
import static co.com.bancolombia.certificacion.app.models.builders.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionClaveDinamicaStepDefinition {

    @Y("gestiono la inscripcion de clave dinámica$")
    public void gestionaInscripcionClaveDinamica(List<Map<String,String>>datos){
        theActorInTheSpotlight().attemptsTo(InscribirClaveDinamica.conDatos(usuario()
                .conNombrePersonalizado(datos)
                .conCorreo(datos)
                .conTipoCorreo(datos)
                .conNumeroCelular(datos).
                        conSegundaClave(datos)));
    }

    @Entonces("Yo debería ver mis datos registrados en clave dinámica$")
    public void deberiaVerClaveDinamExitosa(){
        theActorInTheSpotlight().should(seeThat(VerificarInscripcionClaveDinamica.exitosa()).orComplainWith(
                ClaveNoInscrptaCorrectamente.class, NO_INCRIBE_CLAVE_DINAMICA
        ));
    }
}