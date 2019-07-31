#language: es

Característica: Pago de tarjetas de crédito no propias

  Esquema del escenario: Pago de tarjetas de crédito no propias
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Cuando quiere ingresar desde PAGAR_TARJETAS_DE_CREDITO_Y_CREDITOS con el documento <usuario> con clave <clave>
    Y quiere pagar la tarjeta de crédito no propia
      |    numeroTarjeta   | tipoPago   | valorPago   | moneda| tipoCuenta   | numeroCuenta   |
       | <numeroTarjeta> | <tipoPago> | <valorPago> | <moneda> |<tipoCuenta> | <numeroCuenta> |
    #Entonces el deberia de ver un mensaje de confirmación
    Y cierra sesión en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario        | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuevoUser   | correoUsuario     |  numeroTarjeta | tipoPago                 | valorPago |moneda| tipoCuenta | numeroCuenta |
   ##@externaldata@./src/test/resources/datadriven/tarjetacredito/TarjetaCreditoNoPropia.xlsx@Datos@2
   |2   |1010111   |1   |userrobot2   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |pruebasqa99   |jalzate@todo1.net   |345555555558888   |Otro valor   |120000   |Dólares   |Corriente   |406-132280-01|
