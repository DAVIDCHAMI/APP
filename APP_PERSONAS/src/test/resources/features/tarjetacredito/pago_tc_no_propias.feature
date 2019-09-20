#language: es

Característica: Pago de tarjetas de credito no propias
  Yo como usuario de Bancolombia
  Quiero realizar el pago de una tarjeta de credito no propia
  Para saldar las deudas externas

  Esquema del escenario: Pago de tarjetas de credito no propias
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere PAGAR_TARJETAS_DE_CREDITO_NO_PROPIAS
    Y quiere pagar la tarjeta de crédito no propia
      | numeroTarjeta   | tipoPago   | valorPago   | moneda   | tipoCuenta   | numeroCuenta   |
      | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> | <tipoCuenta> | <numeroCuenta> |
    Entonces deberia de ver el mensaje de confirmación y la información de su pago
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     | numeroTarjeta    | tipoPago              | valorPago | moneda  | tipoCuenta | numeroCuenta  |
   ##@externaldata@./src/test/resources/datadriven/tarjetacredito/TarjetaCreditoNoPropia.xlsx@Datos@
   |1   |67652517   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |4444444444444444   |Otro valor   |80000   |Pesos   |Corriente   |406-125170-00|
   |2   |67652517   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |345555555558888   |Otro valor   |120000   |Dólares   |Corriente   |406-125170-00|
   |3   |67652517   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |5326666666666666   |Pago total en dólares   |0,00   |Dólares   |Corriente   |406-125170-00|
   |4   |67652517   |1   |autotest10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |5326666666666666   |Pago mínimo en pesos   |0,00   |Pesos   |Corriente   |406-125170-00|
    
