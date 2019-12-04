package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.interactions.avancetarjetacredito.EscojerProducto;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class HacerAvanceEnviarDinero implements Task {

    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;

    public HacerAvanceEnviarDinero(String tipoAvance, TarjetaCredito tarjetaCredito) {
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito = tarjetaCredito;
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
        actor.attemptsTo( Check.whether("envia dinero".equals(tipoAvance)).andIfSo(
                Click.on(BTN_MIS_PRODUCTOS),
                EscojerProducto.deAvanceTarjetaCredito(LISTADO_TARJETAS_DESTINO_AVANCE,tarjetaCredito.getNumeroTarjetaDestino()),
                Click.on(BTN_REALIZAR_AVANCE)
        ).otherwise(
                Click.on(BTN_REALIZAR_AVANCES)));
    }

    public static HacerAvanceEnviarDinero deTarjetasCredito(String tipoAvance, TarjetaCreditoBuilder tarjetaCredito) {
        return Tasks.instrumented(HacerAvanceEnviarDinero.class, tipoAvance, tarjetaCredito.build());
    }
}