package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Crediagil;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoProductosEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.bancolombia.certificacion.app.models.builders.CrediagilBuilder.crediagil;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.eliminarTildes;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RevisarSaldos implements Task {
    private String opcionCategoria;
    private TipoProductosEnum tipoProductosEnum;

    public RevisarSaldos(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
        this.tipoProductosEnum = TipoProductosEnum.valueOf(eliminarTildes(opcionCategoria));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean tieneProducto;
        String crediagilCupo = tipoProductosEnum.getTipoProducto();
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(opcionCategoria)
        );
        if(LBL_SALDO_CREDIAGIL_SALDOS_MOVIMIENTOS.of(crediagilCupo).resolveFor(actor).isVisible()) {
            tieneProducto = true;
        } else {
            tieneProducto = false;
        }
        Crediagil crediagil = crediagil().deTipo(opcionCategoria)
                .conCupoDisponible(LBL_SALDO_CREDIAGIL_SALDOS_MOVIMIENTOS.of(crediagilCupo).resolveFor(actor).getText())
                .build();
        actor.remember(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS, crediagil);
        actor.remember(TIENE_PRODUCTOS, tieneProducto);
    }

    public static Performable deCrediagil(String opcionCategoria) {
        return instrumented(RevisarSaldos.class, opcionCategoria);
    }
}
