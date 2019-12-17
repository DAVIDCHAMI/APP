package co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoriaVistaCarrusel;
import co.com.bancolombia.certificacion.app.utilidades.seleccionarproducto.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;

public class DeCrediagil implements Task {
    private String opcionCategoria;

    public DeCrediagil(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VISTA_CARRUSEL),
                SeleccionarCategoriaVistaCarrusel.deSaldosMovimientos(opcionCategoria)
        );
        actor.attemptsTo(
                SeleccionarProducto.deVistaCarrusel(LBL_SALDO_DISPONIBLE_CREDIAGIL_VISTA_CARRUSEL,LBL_TIPO_CUENTA_CREDIAGIL_VISTA_CARRUSEL,LBL_NUMERO_CUENTA_CREDIAGIL_VISTA_CARRUSEL)
        );
    }
}