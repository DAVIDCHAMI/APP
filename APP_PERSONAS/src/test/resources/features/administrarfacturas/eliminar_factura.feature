#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para Eliminar una factura

  Esquema del escenario: Eliminar facturas inscrita
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere ELIMINAR_FACTURA
    Cuando el actor elimina sus factura inscritica con la información con opción <opcion>
      | valorFactura   | empresaServicio   | fechaFactura   |
      | <valorFactura> | <empresaServicio> | <fechaFactura> |
    Entonces debería ver el mensaje de eliminación exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio                   | fechaFactura |opcion|
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EliminarFactura.xlsx@Datos@1
   |1   |1037655531   |1   |nuevaapp09   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |  55.700,07   |FACTURANET01    |15 Feb 2019   |Inscritas|
