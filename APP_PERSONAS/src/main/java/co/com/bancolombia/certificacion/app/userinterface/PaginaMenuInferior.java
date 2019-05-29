package co.com.bancolombia.certificacion.app.userinterface;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;

/**
 * The type  PaginaMenuInferior
 */
public class PaginaMenuInferior extends PageObject {


        public PaginaMenuInferior(WebDriver webDriver){
            super(webDriver);
        }

        @AndroidFindBy(id="b13-Link_MyProducts_BottomBar")
        @iOSFindBy(id="walletTabButton")
        public static WebElementFacade MIS_PRODUCTOS;

    /**
     * Constante HOME
     */
    public static final Target HOME = Target
            .the("Opcion 'Home'")
            .located(By.id("b10-Link_Home_BottomBar2"));
    /**
     * Constante MIS_PRODUCTOS
     *//*
    public static final Target MIS_PRODUCTOS = Target
            .the("Opcion 'Mis productos'")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
            //.located( By.id("b13-Link_MyProducts_BottomBar"));

*/
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