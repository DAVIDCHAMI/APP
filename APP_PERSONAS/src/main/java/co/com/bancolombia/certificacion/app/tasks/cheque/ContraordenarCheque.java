package co.com.bancolombia.certificacion.app.tasks.cheque;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.models.builders.ChequeBuilder;
import co.com.bancolombia.certificacion.app.models.cheque.Cheque;
import co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CHEQUE;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContraordenarCheque implements Task {
  private Cheque cheque;

   public ContraordenarCheque(Cheque cheque){
       this.cheque=cheque;
   }
    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                SeleccionarProducto.desdeSaldosMovimientos(cheque.getProducto().getTipo(), cheque.getProducto().getNumero(), OPT_CUENTA_ASOCIADA),
                WaitUntil.the(CHK_CHEQUE.of(cheque.getTipoContraordenacion()), isVisible()),
                Click.on(CHK_CHEQUE.of(cheque.getTipoContraordenacion())),
               Enter.theValue(cheque.getNumeroCheque()).into(TXT_NUMERO_CHEQUE),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_CONTRAORDENAR)
        );
         actor.remember(NUMERO_CUENTA,cheque.getProducto().getNumero());
         actor.remember(NUMERO_CHEQUE,cheque.getNumeroCheque());
    }

    public static ContraordenarCheque conInfo(ChequeBuilder chequeBuilder){
        return Tasks.instrumented(ContraordenarCheque.class,chequeBuilder.build());
    }
}