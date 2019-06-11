package co.com.bancolombia.certificacion.app.models.entitidades.detalle;


import co.com.bancolombia.certificacion.app.models.factoria.producto.FactoriaProducto;
import co.com.bancolombia.certificacion.app.models.factoria.producto.InterfazProducto;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.Detalle;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class EntidadDetalleActual {

    private static Detalle detalle;

    private EntidadDetalleActual() {

        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static Detalle getDetalle() { return detalle; }

    public static void setDetalle(List<String> data){
        Detalle detalle = new Detalle();
        InterfazProducto productoFactory = new FactoriaProducto();

        Producto producto = productoFactory.crarProducto(data.get(0), data.get(1));
        detalle.setProducto(producto);


        EntidadDetalleActual.detalle = detalle;
    }
}
