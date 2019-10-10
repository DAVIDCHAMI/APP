#language: es

Característica: Solicitar tarjeta virtual eprepago en la app OSP Bancolombia
  Como usuario de Bancolombia
  Quiero solicitar una tarjeta virtual eprepago
  Para realizar compras

  Esquema del escenario: Solicitud de una tarjeta virtual eprepago desde la app de Bancolombia OSP por diferentes opciones
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere <opcionAutenticacion>
    Y quiero solicitar una tarjeta e-prepago
    Entonces Debo ver el mensaje de solicitud exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/e-prepago/eprepago.xlsx@Datos@1
   |1   |333333304   |1   |autotest32   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |EPREPAGO|

  @manual
  Esquema del escenario: Solicitud de un cliente que ya tiene tarjeta eprepago
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere <opcionAutenticacion>
    Entonces Debo ver el mensaje respectivo para el usuario
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/e-prepago/eprepago.xlsx@Datos@2
   |2   |93221452   |1   |autotest27   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |EPREPAGO|
