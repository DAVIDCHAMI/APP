#language: es
Característica: Realizar Avances de Tarjeta de credito

  Esquema del escenario: Avance no exitoso con sobrecupo

    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero desde su tarjeta de credito con monto sobrecupo
      | numeroTarjeta  | codigoSeguridad | montoAvance |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> |
    Entonces se valida el avance no exitoso
      |mensajeAvanceNoExitoso|
      |<mensajeAvanceNoExitoso>|

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | mensajeAvanceNoExitoso|
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@DatosAvanceNoExitoso@1
   |1   |48349402   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234   |150000000   |Cupo insuficiente|
