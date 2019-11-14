#language: es
Característica: Realizar Avances de Tarjeta de credito

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@1
      |1   |48349402   |1   |TUTAINABANCOLOMBIA10 |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234   |250000   |406-110100-01   |¡Avance exitoso!|  Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con valor minimo permitido
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@3
      |1   |48349402   |1   |TUTAINABANCOLOMBIA10 |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234   |250000   |406-110100-01   |¡Avance exitoso!|  Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con cupo total de la tarjeta
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@5
      |1   |48349402   |1   |TUTAINABANCOLOMBIA10 |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234   |250000   |406-110100-01   |¡Avance exitoso!|  Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con cupo intermedio
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@6
      |1   |48349402   |1   |TUTAINABANCOLOMBIA10 |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234   |250000   |406-110100-01   |¡Avance exitoso!|  Cupo insuficiente|

