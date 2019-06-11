package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.factoria.producto.FactoriaProducto;
import co.com.bancolombia.certificacion.app.models.factoria.producto.InterfazProducto;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.CODIGO_OPETACION_TRANSFERENCIA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.CODIGO_TRANSACCION_ACH;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;


public class EntidadTransferenciaActual {
    private static Transferencia transferencia;

    private EntidadTransferenciaActual() {

        throw new IllegalStateException(CLASE_ENTIDAD);

    }

    public static Transferencia getTransferencia() {
        return transferencia;
    }

    public static void setTransferencia(List<String> data) {
        Transferencia transfer = new Transferencia();
        InterfazProducto productoFactory = new FactoriaProducto();

        Producto productoOrigen = productoFactory.crarProducto(data.get(0), data.get(1));
        Producto productoDestino = productoFactory.crarProducto(data.get(2), data.get(3));
        transfer.setProductoOrigen(productoOrigen);
        transfer.setProductoDestino(productoDestino);
        transfer.setMonto(data.get(4));

        if (EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion().getCodigoTransaccion().equals(CODIGO_TRANSACCION_ACH)) {
            transfer.setBanco(data.get(5));
            transfer.setDescripcion(data.get(6));
            transfer.setInformacionAdicional(data.get(7));
        } else {
            transfer.setTipoTransferencia(data.get(5));
        }

        transfer.setCodigoOperacion(CODIGO_OPETACION_TRANSFERENCIA);
        EntidadTransferenciaActual.transferencia = transfer;
    }

}
