#language: es

Característica: Bloqueo de tarjetas
  Yo como usuario Bancolombia
  Quiero bloquear una tarjeta
  Por motivos de seguridad

  @RutaCritica
  Esquema del escenario: Bloqueo de tarjetas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BLOQUEAR_TARJETAS
    Y quiere bloquear la tarjeta <tipoTarjeta> con numero <numeroTarjeta>
    Entonces el deberia ver el mensaje de bloqueo exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoTarjeta | numeroTarjeta |
     ##@externaldata@./src/test/resources/datadriven/bloqueos/Bloqueo.xlsx@Datos@5
      |5|949492|5|bloqueotarjetas01|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|Maestro|*9492|

