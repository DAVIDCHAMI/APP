#language: es

Característica: Contraordenar cheques como usario Bancolombia

  @Manual:Failed
  Esquema del escenario: Contraordenar cheques
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Y el actor contraordena su cheque con informacion
      | tipoCuenta   | numeroCuenta   | tipoContraordenacion   | numeroCheque   |
      | <tipoCuenta> | <numeroCuenta> | <tipoContraordenacion> | <numeroCheque> |
    Entonces El deberia ver contraordenación de su cheque exitoso
    Y cierra sesion en la app
    #Y Verifico los resultados en los archivos de iseries
      #| LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@1
   |1   |1010111   |Cédula de ciudadanía   |testing10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-139740-01   |Cheque   |2|
