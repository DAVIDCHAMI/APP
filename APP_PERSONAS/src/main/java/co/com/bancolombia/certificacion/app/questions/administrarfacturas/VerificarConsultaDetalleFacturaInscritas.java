package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ConsultaDetalleFacturaPage.LBL_DETALLE_INSCRITAS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_CONSULTA_DETALLE_FACTURA;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerificarConsultaDetalleFacturaInscritas implements Question<Boolean> {

  @Override
  public Boolean answeredBy(Actor actor) {
    Factura facturas = actor.recall(MODELO_CONSULTA_DETALLE_FACTURA);
    return Visibility.of(LBL_DETALLE_INSCRITAS).viewedBy(actor).asBoolean()
        && facturas.getEmpresaServicio() != null
        && facturas.getValorFactura() != null
        && facturas.getFechaFactura() != null
        && facturas.getEstadoFactura() != null
        && facturas.getReferencia() != null
        && facturas.getCanalInscripcionFactura() != null;
  }

  public static VerificarConsultaDetalleFacturaInscritas inscritas() {
    return new VerificarConsultaDetalleFacturaInscritas();
  }
}
