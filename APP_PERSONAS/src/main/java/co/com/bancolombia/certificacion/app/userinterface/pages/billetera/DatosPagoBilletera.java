package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.DatosPagoBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class DatosPagoBilletera {
    public static final Target TXT_INGRESAR_VALOR_PAGO = Target.the("Campo ingresar valor a pagar").located(theElementBy(TXT_INGRESAR_VALOR_PAGO_LOCATOR));
    public static final Target TXT_INGRESAR_VALOR_PROPINA = Target.the("Campo ingresar valor de propina").located(theElementBy(TXT_INGRESAR_VALOR_PROPINA_LOCATOR));
    public static final Target BTN_SIGUIENTE_PAGO = Target.the("Boton siguiente para pagar").located(theElementBy(BTN_SIGUIENTE_PAGO_LOCATOR));

    private DatosPagoBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
