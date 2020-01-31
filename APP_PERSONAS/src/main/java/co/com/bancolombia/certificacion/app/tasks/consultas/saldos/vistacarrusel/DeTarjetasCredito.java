package co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoriaVistaCarrusel;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductosVistaCarrusel;
import co.com.bancolombia.certificacion.app.utilidades.seleccionarproducto.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;

public class DeTarjetasCredito implements Task {
    private static final Logger LOGGER = LogManager.getLogger(RevisarProductosVistaCarrusel.class);
    private String opcionCategoria;

    public DeTarjetasCredito(String opcionCategoria) {
        this.opcionCategoria = opcionCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(3000),
                Click.on(BTN_VISTA_CARRUSEL),
                SeleccionarCategoriaVistaCarrusel.deSaldosMovimientos(opcionCategoria)
        );
        actor.attemptsTo(
                SeleccionarProducto.deVistaCarrusel(LBL_DEUDA_PESOS_TC_VISTA_CARRUSEL, LBL_TIPO_CUENTA_TC_VISTA_CARRUSEL, LBL_NUMERO_CUENTA_TC_VISTA_CARRUSEL)
        );
    }
}