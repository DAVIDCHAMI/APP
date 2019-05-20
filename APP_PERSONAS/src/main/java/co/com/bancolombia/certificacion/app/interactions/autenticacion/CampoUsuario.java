package co.com.bancolombia.certificacion.app.interactions.autenticacion;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static co.com.bancolombia.certificacion.app.userinterface.autenticacion.IngresaUsuarioPage.BOTON_CONTINUAR;
import static co.com.bancolombia.certificacion.app.userinterface.autenticacion.IngresaUsuarioPage.TEXTO_INGRESA_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CampoUsuario  implements Interaction {

    @Override
    @Step("{0} llena el campo del usaurio y da clic en el boton continuar ")
    public <T extends Actor> void performAs(T actor) {

        Usuario usuario = EntidadUsuarioActual.getUsuario();
        if (TEXTO_INGRESA_USUARIO.resolveFor(actor).isVisible()) {
            TEXTO_INGRESA_USUARIO.resolveFor(actor).type(usuario.getNombreUsuario());
        }

        if (BOTON_CONTINUAR.resolveFor(actor).isVisible()) {
            BOTON_CONTINUAR.resolveFor(actor).click();
        }
    }

    public static CampoUsuario ingresarUsuario() {
        return instrumented(CampoUsuario.class);
    }


}
