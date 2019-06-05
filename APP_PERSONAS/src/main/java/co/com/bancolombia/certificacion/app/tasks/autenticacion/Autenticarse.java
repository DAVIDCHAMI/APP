package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.exceptions.InicioError;
import co.com.bancolombia.certificacion.app.interactions.autenticacion.Inserta;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.questions.autenticacion.MensajeInicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.certificacion.app.exceptions.InicioError.MENSAJE_AUTENTICACION_FALLIDA;
import static co.com.bancolombia.certificacion.app.userinterface.autenticacion.IngresaClavePage.BOTON_CONTINUAR_AUTENTICACION;
import static co.com.bancolombia.certificacion.app.userinterface.autenticacion.IngresaUsuarioPage.BOTON_CONTINUAR;
import static co.com.bancolombia.certificacion.app.userinterface.autenticacion.IngresaUsuarioPage.TEXTO_INGRESA_USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Autenticarse implements Task {

        private String usuario;
        private String clave;

        public Autenticarse(AutenticarseBuilder datosAutenticacion) {

            this.usuario = datosAutenticacion.getUsuario();
            this.clave = datosAutenticacion.getClave();
        }

        public static AutenticarseBuilder conUsuario(String usuario) {

           return new AutenticarseBuilder(usuario);

        }

         @Override
        public <T extends Actor> void performAs(T actor) {

            EntidadUsuarioActual.setUsuarioYClave(usuario,clave);

            actor.attemptsTo(
                    Enter.theValue(usuario).into(TEXTO_INGRESA_USUARIO).thenHit(Keys.TAB),
                    Click.on(BOTON_CONTINUAR),
                    WaitUntil.the(BOTON_CONTINUAR, isNotVisible()),
                    Inserta.primeraClave(clave),
                    Click.on(BOTON_CONTINUAR_AUTENTICACION)
            );
        }
}

