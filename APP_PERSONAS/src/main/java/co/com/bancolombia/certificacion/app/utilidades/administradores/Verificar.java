package co.com.bancolombia.certificacion.app.utilidades.administradores;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Verificar {
    private static final Logger LOGGER = LogManager.getLogger("Verificar");

    private Verificar() {
        throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD);
    }

    public static boolean elementoHabilitado(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isEnabled();
        } catch (Exception e) {
            LOGGER.info("elemento no habilitado");
        }
        return result;
    }

    public static boolean elementoVisible(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isVisible();
        } catch (Exception e) {
            LOGGER.info("elemento no visible");        }
        return result;
    }

    public static boolean elementoPresente(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isPresent();
        } catch (Exception e) {
            LOGGER.info("elemento no presente");        }
        return result;
    }

    public static boolean datosPagoBilletera(List<String> datosPagoBilletera, List<String> datosPagoQr){
        boolean revision = false;
        for(int i = 0; datosPagoQr.size()<8; i++){
            //datosPagoBilletera.g
        }
        return revision;
    }
}