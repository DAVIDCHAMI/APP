 #language: es

Característica: Editar programacion de facturas
  Como usuario de Bancolombia
  Quiero modificar una factura
  Para tener un control de pagos posteriores

  Esquema del escenario: Modificar facturas programadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
    Cuando el actor modifica sus facturas programadas por la opcion <opcionModificacion>
      | valorFactura   | empresaServicio   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | frecuenciaPago   | fechaInicioFin   |
      | <valorFactura> | <empresaServicio> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <frecuenciaPago> | <fechaInicioFin> |
    Entonces deberia ver el mensaje de modificacion exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura | numeroCuenta  | tipoCuenta         | periodicidad               | frecuenciaPago | fechaInicioFin | opcionModificacion |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EditarProgramacion.xlsx@Datos@1
   |1   |48646663   |1   |autotest11   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |10.000,00   |FACTURANET01   |15 Feb 2019   |406-166630-04   |Cuentas corrientes   |En la fecha de vencimiento   |Semanal   |9-12   |Producto origen|

  Esquema del escenario: Modificar facturas programadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
    Cuando el actor modifica sus facturas programadas por la opcion <opcionModificacion>
      | valorFactura   | empresaServicio   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | frecuenciaPago   | fechaInicioFin   |
      | <valorFactura> | <empresaServicio> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <frecuenciaPago> | <fechaInicioFin> |
    Entonces deberia ver el mensaje de modificacion exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura | numeroCuenta  | tipoCuenta         | periodicidad               | frecuenciaPago | fechaInicioFin | opcionModificacion |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EditarProgramacion.xlsx@Datos@2
