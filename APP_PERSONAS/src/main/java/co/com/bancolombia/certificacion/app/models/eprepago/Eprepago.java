package co.com.bancolombia.certificacion.app.models.eprepago;

import co.com.bancolombia.certificacion.app.models.builders.EprepagoBuilder;

public class Eprepago {
    private String saldoDisponible;
    private String numeroTarjeta;
    private String fechaVencimiento;
    private String cvc;

    public Eprepago(EprepagoBuilder eprepagoBuilder) {
        this.saldoDisponible = eprepagoBuilder.getSaldoDisponible();
        this.numeroTarjeta = eprepagoBuilder.getNumeroTarjeta();
        this.fechaVencimiento = eprepagoBuilder.getFechaVencimiento();
        this.cvc = eprepagoBuilder.getCvc();
    }

    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCvc() {
        return cvc;
    }
}
