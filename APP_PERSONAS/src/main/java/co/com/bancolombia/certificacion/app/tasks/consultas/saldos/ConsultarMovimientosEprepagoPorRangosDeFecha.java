package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarMovimientosEprepagoPorRangosDeFecha implements Task {
    private String rangoFechas;
    private String tipoCuenta;
    private String numeroCuenta;

    public ConsultarMovimientosEprepagoPorRangosDeFecha(String rangoFechas, String tipoCuenta, String numeroCuenta) {
        this.rangoFechas = rangoFechas;
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
                WaitUntil.the(TXT_RANGO_FECHAS, isEnabled()),
                Type.theValue(rangoFechas).into(TXT_RANGO_FECHAS),
                Click.on(FOCO_MOVIMIENTOS)
        );
    }
}