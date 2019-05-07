package co.com.bancolombia.certificacion.app.models.entitidades.consulta.detalle;


import co.com.bancolombia.certificacion.app.models.factory.producto.ProductoFactory;
import co.com.bancolombia.certificacion.app.models.factory.producto.InterfazProducto;
import co.com.bancolombia.certificacion.app.models.producto.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.Detalle;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_ENTIDAD;

public class DetalleActualEntity {
    private static Detalle detalle;

    private DetalleActualEntity() {

        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static Detalle getDetalle() { return detalle; }

    public static void setDetalle(List<String> data){
        Detalle detalle = new Detalle();
        InterfazProducto productoFactory = new ProductoFactory();

        Producto producto = productoFactory.crarProducto(data.get(0), data.get(1));
        detalle.setProducto(producto);

        DetalleActualEntity.detalle = detalle;
    }
}
