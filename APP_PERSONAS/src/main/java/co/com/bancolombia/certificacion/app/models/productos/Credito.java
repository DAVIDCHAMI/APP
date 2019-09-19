package co.com.bancolombia.certificacion.app.models.productos;

import co.com.bancolombia.certificacion.app.models.builders.CreditoBuilder;

public class Credito extends Producto {
    private String deudaFechaCredito;
    private String capitalVigente;
    private String fechaProximoPago;
    private String interesesCorrientes;
    private String saldoMora;
    private String interesesMora;
    private String otrosCargos;
    private String fechasDesembolso;
    private String valorDesembolso;

    public Credito(){}

    public Credito(CreditoBuilder creditoBuilder){
        this.deudaFechaCredito = creditoBuilder.getDeudaFechaCredito();
        this.capitalVigente = creditoBuilder.getCapitalVigente();
        this.fechaProximoPago = creditoBuilder.getFechaProximoPago();
        this.interesesCorrientes = creditoBuilder.getInteresesCorrientes();
        this.saldoMora = creditoBuilder.getSaldoMora();
        this.interesesMora = creditoBuilder.getInteresesMora();
        this.otrosCargos = creditoBuilder.getOtrosCargos();
        this.fechasDesembolso = creditoBuilder.getFechasDesembolso();
        this.valorDesembolso = creditoBuilder.getValorDesembolso();
    }

    public String getDeudaFechaCredito() {
        return deudaFechaCredito;
    }

    public String getCapitalVigente() {
        return capitalVigente;
    }

    public String getFechaProximoPago() {
        return fechaProximoPago;
    }

    public String getInteresesCorrientes() {
        return interesesCorrientes;
    }

    public String getSaldoMora() {
        return saldoMora;
    }

    public String getInteresesMora() {
        return interesesMora;
    }

    public String getOtrosCargos() {
        return otrosCargos;
    }

    public String getFechasDesembolso() {
        return fechasDesembolso;
    }

    public String getValorDesembolso() {
        return valorDesembolso;
    }
}
