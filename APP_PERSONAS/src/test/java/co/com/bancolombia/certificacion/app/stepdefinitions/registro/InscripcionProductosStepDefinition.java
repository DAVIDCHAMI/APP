package co.com.bancolombia.certificacion.app.stepdefinitions.registro;

import co.com.bancolombia.certificacion.app.exceptions.NoSeInscribioProductoException;
import co.com.bancolombia.certificacion.app.questions.registro.VerificarInscripcion;
import co.com.bancolombia.certificacion.app.tasks.registro.InscribirProductos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.NoSeInscribioProductoException.PRODUCTO_NO_INSCRITO;
import static co.com.bancolombia.certificacion.app.models.builders.InscripcionBuilder.inscripcionProductos;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionProductosStepDefinition {

    @Cuando("quiero realizar la inscripcion del producto con la información$")
    public void quieroRealizarInscripcionProductosConInformacion(List<String> datos){
        theActorInTheSpotlight().attemptsTo(InscribirProductos.conInformacion(inscripcionProductos(datos)));
    }

    @Entonces("el deberia de ver el detalle del producto registrado$")
    public void deberiaVerDetalleProductoRegistrado(){
        //theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarInscripcion.deProductos()).orComplainWith(NoSeInscribioProductoException.class,PRODUCTO_NO_INSCRITO));
    }
}
