 #language: es

 Característica: Editar programacion de facturas
   Como usuario de Bancolombia
   Quiero modificar una factura
   Para tener un control de pagos posteriores

   @RutaCritica
   Esquema del escenario: Modificar facturas programadas por producto origen
     Dado que el Actor se autentica en la app
       | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
       | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
     Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
     Cuando el actor modifica sus facturas programadas por la opcion <opcionModificacion> y filtrando por <filtroBusqueda>
       | valorFactura   | empresaServicio   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | numeroIntento   | fechaInicio   | fechaFin   | mesProgramacion   |
       | <valorFactura> | <empresaServicio> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <numeroIntento> | <fechaInicio> | <fechaFin> | <mesProgramacion> |
     Entonces deberia ver el mensaje de modificacion exitosa
     Ejemplos:
       | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura | numeroCuenta  | tipoCuenta | periodicidad               | numeroIntento | fechaInicio | fechaFin | mesProgramacion | opcionModificacion | filtroBusqueda |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EditarProgramacion.xlsx@Datos@1
      |1|48646663|1|recaudosnatik66|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|$ 10.000,00|CONVENIO ADHOC WMB REF1 - 65442|Fecha de vencimiento: No disponible|406-158990-01|Corriente|En la fecha de vencimiento|2|16|18|Octubre|Producto origen|programada|

   Esquema del escenario: Modificar facturas programadas
     Dado que el Actor se autentica en la app
       | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
       | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
     Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
     Cuando el actor modifica sus facturas programadas por la opcion <opcionModificacion> y filtrando por <filtroBusqueda>
       | valorFactura   | empresaServicio   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | numeroIntento   | fechaInicio   | fechaFin   | mesProgramacion   |
       | <valorFactura> | <empresaServicio> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <numeroIntento> | <fechaInicio> | <fechaFin> | <mesProgramacion> |
     Entonces deberia ver el mensaje de modificacion exitosa
     Ejemplos:
       | ID | numeroDocumento | tipoDocumento | usuario         | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio | fechaFactura | numeroCuenta  | tipoCuenta | periodicidad               | numeroIntento | fechaInicio | fechaFin | mesProgramacion | opcionModificacion | filtroBusqueda |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EditarProgramacion.xlsx@Datos@2
      |2|48646663|1|recaudosnatik66|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|$ 10.000,00|CONVENIO ADHOC WMB REF1 - 65442|05 Abr 2020|406-158990-01|Corriente|En la fecha de vencimiento|3|16|18|Octubre|Periodicidad|programada|
