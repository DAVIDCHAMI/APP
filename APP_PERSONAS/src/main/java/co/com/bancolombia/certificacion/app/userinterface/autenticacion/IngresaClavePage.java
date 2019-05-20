package co.com.bancolombia.certificacion.app.userinterface.autenticacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class IngresaClavePage {

    public static final Target DIGITO_UNO_CLAVE = Target.
            the("primer digito clave").
            located(By.xpath("(//android.view.View[@content-des=\"\"])[1]"));

    public static final Target DIGITO_DOS_CLAVE = Target.
            the("segundo digito clave").
            located(By.xpath("(//android.view.View[@content-des=\"\"])[2]"));

    public static final Target DIGITO_TRES_CLAVE = Target.
            the("tercero digito clave").
            located(By.xpath("(//android.view.View[@content-des=\"\"])[3]"));

    public static final Target DIGITO_CUATRO_CLAVE = Target.
            the("cuarto digito clave").
            located(By.xpath("(//android.view.View[@content-des=\"\"])[4]"));

    public static final Target BOTON_CONTINUAR = Target.
            the("boton continuar").
            located(By.xpath("Button_Continue_ATMImage"));



    private IngresaClavePage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
