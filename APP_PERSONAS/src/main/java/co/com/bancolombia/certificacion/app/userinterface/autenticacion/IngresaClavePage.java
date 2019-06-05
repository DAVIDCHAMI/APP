package co.com.bancolombia.certificacion.app.userinterface.autenticacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class IngresaClavePage {

    public static final Target DIGITO_CLAVE = Target.
            the("digito para clave").
            locatedBy("#b12-Key{0}");

    public static final Target DIGITO_CLAVE_UNO = Target.
            the("digito para clave").
            located(By.id("b12-KEY1"));

    public static final Target CLAVE_DIGITO_UNO = Target.
            the("digito para clave 1").
            located(By.id("Input_TextVar"));

    public static final Target CLAVE_DIGITO_DOS = Target.
            the("digito para clave 2").
            located(By.id("Input_TextVar2"));

    public static final Target CLAVE_DIGITO_TRES = Target.
            the("digito para clave 3").
            located(By.id("Input_TextVar3"));

    public static final Target CLAVE_DIGITO_CUATRO = Target.
            the("digito para clave 4").
            located(By.id("Input_TextVar4"));


    public static final Target BOTON_CONTINUAR_AUTENTICACION = Target.
            the("boton continuar").
            located(By.id("Button_Continue_ATMImage"));



    private IngresaClavePage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
