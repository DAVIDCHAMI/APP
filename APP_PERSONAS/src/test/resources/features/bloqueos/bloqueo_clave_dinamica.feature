#language: es

Característica: Bloqueo de clave dinámica

  Esquema del escenario: bloqueo de clave dinámica
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GESTIONAR_CLAVE_DINAMICA
    Y bloquea la clave dinámica
    Entonces visualiza el mensaje de bloqueo exitoso
    Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Autenticacion.xlsx@Transaccion@2
      | 2  | 22483228        | 1             | userrobot2 | 1234  | 4321         | Acierto     | 000         | 0369              | NO ERROR          | bolp            | ACTIVO       |
