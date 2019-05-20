package co.com.bancolombia.certificacion.app.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class PaginaPrincipal {

    public static final Target ENCABEZADO_HOME = Target
            .the("encabezado")
            .located(By.id("b2-header"));

       public static final Target LOADING = Target
            .the("carga")
            .located(By.xpath("//android.view.View[@content-desc=\"LOADING\"]"));


    private PaginaPrincipal() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
