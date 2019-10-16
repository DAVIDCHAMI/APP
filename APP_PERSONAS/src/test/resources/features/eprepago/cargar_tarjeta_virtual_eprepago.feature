#language: es

Característica: Cargar tarjeta virtual ePrepago
  Yo como usuario de la app Personas Bancolombia quiero cargar mi tarjeta virtual ePrepago para tener saldo

  @Manual:Passed
  Esquema del escenario: Carga exitosa a tarjeta virtual ePrepago activa
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y cargar una tarjeta virtual e-Prepago activa por valor de <valorRecarga>
      | tipoCuenta   | numeroCuenta   |
      | <tipoCuenta> | <numeroCuenta> |
    Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
  ##@externaldata@./src/test/resources/datadriven/e-prepago/cargar_tarjeta_virtual_eprepago.xlsx@Datos@1
   |1   |93221450   |1   |autotest25   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |1000000   |Ahorros   |406-714500-19|

  @Manual:Passed
  Esquema del escenario: Carga a tarjeta virtual ePrepago inactiva
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiere cargar una tarjeta virtual e-Prepago inactiva por valor de <valorRecarga>
      | tipoCuenta   | numeroCuenta   |
      | <tipoCuenta> | <numeroCuenta> |
    Entonces el deberia ver un mensaje carga no realizada
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
    ##@externaldata@./src/test/resources/datadriven/e-prepago/cargar_tarjeta_virtual_eprepago.xlsx@Datos@2
   |1   |93221450   |1   |autotest25   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |3000000   |Ahorros   |406-739740-05|

  Esquema del escenario: Carga a tarjeta virtual ePrepago sobre el valor maximo permitido
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CONSULTAR_PRODUCTO
    Y quiere cargar una tarjeta virtual e-Prepago sobre el valor maximo por valor de <valorRecarga>
      | tipoCuenta   | numeroCuenta   |
      | <tipoCuenta> | <numeroCuenta> |
    Entonces el deberia ver un mensaje de monto para cargar no permitido
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | tipoCuenta | numeroCuenta  |
    ##@externaldata@./src/test/resources/datadriven/e-prepago/cargar_tarjeta_virtual_eprepago.xlsx@Datos@2
   |1   |93221450   |1   |autotest25   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |3000000   |Ahorros   |406-739740-05|