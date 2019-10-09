 #language: es

 Característica: Historico de pago en programacion de facturas
   Como usuario de Bancolombia
   Quiero ver mi historial de pagos
   Para tener un control de pagos posteriores

   Esquema del escenario: Historico de pagos
     Dado que el Actor se autentica en la app
       | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
       | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
     Y el actor quiere VER_HISTORICO_PAGOS
     Cuando el actor ingresa al historico de pagos
     Entonces deberia ver el historico de pagos

     Ejemplos:
       | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | opcionAutenticacion |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Datos@7
   |7   |22493944   |1   |recaudosnatik66   |1234   |4321   |Alterno   |607   |0369   |NO ERROR   |bolp   |ACTIVO   ||
