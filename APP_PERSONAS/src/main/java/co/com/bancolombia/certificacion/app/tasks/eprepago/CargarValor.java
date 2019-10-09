package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.eprepago.SeleccionarOpcion;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_PRODUCTO_ORIGEN;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_PRODUCTO_ORIGEN_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.TXT_VALOR_RECARGA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitarEprepagoPage.LBL_EPREPAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CargarValor implements Task {
    private List<Map<String, String>> datos;

    public CargarValor(List<Map<String, String>> datos){this.datos = datos;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(LBL_EPREPAGO.resolveFor(actor).getText()),
                SeleccionarOpcion.deSubmenu(datos.get(0).get("opcionSubmenu")),
                Check.whether(Verificar.elementoVisible(actor, LBL_PRODUCTO_ORIGEN_EPREPAGO))
                        .andIfSo(
                                RealizarScroll.hastaPosicionDeTarget(BTN_PRODUCTO_ORIGEN.of(datos.get(0).get("tipoCuenta"), datos.get(0).get("numeroCuenta"))),
                                Click.on(BTN_PRODUCTO_ORIGEN.of(datos.get(0).get("tipoCuenta"), datos.get(0).get("numeroCuenta")))
                        ),
                Enter.theValue(datos.get(0).get("valorRecarga")).into(TXT_VALOR_RECARGA),
                WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
                Click.on(LNK_SIGUIENTE)
        );
    }

    public static CargarValor sobreElValorMaximo(List<Map<String, String>> datos){
        return instrumented(CargarValor.class, datos);
    }
}