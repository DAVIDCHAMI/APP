#language: es

Característica:Pagar facturas programadas
  Como usuario de Bancolombia
  Quiero pagar mi factura programada

  Esquema del escenario: Pagar todas las facturas inscrita
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PAGAR_FACTURA
    Cuando el actor realizar el pago de sus facturas inscritas
      | empresaServicio   | fechaFactura   | valorFactura   | numeroCuenta   | tipoCuenta   | valorFacturaReferenciaPagar   |
      | <empresaServicio> | <fechaFactura> | <valorFactura> | <numeroCuenta> | <tipoCuenta> | <valorFacturaReferenciaPagar> |
    Entonces deberia ver el pago de su factura inscrita
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura | numeroCuenta  | tipoCuenta | valorFacturaReferenciaPagar |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/PagarFacturaInscrita.xlsx@Datos@1
   |1   |48646663   |1   |recaudosnatik66   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |0,00   |65468   |28 Dic 2019   |406-158990-01   |Corriente   |10,00|
