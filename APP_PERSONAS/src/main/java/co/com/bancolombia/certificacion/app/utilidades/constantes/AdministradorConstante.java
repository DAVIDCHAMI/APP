package co.com.bancolombia.certificacion.app.utilidades.constantes;

/**
 * The type Constant manager.
 */
public class AdministradorConstante {

    /**
     * The constant AUTENTICACION_TIPO_TRANSACCION.
     */
    public static final String AUTENTICACION_TIPO_TRANSACCION = "autenticacion";

    public static final String AUTENTICACION_CODIGO_TRANSACCION = "0369";
    /**
     * The constant FORMATO_HORA.
     */
    public static final String FORMATO_HORA = "HHmmss";
    /**
     * The constant EMPTY.
     */
    public static final String EMPTY = "";
    /**
     * The constant NUMBER_FORMAT.
     */
    public static final String NUMBER_FORMAT = "###,###.###";
    /**
     * The constant TRANSFERENCIA_TIPO_TRANSACCION.
     */
    public static final String TRANSFERENCIA_TIPO_TRANSACCION = "Transferencia";
    /**
     * The constant ACIERTO.
     */
    public static final String ACIERTO = "ACIERTO";
    /**
     * The constant MENSUAL.
     */
    public static final String MENSUAL = "Mensual";
    /**
     * The constant EXPIRACION.
     */
    public static final String EXPIRACION = "Al vencimiento";

    public static final String CODIGO_TRANSACCION_ACH = "0638";

    public static final String TRANSACTION_CODE_BANCOLOMBIA_SAVING = "0538";

    public static final String TRANSACTION_CODE_BANCOLOMBIA_CURRENT = "0438";

    public static final String TRANSACTION_CODE_TO_FUNDS_SAVING = "0539";

    public static final String TRANSACTION_CODE_TO_FUNDS_CURRENT = "0439";

    public static final String TRANSACTION_CODE_FROM_FUNDS_SAVING = "0549";

    public static final String TRANSACTION_CODE_FROM_FUNDS_CURRENT = "0449";

    public static final String TRANSACTION_CODE_FUNDS = "1100";

    public static final String TRANSACTION_CODE_INSCRIPTION_BANCOLOMBIA = "0485";

    public static final String TRANSACTION_CODE_INSCRIPTION_OTHER_BANK = "0486";

    public static final String TRANSACTION_TYPE_INSCRIPTION = "Inscriptions";

    public static final String TRANSACTION_TYPE_CONSULT_DETAIL = "Consult detail";

    public static final String TRANSACTION_CODE_CONSULT_DETAIL_CREDIT_CARDS = "1260";

    public static final String DECIMAL_DOT = ".00";

    public static final String DECIMAL = "00";

    public static final String CODIGO_OPETACION_TRANSFERENCIA = "120";

    public static final String VERIFIED_ACCOUNT_STATUS = "V";

    public static final String DESCRIPTION_VERIFIED_ACCOUNT = "VERIFICADA";

    public static final String INSCRIPTION_OPERATE_CODE = "300";

    private AdministradorConstante() {

        throw new IllegalStateException(TipoClaseConstante.CLASE_CONSTANTE);
    }

}
