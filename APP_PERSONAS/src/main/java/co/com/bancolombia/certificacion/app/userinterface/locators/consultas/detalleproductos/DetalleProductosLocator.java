package co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class DetalleProductosLocator {
    public static final Locator LBL_SALDO_DISPONIBLE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Saldo disponible']/../following-sibling::div/div/span")
            .withIos("");
    public static final Locator LBL_SALDO_CANJE_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Saldo en canje']/../../following-sibling::div/span")
            .withIos("");
    public static final Locator LBL_SALDO_TOTAL_DETALLE_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Saldo total']/../../following-sibling::div/span")
            .withIos("");
    public static final Locator LBL_FECHA_PROXIMO_PAGO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Fecha próximo pago']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_DEUDA_FECHA_PESOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Deuda a la fecha en pesos']/../following-sibling::div")
            .withIos("");
public static final Locator LBL_DEUDA_FECHA_DOLAR_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Deuda a la fecha en dólares']/../following-sibling::div")
            .withIos("");
public static final Locator LBL_DISPONIBLE_AVACE_PESOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Disponible para avances en pesos']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_CAPITAL_VIGENTE_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Capital Vigente']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_INTERES_CORRIENTES_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Intereses corrientes']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_SALDO_MORA_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Saldo en mora']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_INTERES_MORA_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Saldo en mora']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_OTROS_CARGOS_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Otros cargos']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_FECHA_DESEMBOLSO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Fecha de desembolso']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_VALOR_DESEMBOLSO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Valor desembolso']/../following-sibling::div")
            .withIos("");
    public static final Locator LBL_DEUDA_FECHA_CREDITO_LOCATOR = locator()
            .withAndroid("xpath$//span[text()='Deuda a la fecha']/../following-sibling::div/div/span")
            .withIos("");
    private DetalleProductosLocator() {
        throw new IllegalStateException(CLASE_LOCATOR);
    }
}
