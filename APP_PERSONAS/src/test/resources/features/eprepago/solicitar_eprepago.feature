#language: es

Característica: Solicitud eprepago en la app OSP Bancolombia
  Como usuario de Bancolombia
  Quiero solicitar una tarjeta eprepago
  Para realizar compras

  Esquema del escenario: Solicitud de una tarjeta eprepago desde la app de Bancolombia OSP por diferentes opciones
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Y quiero solicitar una tarjeta e-prepago
    Entonces Debo ver el mensaje de solicitud exitosa

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/e-prepago/eprepago.xlsx@Datos@1
   |1   |928155907   |1   |sineprepago1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |EPREPAGO|

  Esquema del escenario: Solicitud de un cliente que ya tiene tarjeta eprepago
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiero <opcionAutenticacion> del usuario <usuario> con clave <clave>
    Entonces Debo ver el mensaje respectivo para el usuario

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/e-prepago/eprepago.xlsx@Datos@2
   |2   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |EPREPAGO|
