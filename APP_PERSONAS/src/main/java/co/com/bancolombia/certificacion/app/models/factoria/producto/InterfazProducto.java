package co.com.bancolombia.certificacion.app.models.factoria.producto;


import co.com.bancolombia.certificacion.app.models.producto.Producto;

/**
 * The interface Producto factoria method.
 */
@FunctionalInterface
public interface InterfazProducto {

    /**
     * Create producto producto.
     *
     * @param  numeroProducto the number producto
     * @param tipoProducto   the type producto
     * @return the producto
     */
     Producto crarProducto(String numeroProducto, String tipoProducto);
}
