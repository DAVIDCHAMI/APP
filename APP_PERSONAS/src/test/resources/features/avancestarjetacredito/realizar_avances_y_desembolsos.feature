#language: es
Característica: Realizar avances de tarjeta de credito

  Esquema del escenario: Realizar un anvance de tarjeta de credito con codigo de seguridad de 3 digitos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance desde su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad |montoAvance| numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> |<montoAvance>|<numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad |montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@1
      |1|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|250000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar un anvance de tarjeta de credito con codigo de seguridad de 4 digitos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance desde su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad |montoAvance|numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> |<montoAvance>|<numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@2
      |2|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*6889|1234|150000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito con monto minimo
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance desde su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@1
      |1|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|250000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito con cupo total
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance desde su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion |mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@4
      |4|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|150000000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito con cupo intermedio
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere REALIZAR_AVANCE
    Y el realiza avance desde su tarjeta de credito
      | numeroTarjeta  | codigoSeguridad | montoAvance | numeroTarjetaDestino |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      |mensajeConfirmacion|mensajeAvanceNoExitoso|
      |<mensajeConfirmacion>|<mensajeAvanceNoExitoso>|
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion |mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@6
      |6|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|1500000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|