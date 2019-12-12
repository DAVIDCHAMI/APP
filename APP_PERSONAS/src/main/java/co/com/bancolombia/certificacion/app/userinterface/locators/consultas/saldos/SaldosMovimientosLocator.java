package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class SaldosMovimientosLocator {
    public static final Locator OPT_CUENTA_PRODUCTO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']/../..//following-sibling::div//span[contains(text(),'{1}')]").withIos("xpath$//XCUIElementTypeStaticText[contains(@name,'{0}')]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{1}']");
    public static final Locator OPT_CUENTA_TAJETA_CREDITO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='{1}']").withIos("xpath$(//XCUIElementTypeStaticText[@name='{0}'])[1]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{1}']");
    public static final Locator OPT_CUENTA_EPREPAGO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']/../../following-sibling::div//span[text()='{1}']")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']/../following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText[@name='{1}']");
    public static final Locator OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='{0}']")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator LBL_SIN_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//span[contains(text(),'{0}')]")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator BTN_DETALLE_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//div[@id='Tabs']//span[text()='Detalle del producto']").withIos("xpath$//XCUIElementTypeStaticText[@name='Detalle del producto']");
    public static final Locator BTN_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//div[@id='Tabs']//span[text()='Movimientos']").withIos("xpath$(//XCUIElementTypeStaticText[@name='Movimientos'])[1]");
    public static final Locator BTN_OCULTAR_BANNER_LOCATOR = locator().withAndroid("xpath$//android.view.View[@resource-id='b5-b1-Content']/android.view.View[2]/android.view.View").withIos("xpath$n");
    public static final Locator CONTENEDOR_INFORMACION_PRODUCTO_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-Screen_Account_Line']").withIos("xpath$(//XCUIElementTypeStaticText[@name='Cuenta'])[{0}]");
    public static final Locator LBL_TIPO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-{0}-AccountContentContainer']//div[1]//i/following-sibling::span")
            .withIos("xpath$(//XCUIElementTypeStaticText[@name='Cuenta'])[{0}]//../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
    public static final Locator LBL_NUMERO_CUENTA_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-{0}-AccountContentContainer']//div[2]//div[1]//span")
            .withIos("xpath$(//XCUIElementTypeStaticText[@name='Cuenta'])[{0}]//../following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
    public static final Locator LBL_SALDO_DISPONIBLE_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//div[@id='l1-0-AccountContentContainer']//div[3]//span")
            .withIos("xpath$(//XCUIElementTypeStaticText[@name='Cuenta'])[{0}]//../following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText");
    public static final Locator LBL_SALDOS_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//*[contains(text(),'{0}')]/ancestor::div[@class='cardlist-item']//*[contains(text(),'{1}')]/ancestor::div[@class='cardlist-item']//div[@class='text-right']")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']/../following-sibling::XCUIElementTypeOther[1][.//XCUIElementTypeStaticText[@name='{1}']]/following-sibling:: XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
    public static final Locator LBL_SALDO_CUENTAS_LOCATOR = locator()
            .withAndroid("xpath$//*[contains(text(),'{0}')]/ancestor::div[@class='cardlist-item']//*[contains(text(),'{1}')]/ancestor::div[@class='cardlist-item']//div[@class='text-right']")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']/../following-sibling::XCUIElementTypeOther[1][.//XCUIElementTypeStaticText[@name='{1}']]/following-sibling:: XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
    public static final Locator LBL_SALDO_CREDIAGIL_MOVIMIENTOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Crediágil']/../../following-sibling::div/div/div/div[3]/span")
            .withIos("xpath$//XCUIElementTypeStaticText[@name='Crediágil']/../following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText");
    public static final Locator VER_MOVIMIENTOS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-ContentAccountElement']").withIos("xpath$(((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeImage/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]/../../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
    public static final Locator VER_MOVIMIENTOS_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$(//div[@class='datalist-col-2'])[{0}]").withIos("xpath$h(((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeImage)[2]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]");
    public static final Locator VER_MOVIMIENTOS_EPREPAGO_LOCATOR = locator().withAndroid("xpath$//div[@class='datalist-padding']").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Movimientos']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[7][./XCUIElementTypeImage]/following-sibling::XCUIElementTypeOther[{0}]/XCUIElementTypeStaticText");
    public static final Locator LBL_FECHA_MOVIMIENTO_CUENTAS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-ContentAccountElement']//div[@class='datalist-date']/span[1]").withIos("xpath$(((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeImage/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]/../..//XCUIElementTypeStaticText)[1]");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_CUENTAS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-ContentAccountElement']//div//div[2]/span[1]").withIos("xpath$(((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeImage/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]/../../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
    public static final Locator LBL_SALDO_CUENTASLOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-ContentAccountElement']//div[@class='datalist-date']/span[1]").withIos("xpath$((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeImage/../following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]");
    public static final Locator LBL_FECHA_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$(//div[@class='datalist-col-2'])[{0}]//div[@class='datalist-date']/span[1]").withIos("xpath$((((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeImage)[2]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]/../..//XCUIElementTypeStaticText)[1]");
    public static final Locator LBL_FECHA_MOVIMIENTO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$(//div[@class='datalist-date']//span[1])[{0}]").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Movimientos']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[7][./XCUIElementTypeImage]/following-sibling::XCUIElementTypeOther[{0}]/XCUIElementTypeStaticText");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$(//div[@class='datalist-col-2'])[{0}]//div[2]//span").withIos("xpath$((((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeImage)[2]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]/../../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
    public static final Locator LBL_DESCRIPCION_MOVIMIENTO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$(//span[@class='font-family-OpenSans-regular font-size-s black OSFillParent']/..)[{0}]").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Movimientos']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[7][./XCUIElementTypeImage]/following-sibling::XCUIElementTypeOther[{0}]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText");
    public static final Locator LBL_SALDO_MOVIMIENTO_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$(//div[@class='datalist-col-2'])[{0}]//div[@class='datalist-date']/span[2]").withIos("xpath$(((//XCUIElementTypeStaticText[@name='Movimientos'])[1]/../following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeImage)[2]/../following-sibling::XCUIElementTypeOther//XCUIElementTypeOther/XCUIElementTypeStaticText)[{0}]");
    public static final Locator LBL_SALDO_MOVIMIENTO_EPREPAGO_LOCATOR = locator().withAndroid("xpath$(//span[@class='datalist-movements-value ThemeGrid_MarginGutter'])[{0}]").withIos("xpath$//XCUIElementTypeOther[./XCUIElementTypeStaticText[@name='Movimientos']]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[7][./XCUIElementTypeImage]/following-sibling::XCUIElementTypeOther[{0}]/XCUIElementTypeOther/XCUIElementTypeStaticText");
    public static final Locator BTN_FILTRO_BUSQUEDA_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//img[@class='ThemeGrid_MarginGutter']").withIos("xpath$test");
    public static final Locator BTN_LIMPIAR_CAMPOS_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Limpiar campos')]").withIos("xpath$test");
    public static final Locator TXT_DESCRIPCION_LOCATOR = locator().withAndroid("xpath$//input[@id='Description2']").withIos("xpath$test");
    public static final Locator TXT_RANGO_FECHAS_LOCATOR = locator().withAndroid("xpath$//input[@id='Date2']").withIos("xpath$test");
    public static final Locator FOCO_MOVIMIENTOS_LOCATOR = locator().withAndroid("xpath$//span[text()='Movimientos' and @class='font-family-nunito']").withIos("xpath$test");
    public static final Locator BTN_BUSCAR_MOVIMIENTO_LOCATOR = locator().withAndroid("xpath$//button[@id='Button_Search2']").withIos("xpath$test");
    public static final Locator BTN_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$//img[@id='CarrouselIconInactiveImg']").withIos("xpath$test");
    public static final Locator LBL_TIPO_CUENTA_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[@class='font-family-OpenSans-regular']//span[@class='font-family-OpenSans-regular'])[{0}]").withIos("xpath$test");
    public static final Locator LBL_NUMERO_CUENTA_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//span[@class=' font-family-OpenSans-regular' and text()='Saldo disponible']//preceding::span[1])[{0}]").withIos("xpath$test");
    public static final Locator LBL_SALDO_DISPONIBLE_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[@class='text-right']//span[@class='font-family-nunito font-family-nunito-bold text-black'])[{0}]").withIos("xpath$test");
    public static final Locator CATEGORIA_PRODUCTOS_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]").withIos("xpath$test");
    public static final Locator CATEGORIA_TARJETAS_CREDITO_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$//div[@id='l8-{0}-CreditCardDataContainer2']").withIos("xpath$test");
    public static final Locator LBL_NUMERO_CUENTA_TC_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditCardDataContainer2')])[{0}]//span[@class=' font-family-OpenSans-regular']").withIos("xpath$test");
    public static final Locator LBL_TIPO_CUENTA_TC_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditCardDataContainer2')])[{0}]//span[@class=' font-family-OpenSans-regular text-grey']").withIos("xpath$test");
    public static final Locator LBL_SALDO_DISPONIBLE_TC_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditCardDataContainer2')])[{0}]//span[@class='font-family-nunito font-family-nunito-bold text-black']").withIos("xpath$test");
    public static final Locator LBL_NUMERO_CUENTA_CREDITOS_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditsDataContainer3')])[{0}]//span[@class=' font-family-OpenSans-regular font-size-s']//following::div[2]//span").withIos("xpath$test");
    public static final Locator LBL_TIPO_CUENTA_CREDITOS_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditsDataContainer3')])[{0}]//span[@class=' font-family-OpenSans-regular font-size-s']").withIos("xpath$test");
    public static final Locator LBL_SALDO_DISPONIBLE_CREDITOS_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[contains(@id,'CreditsDataContainer3')])[{0}]//span[@class='font-family-nunito font-family-nunito-bold text-black']").withIos("xpath$test");
    public static final Locator LBL_NUMERO_CUENTA_INVERSIONES_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$test");
    public static final Locator LBL_TIPO_CUENTA_INVERSIONES_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$test");
    public static final Locator LBL_SALDO_DISPONIBLE_INVERSIONES_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$").withIos("xpath$test");

    public static final Locator LBL_NUMERO_CUENTA_EPREPAGO_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[@id='b57-CarouselItems']//span[contains(text(),'*')])[{0}]").withIos("xpath$test");
    public static final Locator LBL_TIPO_CUENTA_EPREPAGO_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[@id='b57-CarouselItems']//span[@class='font-family-OpenSans-regular font-size-s break-Big-Words'])[{0}]").withIos("xpath$test");
    public static final Locator LBL_SALDO_DISPONIBLE_EPREPAGO_VISTA_CARRUSEL_LOCATOR = locator().withAndroid("xpath$(//div[@id='b57-CarouselItems']//span[@class='font-family-nunito font-family-nunito-bold text-black'])[{0}]").withIos("xpath$test");

    private SaldosMovimientosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}