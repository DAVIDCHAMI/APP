package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.saldo.Saldo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int iterador = 1;
        Producto producto = new Producto();
        Saldo saldo = new Saldo();
        actor.attemptsTo(
                Click.on(BTN_OCULTAR_BANNER)
        );
        while(CONTENEDOR_INFORMACION_PRODUCTO.of(iterador).resolveFor(actor).isPresent){
            producto.setTipo(LBL_TIPO_CUENTA.resolveFor(actor).getText());
            producto.setNumero(LBL_NUMERO_CUENTA.resolveFor(actor).getText());
            saldo.setSaldoTotal(Double.parseDouble(LBL_SALDO_DISPONIBLE.resolveFor(actor).getText()));
            producto.setSaldo(saldo.getSaldo());
        }
    }

    public static Performable deProductos() {
        return instrumented(GuardarDatos.class);
    }

}
