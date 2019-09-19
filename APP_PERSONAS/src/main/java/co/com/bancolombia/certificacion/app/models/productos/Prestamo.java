package co.com.bancolombia.certificacion.app.models.productos;

import co.com.bancolombia.certificacion.app.models.builders.PrestamoBuilder;

public class Prestamo extends Producto{
    private String tipoPago;
    private String valorPago;

    public Prestamo(PrestamoBuilder builder) {
        super(builder.getNumeroPrestamo(), builder.getTipoPrestamo());
        this.tipoPago = builder.getTipoPago();
        this.valorPago = builder.getValorPago();
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public String getValorPago() {
        return valorPago;
    }
}
