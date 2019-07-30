package co.com.bancolombia.certificacion.app.utilidades.administradores;

import co.com.bancolombia.backend.utilidades.enums.CodigosExcepciones;

import java.util.ResourceBundle;

public class QueryManager {
    public static final ResourceBundle ISERIES = ResourceBundle.getBundle("consultasIseries");
    public static final ResourceBundle ISERIES_TOPES = ResourceBundle.getBundle("consultasIseriesTopes");
    public static final ResourceBundle ISERIES_ALERTAS = ResourceBundle.getBundle("consultasIseriesAlertas");
    public static final ResourceBundle ISERIES_LOGCANAL = ResourceBundle.getBundle("consultasIseriesLogCanal");
    public static final ResourceBundle EXCEL = ResourceBundle.getBundle("consultasExcel");
    public static final ResourceBundle CLOUDANT = ResourceBundle.getBundle("consultasCloudant");
    public static final ResourceBundle CONSULTAS = ResourceBundle.getBundle("consultas");
    public static final ResourceBundle ISERIES_AHORRO_CON_PROPOSITO = ResourceBundle.getBundle("consultaIseriesAhorroConProposito");
    public static final ResourceBundle ISERIES_MERCADO_LIBRE_DIVISAS = ResourceBundle.getBundle("consultasIseriesMercadoLibreDivisas");
    public static final ResourceBundle ISERIES_PSE = ResourceBundle.getBundle("consultasIseriesPse");
    public static final ResourceBundle CONSULTAS_CANALES = ResourceBundle.getBundle("consultasCanales");
    public static final ResourceBundle ISERIES_BATCH = ResourceBundle.getBundle("consultasIseriesBatch");
	public static final ResourceBundle ISERIES_FONDOS = ResourceBundle.getBundle("consultasIseriesFondos");
    public static final ResourceBundle ORACLE_BATCH = ResourceBundle.getBundle("consultasOracle");
    private QueryManager() {
        throw new IllegalStateException(CodigosExcepciones.UTILITY_CLASS.getMsg());
    }
}
