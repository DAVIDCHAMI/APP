package co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class IngresaUsuarioPage {

    public static final Target TEXTO_INGRESA_USUARIO = Target.
            the("campo ingresa el usuario").
            located(By.id("Input_Username_UserAuth"));

    public static final Target BOTON_CONTINUAR = Target.
            the("boton continuar")
            .located(By.id("Button_Continue_UserAuth"));


    private IngresaUsuarioPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}

