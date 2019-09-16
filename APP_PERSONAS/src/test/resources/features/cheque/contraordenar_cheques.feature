#language: es

  Característica: Contraordenar cheques como usario Bancolombia

    Esquema del escenario: Contraordenar cheques
      Dado que el Actor se autentica en la app
        | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
        | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
      Cuando el actor quiere CONTRAORDENAR_CHEQUE
      Y el actor contraordena su cheque con tipo cuenta <tipoCuenta> y numero cuenta <numeroCuenta>
      Entonces El deberia de ver el mensaje La cuenta no tiene movimientos
      Y cierra sesion en la app
    #Y Verifico los resultados en los archivos de iseries
      #| LOG CANAL-COMFFLGWWW | Saldo Depositos Detalle-SCIFFSALDO_DETALLE |
      Ejemplos:
        | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/consultas/movimientos/ConsultaMovimientos.xlsx@Depositos@2