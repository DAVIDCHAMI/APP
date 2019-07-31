package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

public class UsuarioBuilder implements Builder<Usuario> {
    private String nombreUsuario;
    private String clave;
    private String segundaClave;
    private String numeroDocumento;
    private String tipoDocumento;
    private String primeraPregunta;
    private String estadoClave;
    private String correo;
    private String nombrePersonalizado;
    private String numeroCelular;
    private String tipoCorreo;
    private List<Producto> productos;

    public UsuarioBuilder() {
        this.nombreUsuario = "";
        this.clave = "";
        this.numeroDocumento = "";
        this.tipoDocumento = "";
        this.primeraPregunta = "";
        this.estadoClave = "";
        this.segundaClave = "";
        this.nombrePersonalizado = "";
        this.correo = "";
        this.tipoCorreo = "";
        this.numeroCelular = "";
    }

    public static UsuarioBuilder usuario (){
        return new UsuarioBuilder();
    }

    public UsuarioBuilder conNombrePersonalizado(List<Map<String, String>> datos) {
        this.nombrePersonalizado = datos.get(0).get("nombrePersonalizado");
        return this;
    }

    public UsuarioBuilder conSegundaClave(List<Map<String, String>> datos) {
        this.segundaClave = datos.get(0).get("segundaClave");
        return this;
    }

    public UsuarioBuilder conCorreo(List<Map<String, String>> datos) {
        this.correo = datos.get(0).get("correo");
        return this;
    }

    public UsuarioBuilder conTipoCorreo(List<Map<String, String>> datos) {
        this.tipoCorreo = datos.get(0).get("tipoCorreo");
        return this;
    }

    public UsuarioBuilder conNumeroCelular(List<Map<String, String>> datos) {
        this.numeroCelular = datos.get(0).get("numeroCelular");
        return this;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public String getSegundaClave() {
        return segundaClave;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getPrimeraPregunta() {
        return primeraPregunta;
    }

    public String getEstadoClave() {
        return estadoClave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombrePersonalizado() {
        return nombrePersonalizado;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getTipoCorreo() {
        return tipoCorreo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public Usuario build() {
        return new Usuario(this);
    }
}
