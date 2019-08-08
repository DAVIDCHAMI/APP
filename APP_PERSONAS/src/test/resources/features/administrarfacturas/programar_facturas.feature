#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  Esquema del escenario: Programar facturas inscritas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Y el actor quiere PROGRAMAR_PAGAR_FACTURAS
    Cuando el actor programa sus facturas inscritas con información
      | valorFactura   | descripcionFactura   | fechaFactura   | numeroCuenta   | tipoCuenta   | periodicidad   | numeroIntento   | fechaInicioFin   |
      | <valorFactura> | <descripcionFactura> | <fechaFactura> | <numeroCuenta> | <tipoCuenta> | <periodicidad> | <numeroIntento> | <fechaInicioFin> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorFactura | descripcionFactura                   | fechaFactura | numeroCuenta  | tipoCuenta         | periodicidad               | numeroIntento | fechaInicioFin |
   ##@externaldata@./src/test/resources/datadriven/administrarfacturas/ProgramarFacturas.xlsx@Datos@1
   |1   |1037655531   |1   |userrobot1   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |100.000,00   |Dos, CONVENIO ADHOC ANDROID REF1 (I)   |15 Feb 2019   |406-139440-02   |Cuentas corrientes   |En la fecha de vencimiento   |1   |7-9|