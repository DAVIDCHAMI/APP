package co.com.bancolombia.certificacion.app.models.usuario;


import co.com.bancolombia.certificacion.app.models.productos.Producto;

import java.util.List;

/**
 * The type Usuario.
 */
public class Usuario {

    private String nombreUsuario;
    private String clave;
    private String segundaClave;
    private String numeroDocumento;
    private String tipoDocumento;
    private String primeraPregunta;
    private String estadoClave;
    private List<Producto> productos;

    public Usuario(){
        this.tipoDocumento="";
        this.numeroDocumento="";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public void setNombreUsuario(String usuario) {
        this.nombreUsuario = usuario;
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getSegundaClave() {
        return segundaClave;
    }


    public void setSegundaClave(String segundaClave) {
        this.segundaClave = segundaClave;
    }


    public String getNumeroDocumento() {
        return numeroDocumento;
    }


    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getPrimeraPregunta() {
        return primeraPregunta;
    }

    public void setPrimeraPregunta(String primeraPregunta) {
        this.primeraPregunta = primeraPregunta;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    public String getEstadoClave() {
        return estadoClave;
    }

    public void setEstadoClave(String estadoClave) {
        this.estadoClave = estadoClave;
    }
}