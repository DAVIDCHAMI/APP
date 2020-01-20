#language: es

Característica: Consulta de detalle de inversion virtual
  Como usuario de Bancolombia
  Quiero consultar el detalle de mis inversiones
  Para visualizar el detalle de mi inversion

  @RutaCritica
  Esquema del escenario: Consulta de detalle de tarjeta de inversion
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y consulto el detalle de inversion con <tipoCuenta> y con numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi inversion
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta                | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductos.xlsx@Inversiones@1
      |1|999999|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|fiducuenta|0007000302095|
