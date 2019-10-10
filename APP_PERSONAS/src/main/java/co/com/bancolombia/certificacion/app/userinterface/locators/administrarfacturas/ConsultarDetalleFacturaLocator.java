package co.com.bancolombia.certificacion.app.userinterface.locators.administrarfacturas;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ConsultarDetalleFacturaLocator {
    public static final Locator LBL_DETALLE_INSCRITAS_LOCATOR = locator().withAndroid("xpath$//span[text()='INSCRITAS']").withIos("xpath$");
    public static final Locator LBL_DETALLE_EMPRESA_SERVICIO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Empresa o servicio')]/../following-sibling::div//span[contains(text(),'{0}')]").withIos("xpath$");
    public static final Locator LBL_DETALLE_ESTADO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Estado')]/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_NEGOCIO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'NEGOCIO')]/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_NIT_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'NIT')]/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_VALOR_PAGAR_LOCATOR = locator().withAndroid("xpath$//span[text()='Valor a pagar']/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_NUMERO_FACTURA_LOCATOR = locator().withAndroid("xpath$//span[text()='NUMERO DE FACTURA']/../following-sibling::div//span").withIos("xpath$");
    public static final Locator LBL_DETALLE_FECHA_VENCIMIENTO_FACTURA_LOCATOR = locator().withAndroid("xpath$//span[text()='Fecha de vencimiento']/../following-sibling::div/span[contains(text(),'{0}')]").withIos("xpath$");
    public static final Locator LBL_DETALLE_CANAL_INSCRIPCION_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Canal')]/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_TIPO_CUENTA_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'Producto origen')]/../following-sibling::div//span)[2]").withIos("xpath$");
    public static final Locator LBL_DETALLE_NUMERO_CUENTA_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'Producto origen')]/../following-sibling::div//span)[3]").withIos("xpath$");
    public static final Locator OPT_VER_DETALLE_FAClTURA_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../../../..//div//span[contains(text(),'VER DETALLE')]").withIos("xpath$");
    public static final Locator OPT_PAGAR_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'{0}')]/../preceding-sibling::div/span[contains(text(),'{1}')]/../../preceding-sibling::div/span[contains(text(),'{2}')]/../../../../..//div//span[contains(text(),'PAGAR')])[1]").withIos("xpath$");
    public static final Locator LBL_DETALLE_FECHA_INICIO_LOCATOR = locator().withAndroid("xpath$//span[text()='Fecha inicio de la programación']/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_DETALLE_FECHA_FIN_LOCATOR = locator().withAndroid("xpath$//span[text()='Fecha fin de la programación']/../following-sibling::div/span").withIos("xpath$");
    public static final Locator LBL_PERIODICIDAD_FECHA_FIN_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'Duración del pago')]/../following-sibling::div//span)[2]").withIos("xpath$");
    public static final Locator LBL_PERIODICIDAD_FECHA_INICIO_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'Duración del pago')]/../following-sibling::div//span)[1]").withIos("xpath$");
    public static final Locator CONTENEDOR_FACTURAS_LOCATOR = locator().withAndroid("xpath$//div[@id='l1-{0}-AccountDataContainer']").withIos("xpath$");
    public static final Locator LBL_DESCRIPCION_FACTURA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[1]").withIos("xpath$");
    public static final Locator LBL_EMPRESA_CONVENIO_LOCATOR = locator().withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[2]").withIos("xpath$");
    public static final Locator LBL_FECHA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[3]").withIos("xpath$");
    public static final Locator LBL_VALOR_FACTURA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l1-{0}-AccountDataContainer']//span)[5]").withIos("xpath$");
    public static final Locator LBL_DESCRIPCION_FACTURA_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l3-{0}-AccountDataContainer3']//span)[1]").withIos("xpath$");
    public static final Locator LBL_EMPRESA_CONVENIO_FACTURA_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l3-{0}-AccountDataContainer3']//span)[2]").withIos("xpath$");
    public static final Locator LBL_FECHA_FACTURA_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l3-{0}-AccountDataContainer3']//span)[3]").withIos("xpath$");
    public static final Locator LBL_VALOR_FACTURA_PROGRAMADA_LOCATOR = locator().withAndroid("xpath$(//div[@id='l3-{0}-AccountDataContainer3']//span)[5]").withIos("xpath$");

    public ConsultarDetalleFacturaLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}