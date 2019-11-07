package co.com.bancolombia.certificacion.app.utilidades.administradores;

import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public static boolean elementoVisible(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isVisible();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public static boolean elementoPresente(Actor actor, Target target) {
        boolean result = false;
        try {
            result = target.resolveFor(actor).isPresent();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;

    }
}
