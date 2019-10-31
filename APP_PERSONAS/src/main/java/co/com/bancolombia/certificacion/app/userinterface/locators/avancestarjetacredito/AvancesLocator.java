package co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito;
import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AvancesLocator
{
    /*locator flujo avances y desembolsos*/
    public static final Locator SESSION_AVANCES = locator().withAndroid("xpath$(//span[contains(text(),'Realizar avances')])[2]").withIos("xpath$d");
    public static final Locator LIST_CARDS = locator().withAndroid("xpath$//div[@id='ListCards']//div").withIos("xpath$d");
    public static final Locator CODE_SECURITY = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$d");
    public static final Locator BTN_SIGUIENTE = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$d");
    /*locator flujo Enviar dinero*/
    public static final Locator LISTA_TARJETAS = locator().withAndroid("xpath$//div[@id='Screen_CreditCard_List2']//div").withIos("xpath$");
    public static final Locator CAMPO_CLAVE = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$");


    private AvancesLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}
