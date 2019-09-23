package co.com.bancolombia.certificacion.app.tasks.registro;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.models.builders.InscripcionBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Inscripcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionProductoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InscribirProductos implements Task {
    private Inscripcion inscripcion;

    public InscribirProductos(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NUMERO_PRODUCTO, isVisible()),
                Enter.theValue(inscripcion.getProducto().getNumero()).into(TXT_NUMERO_PRODUCTO),
                WaitUntil.the(TXT_BUSCAR_NOMBRE_BANCO, isVisible()),
                Click.on(TXT_BANCO),
                Enter.theValue(inscripcion.getNombreBanco()).into(TXT_BUSCAR_NOMBRE_BANCO),
                Click.on(ITEM_NOMBRE_BANCO.of(inscripcion.getNombreBanco().toLowerCase())),
                Click.on(CHK_TIPO_CUENTA.of(inscripcion.getProducto().getTipo())),
                Click.on(BTN_SIGUIENTE),
                Enter.theValue(inscripcion.getUsuario().getNumeroDocumento()).into(TXT_NUMERO_DOCUMENTO),
                Click.on(TXT_TIPO_DOCUMENTO),
                WaitUntil.the(ITEM_TIPO_DOCUMENTO.of(inscripcion.getUsuario().getTipoDocumento().trim()), isVisible()),
                Click.on(ITEM_TIPO_DOCUMENTO.of(inscripcion.getUsuario().getTipoDocumento().trim())),
                Click.on(BTN_SIGUIENTE),
                Click.on(BTN_INSCRIBIR),
                Esperar.unTiempo(10000)
        );
        actor.remember(NUMERO_CUENTA, inscripcion.getProducto().getNumero());
        actor.remember(TIPO_CUENTA, inscripcion.getProducto().getTipo());
        actor.remember(NOMBRE_BANCO, inscripcion.getNombreBanco());
        actor.remember(TIPO_DOCUMENTO, inscripcion.getUsuario().getTipoDocumento());
        actor.remember(NUMERO_DOCUMENTO, inscripcion.getUsuario().getNumeroDocumento());
    }

    public static InscribirProductos conInformacion(InscripcionBuilder inscripcionBuilder) {
        return instrumented(InscribirProductos.class, inscripcionBuilder.build());
    }
}