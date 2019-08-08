#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para modificar programación

  Esquema del escenario: Modificar facturas programadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
    Cuando el actor modifica sus facturas programadas por la opcion <opcion>
     |opcionModificacion | valorFactura   | descripcionFactura   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | numeroIntento   | fechaInicioFin   |
     |<opcionModificacion> | <valorFactura> | <descripcionFactura> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <numeroIntento> | <fechaInicioFin> |
Entonces debería ver el mensaje de modificación exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | descripcionFactura                   | fechaFactura | numeroCuenta  | tipoCuenta         | periodicidad               | numeroIntento | fechaInicioFin |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/ProgramarFacturas.xlsx@Datos@1