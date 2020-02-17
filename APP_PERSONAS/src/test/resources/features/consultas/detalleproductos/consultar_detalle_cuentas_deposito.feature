#language: es

Característica: Consulta de detalle cuentas deposito ahorro y corriente
  Como usuario de Bancolombia
  Quiero consultar el detalle de mis cuentas depositos
  Para visualizar el detalle de mis cuentas

  @RutaCritica
  Esquema del escenario: Consulta de detalle de cuenta deposito
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y consulto en Cuentas el detalle de mi Cuenta <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el detalle de mi cuenta de ahorro
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/detalleproductos/ConsultaDetalleProductosDepositos.xlsx@Depositos@1
      |1|22452521|1|pruebauser01|1234|4321|Acierto|000|0360|NO ERROR|bolp|ACTIVO|Corriente|406-182800-02|
