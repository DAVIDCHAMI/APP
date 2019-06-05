package co.com.bancolombia.certificacion.app.interactions.virtualinvestment;

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
import co.com.bancolombia.backend.modelo.productos.CuentaDeposito;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepareAndSubmitSimulationVirtualInvestmentXml implements Interaction {


    private static final Logger LOGGER = LogManager.getLogger(PrepareAndSubmitOpeningVirtualInvestmentXml.class.getName());
    private static final UtilityXml utilityXml = new UtilityXml();



    public static Interaction prepareAndSubmitXml() {
        return instrumented(PrepareAndSubmitSimulationVirtualInvestmentXml.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = CargarEntidadUsuario.getUser();
        ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
        VirtualInvestment investment = CargarEntidadInversionVirtual.getVirtualInvestment();
        CuentaDeposito deposit = CreateDepositEntity.getDepositValues();

        String strUrlXml = Serenity.sessionVariableCalled("UrlXml");
        String strRequest = utilityXml.buscarXml(AdministradorConstante.CHANNEL_APP,
                transaction.getTransactionCode());

        if (strRequest != null  ) {
            strRequest = strRequest.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
            strRequest = strRequest.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
            strRequest = strRequest.replace("_SESSCOOKIE", AdministradorConstante.SESSCOOKIE);
            strRequest = strRequest.replace("_CLIENTID", user.getDocumentNumber());


            strRequest = strRequest.replace("_Cuenta", UtilityManager.depositAccountFormat(deposit.getNumero()));
            strRequest = strRequest.replace("_TipoCuenta", deposit.getTipoNum());
            strRequest = strRequest.replace("_Tiempo", investment.getDaysTerm());
            strRequest = strRequest.replace("_Valor", investment.getInvestmentValue() + ".00");
            strRequest = strRequest.replace("_TasaEfectiva", investment.getAnnualEffectiveRate());
            strRequest = strRequest.replace("_Periodicidad",investment.getPeriodicityPaymentInterest());



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

