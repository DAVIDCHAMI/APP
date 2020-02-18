#language: es

Característica: Contraordenar cheques como usario Bancolombia

  @RutaCritica
  Esquema del escenario: Contraordenar cheques
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Y el actor contraordena su cheque con informacion
      | tipoCuenta   | numeroCuenta   | tipoContraordenacion   | numeroCheque   | rangoDesde   | rangoHasta   |
      | <tipoCuenta> | <numeroCuenta> | <tipoContraordenacion> | <numeroCheque> | <rangoDesde> | <rangoHasta> |
    Entonces El deberia ver contraordenacion de su cheque exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario     | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque | rangoDesde | rangoHasta |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@1
      |1|664775789|Cédula de ciudadanía|marcontra02|6666|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|Corriente|406-101480-06|Cheque|798523|||

  @RutaCritica
  Esquema del escenario: Contraordenar cheques con rango
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Y el actor contraordena su cheque con informacion
      | tipoCuenta   | numeroCuenta   | tipoContraordenacion   | numeroCheque   | rangoDesde   | rangoHasta   |
      | <tipoCuenta> | <numeroCuenta> | <tipoContraordenacion> | <numeroCheque> | <rangoDesde> | <rangoHasta> |
    Entonces El deberia ver contraordenacion de su cheque con rango exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario     | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque | rangoDesde | rangoHasta |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@2
      |2|664775789|Cédula de ciudadanía|marcontra02|6666|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|Corriente|406-101480-06|Rango de cheques ||798524|798525|

  Esquema del escenario: Contraordenar cheques con rango incorrecto
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Y el actor contraordena su cheque con informacion
      | tipoCuenta   | numeroCuenta   | tipoContraordenacion   | numeroCheque   | rangoDesde   | rangoHasta   |
      | <tipoCuenta> | <numeroCuenta> | <tipoContraordenacion> | <numeroCheque> | <rangoDesde> | <rangoHasta> |
    Entonces El deberia ver un mensaje de rango incorrecto
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario       | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque | rangoDesde | rangoHasta |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@3
      |3|664775789|Cédula de ciudadanía|usercheques01|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|Corriente|406-157890-08|Rango de cheques ||65670|65970|

  Esquema del escenario: Contraordenar cheques sin cuenta corriente
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONTRAORDENAR_CHEQUE
    Entonces El deberia ver un mensaje: No tienes cuenta corriente para realizar la contraorden
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento        | usuario           | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | tipoCuenta | numeroCuenta  | tipoContraordenacion | numeroCheque | rangoDesde | rangoHasta |
   ##@externaldata@./src/test/resources/datadriven/cheque/contraordenarcheque.xlsx@Datos@4
      |4|700100|Cédula de ciudadanía|pruebasregistro48|1234|4321|Alterno|000|0369|NO ERROR|bolp|ACTIVO|Corriente|406-157890-08|Rango de cheques ||65670|65970|
