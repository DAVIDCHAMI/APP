package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.PaginaPrincipal.CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Seleccionar implements Task {

    private String tipoTransaccion;

    public Seleccionar(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }


    public static Seleccionar opcionDelMenu(String tipoTransaccion) {

        return instrumented(Seleccionar.class,tipoTransaccion);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

            TipoTransaccion transaccion = TipoTransaccion.getTransaccion(this.tipoTransaccion);

            actor.attemptsTo(
                    WaitUntil.the(CARGA, isNotVisible())
            );
         transaccion.getMenu().resolveFor(actor).click();
         transaccion.getSubmenu().resolveFor(actor).click();

       }
}
