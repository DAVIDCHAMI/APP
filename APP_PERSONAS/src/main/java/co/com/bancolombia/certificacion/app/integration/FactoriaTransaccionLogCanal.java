package co.com.bancolombia.certificacion.app.integration;

import co.com.bancolombia.backend.modelo.control.canalsti.LogCanal;

import java.io.IOException;

public interface FactoriaTransaccionLogCanal {
    public void crearObjetoLogCanal(LogCanal objetoLogCanalActual) throws IOException;
}
