#language: es

Característica: Consulta de movimientos de E prepago de un cliente en app Bancolombia
  Como usuario de Bancolombia
  Quiero Ingresar a saldos y movimientos
  Para conocer sus movimientos de mi E prepago

  @RutaCritica
  Esquema del escenario: Consultar Movimientos de una E-prepago
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiero revisar mis movimientos de eprepago en la app con tipo de cuenta <tipoCuenta> y numero cuenta <numeroCuenta>
    Entonces El deberia de ver los movimientos asociados a su cuenta
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Eprepago@1
      |1|93221453|1|invictus10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|MasterCard|*9344|
