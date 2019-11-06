#language: es
Característica: Realizar avances de tarjeta de credito

  Esquema del escenario: Realizar un anvance de tarjeta de credito con codigo de seguridad de 3 digitos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance de su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad |monto|
      | <numeroTarjeta> | <codigoSeguridad> |<monto>|
    #    #Entonces se valida el avance exito
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@1
   |1   |48349402   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Master Card Clásica    |123|


  Esquema del escenario: Realizar un anvance de tarjeta de credito con codigo de seguridad de 4 digitos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance de su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad |monto|
      | <numeroTarjeta> | <codigoSeguridad> |<monto>|
    #Entonces se valida el avance exito
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@2
   |2   |48349402   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234|
