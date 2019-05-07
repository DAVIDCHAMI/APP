package co.com.bancolombia.certificacion.app.models.transaccion;

import co.com.bancolombia.certificacion.app.models.producto.Producto;

public class Detalle {

    private Producto producto;

    public Producto getProduct() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
