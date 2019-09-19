#language: es

Característica: Contraordenar cheques como usario Bancolombia

  Esquema del escenario: Contraordenar cheques
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Y el actor contraordena su cheque con informacion
      | tipoCuenta   | numeroCuenta   | tipoContraordenacion   | numeroCheque   | rangoDesde   | rangoHasta   |
      | <tipoCuenta> | <numeroCuenta> | <tipoContraordenacion> | <numeroCheque> | <rangoDesde> | <rangoHasta> |
    Entonces El deberia ver contraordenación de su cheque exitoso
    Y cierra sesion en la app
    #Y Verifico los resultados en los archivos de iseries
      #| LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario     | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque | rangoDesde | rangoHasta |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@2
   |2   |1010111   |Cédula de ciudadanía   |zcreditos10   |1234   |4321   |Alterno   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-158690-06   |Rango de cheques    |2   |3211   |3216|
