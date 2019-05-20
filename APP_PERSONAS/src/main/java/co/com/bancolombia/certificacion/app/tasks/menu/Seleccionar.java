package co.com.bancolombia.certificacion.app.tasks.menu;

import co.com.bancolombia.certificacion.app.interactions.Espera;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static co.com.bancolombia.certificacion.app.userinterface.PaginaMenuInferior.MIS_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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

        try {

            if( transaccion.getMenu().resolveFor(actor).withTimeoutOf(40, TimeUnit.SECONDS).isVisible()) {
                System.out.println("OK");

            }else{
                System.out.println("ERROR");
            }
            TimeUnit.SECONDS.sleep(20);

            actor.attemptsTo(

                    Click.on(MIS_PRODUCTOS)

            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
