package co.com.bancolombia.certificacion.app.models.entitidades.detalle;

import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class EntidadDetalleCuentaDeposito {

    private static CuentaDeposito cuentaDeposito = new CuentaDeposito();

    private EntidadDetalleCuentaDeposito() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static CuentaDeposito getCuentaDeposito() {
        return cuentaDeposito;
    }

    public static void setCuentaDeposito(List<String> data) {
        cuentaDeposito.setNumeroCuentaFormateado(data.get(0));
        cuentaDeposito.setTipo(data.get(1));
    }
}
