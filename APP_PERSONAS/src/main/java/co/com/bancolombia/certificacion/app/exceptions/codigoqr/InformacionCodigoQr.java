package co.com.bancolombia.certificacion.app.exceptions.codigoqr;

public class InformacionCodigoQr extends AssertionError {
    public static final String INFORMACION_CONFIRMACION_INCORRECTA =
            "El codigo QR no fue presentado o la información en la presentada no corresponde con la diligenciada";

    public InformacionCodigoQr(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
