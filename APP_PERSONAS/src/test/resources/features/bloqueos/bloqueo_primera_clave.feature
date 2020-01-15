#language: es

Característica: Bloqueo de primera clave
  Yo como usuario Bancolombia
  Quiero bloquear mi primera clave
  Por motivos de seguridad

  @RutaCritica
  Esquema del escenario: Bloqueo de clave
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_CLAVE
    Y quiere bloquear la clave
    Entonces el deberia ver el mensaje de bloqueo exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta |
   ##@externaldata@./src/test/resources/datadriven/bloqueos/Bloqueo.xlsx@Datos@2
      |2|22483228|2|pruebasregistro49|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|||
