package co.com.bancolombia.certificacion.app.interactions.avancetarjetacredito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscojerProducto implements Interaction {
    
    private String datos;
    private Target elemento;

    public EscojerProducto(Target elemento, String datos){
        this.elemento=elemento;
        this.datos=datos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(elemento.of(datos)));
    }
    public static EscojerProducto deAvanceTarjetaCredito(Target elemento, String datos) {
        return instrumented(EscojerProducto.class, elemento, datos);
    }
}
