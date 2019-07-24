package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class PaginaPrincipal {

    private PaginaPrincipal() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }

    public static final Target RECARGAR = Target
            .the("recargar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"RELOAD\"]"));


    public static final Target CARGA = Target
            .the("Carga")
            .located(By.xpath("//android.view.View[@content-desc=\"LOADING\"]"));
}
