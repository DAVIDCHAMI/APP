package co.com.bancolombia.certificacion.app.models.eprepago;

import co.com.bancolombia.certificacion.app.models.builders.EprepagoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;

public class Eprepago extends Producto {
    private String fechaVencimiento;
    private String cvc;

    public Eprepago(EprepagoBuilder eprepagoBuilder) {
        super(eprepagoBuilder.getNumeroTarjeta(), eprepagoBuilder.getTipoCuenta(), eprepagoBuilder.getSaldo());
        this.fechaVencimiento = eprepagoBuilder.getFechaVencimiento();
        this.cvc = eprepagoBuilder.getCvc();
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCvc() {
        return cvc;
    }
}
