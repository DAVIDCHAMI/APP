package co.com.bancolombia.certificacion.app.interactions.consultas.movimientos;

import co.com.bancolombia.certificacion.app.interactions.eprepago.GuardarMovimientos;
import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.MovimientoBuilder.movimiento;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.LBL_SALDO_MOVIMIENTO_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.obtenerIteradorEprepago;

public class GuardarMovimientosGeneral implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Movimiento> listaMovimiento = new ArrayList<>();

        int cantidadMovimientos = CONTENEDOR_MOVIMIENTOS_EPREPAGO.resolveAllFor(actor).size();

        for (int iterador = 1; iterador <= cantidadMovimientos; iterador++) {
            listaMovimiento.add(movimiento()
                    .conFecha(LBL_FECHA_MOVIMIENTO_EPREPAGO.of(String.valueOf(obtenerIteradorEprepago(iterador))).resolveFor(actor).getText())
                    .conDescripcion(LBL_DESCRIPCION_MOVIMIENTO_EPREPAGO.of(String.valueOf(obtenerIteradorEprepago(iterador))).resolveFor(actor).getText())
                    .conValorMovimiento(LBL_SALDO_MOVIMIENTO_EPREPAGO.of(String.valueOf(obtenerIteradorEprepago(iterador))).resolveFor(actor).getText()).build()
            );
        }

    }

    public static GuardarMovimientosGeneral delProducto() {
        return new GuardarMovimientosGeneral();
    }
}
