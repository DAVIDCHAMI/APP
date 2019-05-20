package co.com.bancolombia.certificacion.app.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

/**
 * The type  PaginaMenuInferior
 */
public class PaginaMenuInferior {

    /**
     * Constante HOME
     */
    public static final Target HOME = Target
            .the("Opcion 'Home'")
            .located(By.id("b10-Link_Home_BottomBar2"));
    /**
     * Constante MIS_PRODUCTOS
     */
    public static final Target MIS_PRODUCTOS = Target
            .the("Opcion 'Mis productos'")
            .located(By.id("b13-Link_MyProducts_BottomBar"));

    /**
     * Constante BILLETERA
     */
    public static final Target BILLETERA = Target
            .the("Opcion 'Billetera'")
            .located(By.id("b13-Link_Wallet_BottomBar"));

    /**
     * Constante SOLICITA_PRODUCTOS
     */
    public static final Target SOLICITA_PRODUCTOS = Target
            .the("Opcion 'Solicita productos'")
            .located(By.id("b13-Link_Requests_BottomBar"));

    /**
     * Constante PERFIL
     */
    public static final Target PERFIL = Target
            .the("Opcion 'Perfil'")
            .located(By.id("b13-Link_Profile_BottomBar"));

    private PaginaMenuInferior() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}