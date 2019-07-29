package co.com.bancolombia.certificacion.app.models.movimiento;

import co.com.bancolombia.certificacion.app.models.builders.MovimientoBuilder;

public class Movimiento {
    private String fecha;
    private String valorMovimiento;
    private String naturaleza;
    private String codigo;
    private String descripcion;
    private String valorPorUnidad;
    private String numeroUnidades;

    public Movimiento(MovimientoBuilder movimientoBuilder){

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValorMovimiento() {
        return valorMovimiento;
    }

    public void setValorMovimiento(String valorMovimiento) {
        this.valorMovimiento = valorMovimiento;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorPorUnidad() {
        return valorPorUnidad;
    }

    public void setValorPorUnidad(String valorPorUnidad) {
        this.valorPorUnidad = valorPorUnidad;
    }

    public String getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(String numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

}
