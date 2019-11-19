package co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AvancesLocator
{
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$//XCUIElementTypeButton[@name='SIGUIENTE']");
    public static final Locator LST_TARJETAS_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='Screen_CreditCard_List2']//div").withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'*')]");
    public static final Locator LST_CAMPO_CLAVE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$//XCUIElementTypeOther[12]/XCUIElementTypeTextField");
    public static final Locator BTN_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='b12-Tab2']").withIos("xpath$//XCUIElementTypeStaticText[@name='Tarjetas de créditos']");
    public static final Locator SESSION_AVANCES = locator().withAndroid("xpath$(//span[contains(text(),'Realizar avances')])[2]").withIos("xpath$d");
    public static final Locator LISTADO_TARJETAS = locator().withAndroid("xpath$//div[@id='ListCards']//div").withIos("xpath$//XCUIElementTypeStaticText[@name='Tarjetas de créditos']/../following-sibling::XCUIElementTypeOther[3]");
    public static final Locator TXT_VALOR_AVANCE = locator().withAndroid("xpath$//input[@id='Input_Valor']").withIos("xpath$//XCUIElementTypeApplication[@name='Personas']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]");
    public static final Locator BTN_SIGUIENTE_AVANCE = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$//XCUIElementTypeStaticText[@name='Siguiente']");
    public static final Locator LST_PRODUCTO_DESTINO = locator().withAndroid("xpath$//div[@id='Account_List']//div").withIos("xpath$//XCUIElementTypeApplication[@name='Personas']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeStaticText");
    public static final Locator BTN_REALIZA_AVANCE = locator().withAndroid("xpath$//button[@id='RequestAdvanceButton']").withIos("xpath$//XCUIElementTypeButton[@name='REALIZAR AVANCE']");
    public static final Locator MIS_PRODUCTOS_AVANCE_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab1Expression']").withIos("xpath$//XCUIElementTypeStaticText[@name='Mis Productos']");
    public static final Locator TARJETAS_INSCRITAS_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab2Expression']").withIos("xpath$//XCUIElementTypeApplication[@name='Personas']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeOther/XCUIElementTypeStaticText");
    public static final Locator MENSAJE_CUPO_INSUFICIENTE_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'Cupo insuficiente')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Cupo insuficiente']");
    public static final Locator MENSAJE_AVANCE_EXITOSO_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'¡Avance exitoso!')]").withIos("xpath$//XCUIElementTypeStaticText[@name='¡Avance exitoso!']");
    public static final Locator BTN_INSCRITOS_LOCATORS= locator().withAndroid("xpath$//span[@id='Tab2Expression']").withIos("xpath$//XCUIElementTypeStaticText[@name='Inscritos']");

    private AvancesLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}
