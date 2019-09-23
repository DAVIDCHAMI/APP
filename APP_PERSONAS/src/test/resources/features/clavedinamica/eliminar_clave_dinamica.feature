#language: es

  Característica: Eliminar clave dinamica

    Esquema del escenario: Inscripcion clave dinamica exitoso
      Dado que el Actor se autentica en la app
        | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
        | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
      Cuando el actor quiere GESTIONAR_CLAVE_DINAMICA
      Y quiere eliminar su clave dinamica con nombre personalizado <nombrePersonalizado>
      Entonces Yo mensaje exitoso de eliminación clave dinamica
      Y cierra sesion en la app
      Ejemplos:
        | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nombrePersonalizado |
   ##@externaldata@./src/test/resources/datadriven/clavedinamica/GestionarClaveDinamica.xlsx@Eliminar@1
   |1   |67652517   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Robot9|