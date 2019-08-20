package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.autenticacion.CerrarTip;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.MovimientoBuilder.movimiento;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_LISTA_MOVIMIENTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarMovimientos implements Task {
    private String tipoCuenta;
    private String numeroCuenta;

    public ConsultarMovimientos(String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CerrarTip.alIniciarApp(),
                RealizarScroll.hastaPosicionDeTarget(CUENTA_ESPECIFICA_PRODUCTO.of(tipoCuenta, numeroCuenta)),
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, numeroCuenta, CUENTA_ESPECIFICA_PRODUCTO)
        );
        List<Movimiento> listaMovimiento = new ArrayList<>();
        int iterador = 0;
        while (CONTENEDOR_MOVIMIENTOS.of(String.valueOf(iterador)).resolveFor(actor).isVisible()) {
            listaMovimiento.add(movimiento().
                    conFecha(LBL_FECHA_MOVIMIENTO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conDescripcion(LBL_DESCRIPCION_MOVIMIENTO.of(String.valueOf(iterador)).resolveFor(actor).getText())
                    .conValorMovimiento(LBL_SALDO_MOVIMIENTO.of(String.valueOf(iterador)).resolveFor(actor).getText()).build()
            );
            iterador++;
        }
        actor.remember(MODELO_LISTA_MOVIMIENTOS, listaMovimiento);
    }

    public static ConsultarMovimientos conInformacion(String tipoCuenta, String numeroCuenta) {
        return instrumented(ConsultarMovimientos.class, tipoCuenta, numeroCuenta);
    }
}