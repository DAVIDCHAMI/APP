package co.com.bancolombia.certificacion.app.integration.logcanal.autenticacion;

import co.com.bancolombia.backend.modelo.control.canalsti.LogCanal;
import co.com.bancolombia.certificacion.app.integration.FactoriaTransaccionLogCanal;
import net.serenitybdd.core.Serenity;

import java.io.IOException;

public class LogCanalAutenticacion implements FactoriaTransaccionLogCanal {

    @Override
    public void crearObjetoLogCanal(LogCanal objetoLogCanalActual) throws IOException {
        Serenity.setSessionVariable("logCanal").to(objetoLogCanalActual);
    }
}
