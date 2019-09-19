#language: es

Característica: Eliminar facturas
  Como usuario de Bancolombia
  Quiero eliminar una factura
  Para tener solo facturas inscritas

  Esquema del escenario: Eliminar facturas inscritas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere ELIMINAR_FACTURA
    Cuando el actor elimina su factura con opcion <opcion> e informacion
      | valorFactura   | empresaServicio   | fechaFactura   |
      | <valorFactura> | <empresaServicio> | <fechaFactura> |
    Entonces deberia ver el mensaje de eliminacion exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio      | fechaFactura      | opcion    |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EliminarFactura.xlsx@Datos@1
   |1   |48646663   |1   |autotest11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |55.000,09   |FACTURANET01 - 65401   |Vence 05 Abr 2020   |Inscritas|
