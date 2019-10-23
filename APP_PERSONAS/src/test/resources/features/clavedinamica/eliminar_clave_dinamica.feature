#language: es

Característica: Eliminar clave dinamica
  Yo como usuario Bancolombia
  Quiero eliminar mi clave dinamica
  Para inscribir otra clave dinamica

  Esquema del escenario: Eliminación clave dinamica exitoso
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere GESTIONAR_CLAVE_DINAMICA
    Y quiere eliminar su clave dinamica con nombre personalizado <nombrePersonalizado>
    Entonces Deberia de ver el mensaje de eliminación exitosa
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombrePersonalizado |
      ##@externaldata@./src/test/resources/datadriven/clavedinamica/GestionarClaveDinamica.xls@Eliminar@1