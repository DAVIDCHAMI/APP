package co.com.bancolombia.certificacion.app.interactions.virtualinvestment;

import co.com.bancolombia.backend.modelo.productos.CuentaDeposito;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.models.TermsAndConditions;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTerminos;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadInversionVirtual;
import co.com.bancolombia.certificacion.app.models.nousar.CreateDepositEntity;
import co.com.bancolombia.certificacion.app.models.products.VirtualInvestment;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.UtilityManager;
import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PrepareAndSubmitOpeningVirtualInvestmentXml implements Interaction{
	
	private static final Logger LOGGER = LogManager.getLogger(PrepareAndSubmitOpeningVirtualInvestmentXml.class.getName());
	private static final UtilityXml utilityXml = new UtilityXml();
	
	/**
	 * Prepare Transferencias Bancolombia Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction prepareAndSubmitXml() {
	    return instrumented(PrepareAndSubmitOpeningVirtualInvestmentXml.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		User user = CargarEntidadUsuario.getUser();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
		CuentaDeposito depositValues = CreateDepositEntity.getDepositValues();
		VirtualInvestment virtualInvestment = CargarEntidadInversionVirtual.getVirtualInvestment();
		TermsAndConditions termsAndConditions = CargarEntidadTerminos.getTermsAndConditions();

		String strUrlXml = Serenity.sessionVariableCalled("UrlXml");
		String strRequest = utilityXml.buscarXml(AdministradorConstante.CHANNEL_APP,
				transaction.getTransactionCode());
		
		if (strRequest != null  ) {
			strRequest = strRequest.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
			strRequest = strRequest.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
			strRequest = strRequest.replace("_SESSCOOKIE", AdministradorConstante.SESSCOOKIE);
			strRequest = strRequest.replace("_CLIENTID", user.getDocumentNumber());

			strRequest = strRequest.replace("_Cuenta", UtilityManager.depositAccountFormat(depositValues.getNumero()));
			strRequest = strRequest.replace("_TipoCuenta", depositValues.getTipoNum());

			strRequest = strRequest.replace("_Valor", virtualInvestment.getInvestmentValue() + ".00");
			strRequest = strRequest.replace("_Periodicidad", virtualInvestment.getPeriodicityPaymentInterest());
			strRequest = strRequest.replace("_Plazo", virtualInvestment.getDaysTerm());
			strRequest = strRequest.replace("_TasaEfectiva", virtualInvestment.getAnnualEffectiveRate());

			strRequest = strRequest.replace("_VersionTerminos", termsAndConditions.getTyc());

			Serenity.setSessionVariable("Request").to(strRequest);

			transaction.setTransactionHour(DateManager.obtenerFechaSistema("HHmmss"));
			String strResponse = UtilityXml.enviarXml(strUrlXml, strRequest);
			Serenity.setSessionVariable("Response").to(strResponse);

			LOGGER.info("REQUEST Opening Inversion Virtual Trn" + transaction.getTransactionCode() +
					" \n" + strRequest + "\n");
			LOGGER.info("RESPONSE Opening Inversion Virtual Trn" + transaction.getTransactionCode() +
					" \n" + strResponse + "\n");
			
		}else {LOGGER.info("No se encontro el xml request parametrizado en la ruta");}
		
	}

}
