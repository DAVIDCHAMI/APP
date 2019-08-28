package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.MovimientoBuilder.movimiento;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TARJETAS_CREDITO_MOVIMIENTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_LISTA_MOVIMIENTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarMovimientosTarjetas extends Movimientos{
    private String tipoCuenta;
    private String numeroCuenta;

    public ConsultarMovimientosTarjetas(String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(TARJETAS_CREDITO_MOVIMIENTOS),
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_TARJETA_CREDITO),
                WaitUntil.the(BTN_MOVIMIENTO, isVisible()),
                Click.on(BTN_MOVIMIENTO)
        );
        List<Movimiento> listaMovimiento = new ArrayList<>();
        int iterador = 0;
        while (Visibility.of(CONTENEDOR_MOVIMIENTOS_TARJETA.of(String.valueOf(iterador))).viewedBy(actor).asBoolean()) {
            listaMovimiento.add(movimiento().
                    conFecha(LBL_FECHA_MOVIMIENTO_TARJETA_CREDITO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conDescripcion(LBL_DESCRIPCION_MOVIMIENTO_TARJETA_CREDITO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conValorMovimiento(LBL_SALDO_MOVIMIENTO_TARJETA_CREDITO.of(String.valueOf(iterador)).resolveFor(actor).getText()).build()
            );
            iterador++;
        }
        actor.remember(MODELO_LISTA_MOVIMIENTOS, listaMovimiento);
    }
}