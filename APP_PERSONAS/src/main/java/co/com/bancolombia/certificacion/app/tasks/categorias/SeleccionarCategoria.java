package co.com.bancolombia.certificacion.app.tasks.categorias;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.categoriasacordeon.PaginaCategorias.CUENTAS_DEPOSITO;
import static co.com.bancolombia.certificacion.app.userinterface.consulta.PaginaConsultarMisProductos.CUENTAS_DEPOSITO_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCategoria implements Task {


    public static SeleccionarCategoria cuentasDeposito() {
        return instrumented(SeleccionarCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CUENTAS_DEPOSITO_CATEGORIA)

        );
        List<WebElementFacade> webElementFacade = CUENTAS_DEPOSITO.resolveAllFor(actor);
        for (WebElementFacade web: webElementFacade
             ) {
            System.out.println(web.getText());
        }
        System.out.println(webElementFacade.size());
      //  webElementFacade.

    }
}
