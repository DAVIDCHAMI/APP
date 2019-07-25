package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.factoria.producto.FactoriaProducto;
import co.com.bancolombia.certificacion.app.models.factoria.producto.InterfazProducto;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.Inscripcion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;


public class EntidadInscripcionActual {

    private static Inscripcion inscripcion;

    private EntidadInscripcionActual() {

        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    public static Inscripcion getInscripcion() {
        return inscripcion;
    }

    public static void setInscripcion(List<String> data) {
       // Inscripcion inscripcion = new Inscripcion();
        InterfazProducto productoFactory = new FactoriaProducto();
        Usuario usuario = new Usuario();

        inscripcion.setNombreBanco(data.get(0));
        Producto producto = productoFactory.crarProducto(data.get(2), data.get(1));
        inscripcion.setProducto(producto);
        usuario.setTipoDocumento(data.get(3));
        usuario.setNumeroDocumento(data.get(4));
        inscripcion.setUsuario(usuario);

        EntidadInscripcionActual.inscripcion = inscripcion;
    }
}