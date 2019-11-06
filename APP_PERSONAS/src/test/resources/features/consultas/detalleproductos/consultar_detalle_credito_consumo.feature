#language: es

Característica: Consulta de detalle credito de consumo
  Como usuario de Bancolombia
  Quiero consultar el detalle de mi credito de consumo
  Para visualizar el detalle de mi credito

  @RutaCritica
  Esquema del escenario: Consulta de detalle de credito de consumo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y consulto en Créditos el detalle de mi credito de consumo con <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi credito de consumo
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductos.xlsx@Creditos@1
      |1|1037655531|1|invictus10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|Prestamo personal ta|29281023956|
