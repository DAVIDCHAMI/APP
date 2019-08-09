#language: es

Característica: Inscripción de facturas

  Esquema del escenario: Inscribir facturas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere INSCRIBIR_FACTURAS
    Cuando inscribe una factura
      | empresa   | descripcion   | referencia   |
      | <empresa> | <descripcion> | <referencia> |
#Entonces deberia ver el mensaje de confirmación
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | empresa | descripcion | referencia |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/InscribirFacturas.xlsx@Datos@1
   |1   |22483228   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |movistar   |descripcion 1   |referencia 1|
