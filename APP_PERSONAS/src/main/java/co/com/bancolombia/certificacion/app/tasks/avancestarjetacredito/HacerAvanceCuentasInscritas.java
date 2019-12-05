package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.interactions.avancetarjetacredito.EscojerProducto;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class HacerAvanceCuentasInscritas implements Task {
    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;
    private String numeroTarjeta= tarjetaCredito.getNumeroTarjeta();

    public HacerAvanceCuentasInscritas(TarjetaCredito tarjetaCredito, String tipoAvance){
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito =tarjetaCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether("envia dinero".equals(tipoAvance)).andIfSo(
                        Click.on(BTN_TARJETA_CREDITO)
                ).otherwise(
                        Click.on(BTN_REALIZAR_AVANCES)
                ),
                WaitUntil.the(BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO.of(tarjetaCredito.getNumeroTarjeta()), isPresent()),
                EscojerProducto.deAvanceTarjetaCredito(BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO, tarjetaCredito.getNumeroTarjeta()),
                Enter.theValue(tarjetaCredito.getCodigoSeguridad()).into(TXT_CODIGO_SEGURIDAD),
                Click.on(BTN_SIGUIENTE),
                Enter.theValue(tarjetaCredito.getMontoAvance()).into(TXT_MONTO_AVANCE),
                Click.on(BOTON_SIGUIENTE_AVANCE)
        );
        actor.attemptsTo(
                Click.on(BTN_CUENTAS_INSCRITAS),
                EscojerProducto.deAvanceTarjetaCredito(LISTADO_TARJETAS_DESTINO_AVANCE,tarjetaCredito.getNumeroTarjetaDestino()),
                Click.on(BTN_REALIZAR_AVANCE));
    }

    public static HacerAvanceCuentasInscritas deTarjetasCredito(TarjetaCreditoBuilder datosExcel, String tipoAvance){
        return instrumented(HacerAvanceCuentasInscritas.class,datosExcel.build(), tipoAvance);
    }
}
