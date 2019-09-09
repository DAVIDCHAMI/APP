#language: es

Característica: Activacion eprepago en la app OSP Bancolombia
  Como usuario de Bancolombia
  Quiero activar una tarjeta eprepago
  Para realizar compras

  Esquema del escenario: Activacion de tarjeta eprepago desde la app de Bancolombia OSP por mis productos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere <opcionAutenticacion>
    Y quiero activar una tarjeta e-Prepago
    Entonces Debo ver el mensaje de activacion exitosa

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/e-prepago/activacion_eprepago.xlsx@Datos@1
   |1   |44832981   |1   |pruebasregistro30   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |CONSULTAR_PRODUCTO|
