package co.com.bancolombia.certificacion.app.interactions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.IngresaClavePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Inserta implements Interaction {

    private  String clave;

    public Inserta(String clave) {
        this.clave = clave;
    }

    public static Inserta primeraClave(String clave) {

        return instrumented(Inserta.class, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        //
        // for (char digito : clave.toCharArray()){

                actor.attemptsTo(
                        Enter.theValue(Character.toString(clave.charAt(0))).into(CLAVE_DIGITO_UNO),
                         Enter.theValue(Character.toString(clave.charAt(1))).into(CLAVE_DIGITO_DOS),
                         Enter.theValue(Character.toString(clave.charAt(2))).into(CLAVE_DIGITO_TRES),
                         Enter.theValue(Character.toString(clave.charAt(3))).into(CLAVE_DIGITO_CUATRO)

                );
        }
}
