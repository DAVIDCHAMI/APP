package co.com.bancolombia.certificacion.app.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

public class PaginaMenuMisProductos {


    public static final Target CONSULTAR_MIS_PRODUCTOS = Target.
            the("Opcion 'Consultar mis productos'").
            //located(By.id("ListItem1"));
            located(By.xpath("//android.view.View[@content-desc=\"Consultar mis productos\"]"));

    public static final Target ENVIAR_DINERO = Target.
            the("Opcion ' Enviar dinero'").
            located(By.id("ListItem2"));


    public static final Target RECIBIR_DINERO = Target.
            the("Opcion ' Recibir dinero'").
            located(By.id("ListItem3"));


    public static final Target PAGAR_TARJETAS_Y_CREDITOS = Target.
            the("Opcion ' Pagar tarjetas y creditos'").
            located(By.id("ListItem4"));

    public static final Target REALIZAR_AVANCES = Target.
            the("Opcion ' Realizar avances'").
            located(By.id("ListItem5"));

    public static final Target INSCRIBIR_PRODUCTOS =  Target.
            the("Opcion ' Inscribir productos'").
            located(By.id("ListItem6"));

    public static final Target CONSULTAR_PUNTOS_COLOMBIA = Target.
            the("Opcion ' Consultar puntos colombia'").
            located(By.id("ListItem7"));

    private PaginaMenuMisProductos() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}