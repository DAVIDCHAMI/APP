#language: es

Característica:Pagar facturas programadas
  Como usuario de Bancolombia
  Quiero pagar mi factura programada

  Esquema del escenario: Pagar facturas programadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PAGAR_FACTURA
    Cuando el actor realizar el pago de sus facturas programadas
      | empresaServicio   | fechaFactura   | valorFactura   |
      | <empresaServicio> | <fechaFactura> | <valorFactura> |
    Entonces deberia ver el detalle de su factura programada

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura      |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/ConsultaDetalleFactura.xlsx@Datos@2
   |2   |48646663   |1   |recaudosnatik66   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |55.500,05   |8415   |05 Abr 2020|