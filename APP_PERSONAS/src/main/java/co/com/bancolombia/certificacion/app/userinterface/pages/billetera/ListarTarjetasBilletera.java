package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.ListarTarjetasBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ListarTarjetasBilletera {
    public static final Target LBL_TARJETAS_LISTADAS = Target.the("Titulo de tarjetas listadas").located(theElementBy(LBL_TARJETAS_LISTADAS_LOCATOR));
    public static final Target BTN_ACTIVAR_BILLETERA = Target.the("Boton activar Billetera").located(theElementBy(BTN_ACTIVAR_TARJETA_LOCATOR));
    public static final Target IMG_TARJETA_ELEGIR = Target.the("Boton activar Billetera").located(theElementBy(IMG_TARJETA_ELEGIR_LOCATOR));

    private ListarTarjetasBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
