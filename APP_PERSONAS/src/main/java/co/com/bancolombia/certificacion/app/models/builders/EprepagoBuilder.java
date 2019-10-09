package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.eprepago.Eprepago;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

public class EprepagoBuilder implements Builder<Eprepago> {
    private String saldoDisponible;
    private String numeroTarjeta;
    private String fechaVencimiento;
    private String cvc;
    private String tipoCuenta;

    private EprepagoBuilder() {
        this.saldoDisponible = "";
        this.numeroTarjeta = "";
        this.fechaVencimiento = "";
        this.cvc = "";
        this.tipoCuenta = "";
    }

    public static EprepagoBuilder eprepago() {
        return new EprepagoBuilder();
    }

    public EprepagoBuilder conSaldoDisponible(String saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
        return this;
    }

    public EprepagoBuilder conNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }

    public EprepagoBuilder conFechaVencimiento(String fechaVencimiento) {
        this.saldoDisponible = fechaVencimiento;
        return this;
    }

    public EprepagoBuilder conTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        return this;
    }

    public EprepagoBuilder conCvc(String cvc) {
        this.cvc = cvc;
        return this;
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

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    @Override
    public Eprepago build() {
        return new Eprepago(this);
    }
}
