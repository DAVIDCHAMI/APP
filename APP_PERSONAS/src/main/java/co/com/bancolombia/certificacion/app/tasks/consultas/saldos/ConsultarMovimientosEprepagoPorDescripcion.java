package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.interactions.eprepago.GuardarMovimientos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarMovimientosEprepagoPorDescripcion implements Task {
    private String descripcionMovimientos;
    private String tipoCuenta;
    private String numeroCuenta;

    public ConsultarMovimientosEprepagoPorDescripcion(String descripcionMovimientos, String tipoCuenta, String numeroCuenta) {
        this.descripcionMovimientos = descripcionMovimientos;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(EPREPAGO.getCategoria()),
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_EPREPAGO),
                Validar.carga(),
                WaitUntil.the(BTN_MOVIMIENTO, isVisible()),
                Click.on(BTN_MOVIMIENTO),
                WaitUntil.the(BTN_FILTRO_BUSQUEDA_MOVIMIENTO, isVisible()),
                Click.on(BTN_FILTRO_BUSQUEDA_MOVIMIENTO),
                Click.on(BTN_LIMPIAR_CAMPOS),
                Enter.theValue(descripcionMovimientos).into(TXT_DESCRIPCION),
                Click.on(FOCO_MOVIMIENTOS),
                Click.on(BTN_BUSCAR_MOVIMIENTO),
                GuardarMovimientos.deEprepago()
        );
    }
}