#language: es

Característica: Bloqueos en la app

  Esquema del escenario: Bloqueo de tarjetas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_TARJETAS
    Y quiere bloquear la tarjeta <tipoTarjeta> con número <numeroTarjeta>
    #Entonces el deberia ver el mensaje de bloqueo exitoso
    #Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta     |
   ##@externaldata@./src/test/resources/datadriven/bloqueo/Bloqueo.xlsx@Datos@1
   |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Visa   |8337|

  Esquema del escenario: Bloqueo de clave
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_TARJETAS
    Y quiere bloquear la clave
    #Entonces el deberia ver el mensaje de bloqueo exitoso
    #Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta     |
   ##@externaldata@./src/test/resources/datadriven/bloqueo/Bloqueo.xlsx@Datos@1
      |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Visa   |8337|

  Esquema del escenario: Bloqueo de clave y tarjetas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_TARJETAS
    Y quiere bloquear la clave y tarjetas
    #Entonces el deberia ver el mensaje de bloqueo exitoso
    #Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta     |
   ##@externaldata@./src/test/resources/datadriven/bloqueo/Bloqueo.xlsx@Datos@1
      |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Visa   |8337|

  Esquema del escenario: Bloqueo de clave dinámica
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_TARJETAS
    Y quiere bloquear la clave dinámica
    #Entonces el deberia ver el mensaje de bloqueo exitoso
    #Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta     |
   ##@externaldata@./src/test/resources/datadriven/bloqueo/Bloqueo.xlsx@Datos@1
      |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Visa   |8337|

