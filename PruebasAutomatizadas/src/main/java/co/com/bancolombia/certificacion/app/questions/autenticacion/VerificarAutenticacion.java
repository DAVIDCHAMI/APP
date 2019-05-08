package co.com.bancolombia.certificacion.app.questions.autenticacion;

import co.com.bancolombia.certificacion.app.models.entitidades.ConfiguracionTransaccionActualEntity;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilities.UtilidadesXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.AUTENTICACION_CODIGO_TRANSACCION;

public class VerificarAutenticacion implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(VerificarAutenticacion.class.getName());
	
    @Override
    public Boolean answeredBy(Actor actor) {

		boolean resultado = false;
		UtilidadesXml utilidadesXml = new UtilidadesXml();
		ConfiguracionTransaccion transaccion = ConfiguracionTransaccionActualEntity.getConfiguracionTransaccion();
		String codigoObtenido = null;
		String mensajeObtenido = null;

		try {

			codigoObtenido = utilidadesXml.leer(Serenity.sessionVariableCalled("Response"), "//STATUS/@CODE");

			mensajeObtenido = utilidadesXml.leer(Serenity.sessionVariableCalled("Response"), "//STATUS/@DESC");

		} catch (Exception e) {
				LOGGER.error(e.getMessage(), e);
		}

		if (codigoObtenido != null && mensajeObtenido != null) {
			if (!AUTENTICACION_CODIGO_TRANSACCION.equals(transaccion.getCodigoTransaccion())) {
				if ("000".equals(codigoObtenido) && "NO ERROR".equals(mensajeObtenido)) {
					resultado = true;
				}
			} else if (codigoObtenido.equals(transaccion.getCodigoError()) &&
					mensajeObtenido.equals(transaccion.getResultadoEsperado())) {
				resultado = true;
			}
		} else {
			LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response de la autenticacion");
		}

		return resultado;
	}
}
