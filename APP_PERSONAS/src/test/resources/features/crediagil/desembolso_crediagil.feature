#language: es

Característica: Desembolso de crediagil

  Esquema del escenario: Desembolso de crediagil
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere DESEMBOLSAR_CREDIAGIL
    Y realiza el desembolso de su crediagil por valor <valorDesembolso> a la cuenta <tipoCuenta> numero <numeroCuenta>
    Entonces deberia de ver el mensaje de desembolso realizado correctamente
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario      | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | valorDesembolso |
   ##@externaldata@./src/test/resources/datadriven/crediagil/DesembolsoCrediagil.xlsx@Datos@
   |1   |43024987   |1   |pruebauser01   |6789   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Corriente   |406-182800-02   |12000|
