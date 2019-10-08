#language: es

Característica:Pagar facturas programadas
  Como usuario de Bancolombia
  Quiero pagar mi factura programada

  Esquema del escenario: Pagar todas las facturas asociadas programadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PAGAR_FACTURA
    Cuando el actor realizar el pago de sus facturas programadas con opcion <opcion>
      | empresaServicio   | fechaFactura   | valorFactura   |
      | <empresaServicio> | <fechaFactura> | <valorFactura> |
    Entonces deberia ver el detalle de su factura programada

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura |referencia   | fechaVencimiento   | valorPagar   |opcion|
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/ConsultaDetalleFactura.xlsx@Datos@2

  Esquema del escenario: Pagar todas las factura programadas con una referencia
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PAGAR_FACTURA
    Cuando el actor realizar el pago de sus facturas programadas con opcion <opcion>
      | empresaServicio   | fechaFactura   | valorFactura   | referencia   | fechaVencimiento   | valorPagar   |
      | <empresaServicio> | <fechaFactura> | <valorFactura> | <referencia> | <fechaVencimiento> | <valorPagar> |
    Entonces deberia ver el detalle de su factura programada

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura |referencia   | fechaVencimiento   | valorPagar   |opcion|
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/PagarFacturas.xlsx@Datos@2