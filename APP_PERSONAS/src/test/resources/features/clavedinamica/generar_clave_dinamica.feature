#language: es

Característica: Generar clave dinamica
  Yo como usuario Bancolombia
  Quiero generar mi clave dinamica
  Para poder consultarla para realizar transacciones

  @RutaCritica
  Esquema del escenario: Generacion clave dinamica
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GENERAR_CLAVE_DINAMICA
    Entonces Yo deberia ver la clave dinamica de mi usuario <nombreUsuario>
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombreUsuario   |
   ##@externaldata@./src/test/resources/datadriven/clavedinamica/GestionarClaveDinamica.xlsx@Generar@1
      |1|333333302|1|recaudosnatik66|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|Recaudosnatik|
