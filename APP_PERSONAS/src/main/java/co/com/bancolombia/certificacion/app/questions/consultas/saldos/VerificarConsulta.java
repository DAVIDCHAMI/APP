package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS;

import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarConsulta implements Question<Boolean> {
  private List<Map<String, String>> datosTC;

  public VerificarConsulta(List<Map<String, String>> datosTC) {
    this.datosTC = datosTC;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    List<TarjetaCredito> listaTC = actor.recall(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS);
    return listaTC.get(0).getTipoTarjeta().equalsIgnoreCase(datosTC.get(0).get("tipoTarjeta"))
        && listaTC.get(0).getNumeroTarjeta().equalsIgnoreCase(datosTC.get(0).get("numeroTarjeta"))
        && listaTC
            .get(0)
            .getDeudaALaFechaEnPesos()
            .equalsIgnoreCase(datosTC.get(0).get("deudaPesos"))
        && listaTC
            .get(0)
            .getDeudaTotalEnDolares()
            .equalsIgnoreCase(datosTC.get(0).get("deudaDolares"));
  }

  public static VerificarConsulta deEcard(List<Map<String, String>> lista) {
    return new VerificarConsulta(lista);
  }
}
