package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_MENU_PRINCIPAL;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.MIS_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.PERFIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarCategoria implements Interaction {
    private String categoria;

    public SeleccionarCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of("Cuentas")),
                //WaitUntil.the(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria), isVisible()),
                //WaitUntil.the(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria), isEnabled()),
                ScrollHasta.elTarget(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria)),
                Click.on(OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(categoria))
        );
    }

    public static SeleccionarCategoria deSaldosMovimientos(String categoria) {
        return instrumented(SeleccionarCategoria.class, categoria);
    }
}
