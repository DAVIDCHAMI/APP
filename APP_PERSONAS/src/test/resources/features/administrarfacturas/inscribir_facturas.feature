#language: es

Característica: Inscripción de facturas

  Esquema del escenario: Inscribir facturas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere INSCRIBIR_FACTURAS
    Cuando inscribe una factura
      | convenio   | descripcionFactura   | referencia   |
      | <convenio> | <descripcionFactura> | <referencia> |
    Entonces deberia ver el mensaje de confirmacion
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | convenio | descripcionFactura | referencia |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/InscribirFacturas.xlsx@Datos@1
   |1   |22483228   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |65401   |descripcion 1   |8419|
