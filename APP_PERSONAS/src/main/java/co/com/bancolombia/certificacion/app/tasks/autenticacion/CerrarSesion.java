package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.PERFIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(!Visibility.of(OPT_MENU_PRINCIPAL.of(PERFIL)).viewedBy(actor).asBoolean()).
                        andIfSo(
                                Click.on(BTN_VOLVER)),
                Click.on(OPT_MENU_PRINCIPAL.of(PERFIL)),
                ScrollHasta.elTarget(OPT_MENU_PRINCIPAL.of(PERFIL)),
                Click.on(BTN_CERRAR_SESION),
                Click.on(BTN_SI_CERRAR_SESION)
    );
    }

    public static Performable exitosamente() {
        return instrumented(CerrarSesion.class);
    }
}