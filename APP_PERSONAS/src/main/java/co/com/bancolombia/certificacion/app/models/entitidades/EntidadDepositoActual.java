package co.com.bancolombia.certificacion.app.models.entitidades;

import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class EntidadDepositoActual {

    private static CuentaDeposito deposito = new CuentaDeposito();

    private EntidadDepositoActual() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static CuentaDeposito getDeposito() {
        return deposito;
    }

    public static void setDeposito(List<String> data){
        deposito.setNumero(data.get(0));
        deposito.setTipo(data.get(1));
    }
}
