package co.com.bancolombia.certificacion.app.userinterface.pages.consulta;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class PaginaConsultarMisProductos {

    /**
     * Constante TITULO
     */
    public static final Target TITULO = Target
            .the("Titulo 'Consultar mis productos'")
            .located( By.id("b4-SubtitleGreyBold"));


    public static final Target CUENTAS_DEPOSITO_CATEGORIA = Target
            .the("Categoria Cuentas")
            .located( By.id("b12-VerticalAlign"));




    private PaginaConsultarMisProductos() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
