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
    Cuando el actor modifica sus facturas programadas por la opcion <opcionModificacion>
      | valorFactura   | empresaServicio   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | frecuenciaPago   | fechaInicioFin   |
      | <valorFactura> | <empresaServicio> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <frecuenciaPago> | <fechaInicioFin> |
    Entonces debería ver el mensaje de modificación exitosa
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | empresaServicio                   | fechaFactura | numeroCuenta  | tipoCuenta         | periodicidad               | frecuenciaPago | fechaInicioFin | opcionModificacion |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/EditarProgramacion.xlsx@Datos@1
   |1   |1037655531   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |10.000,00   |FUNERARIA SAGRADO CORAZON (N)   |15 Feb 2019   |406-139440-00   |Cuentas corrientes   |En la fecha de vencimiento   |Semanal   |9-12   |Poducto origen|