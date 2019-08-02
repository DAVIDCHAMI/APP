package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBuilder implements Builder<Usuario> {
    private String nombreUsuario;
    private String clave;
    private String segundaClave;
    private String numeroDocumento;
    private String tipoDocumento;
    private String primeraPregunta;
    private String estadoClave;
    private List<Producto> productos;

    public UsuarioBuilder(){
        this.nombreUsuario = "";
        this.clave = "";
        this.segundaClave = "";
        this.numeroDocumento = "";
        this.tipoDocumento = "";
        this.primeraPregunta = "";
        this.estadoClave = "";
        this.productos = new ArrayList<>();
    }

    public static UsuarioBuilder credenciales(){
        return new UsuarioBuilder();
    }

    public UsuarioBuilder conNombreUsuario(String datosUsuario){
        this.nombreUsuario = datosUsuario;
        return this;
    }

    public UsuarioBuilder conClave(String clave){
        this.clave= clave;
        return this;
    }

    public UsuarioBuilder conSegundaClave(String segundaClave){
        this.segundaClave= segundaClave;
        return this;
    }

    public UsuarioBuilder conNumeroDocumento(String numeroDocumento){
        this.numeroDocumento= numeroDocumento;
        return this;
    }

    public UsuarioBuilder conTipoDocumento(String tipoDocumento){
        this.tipoDocumento= tipoDocumento;
        return this;
    }

    public UsuarioBuilder conPrimeraPregunta(String primeraPregunta){
        this.primeraPregunta= primeraPregunta;
        return this;
    }

    public UsuarioBuilder conEstadoClave(String estadoClave){
        this.estadoClave= estadoClave;
        return this;
    }

    public UsuarioBuilder conProductos(List<Producto> productos){
        this.productos= productos;
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

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public Usuario build() {
        return new Usuario(this);
    }
}
