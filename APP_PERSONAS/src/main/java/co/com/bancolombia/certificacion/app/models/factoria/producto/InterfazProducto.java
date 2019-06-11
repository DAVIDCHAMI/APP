package co.com.bancolombia.certificacion.app.models.factoria.producto;


import co.com.bancolombia.certificacion.app.models.productos.Producto;

/**
 * The interface Producto factoria method.
 */
@FunctionalInterface
public interface InterfazProducto {

    /**
     * Create productos productos.
     *
     * @param  numeroProducto the number productos
     * @param tipoProducto   the type productos
     * @return the productos
     */
     Producto crarProducto(String numeroProducto, String tipoProducto);
}
