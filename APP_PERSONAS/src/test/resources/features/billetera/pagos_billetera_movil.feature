#language: es

Característica: Realizar pagos con QR atraves de Billetera Movil
  Como usuario de Bancolombia
  Quiero tener billetera movil
  Para realizar pagos con QR

  Esquema del escenario: Pago QR estatico con usuario no registrado usando masterdebit
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor ingresa a BILLETERA_MOVIL para realizar el registro
    Y realiza una compra con QR estatico
      | establecimiento   | tipoTarjeta   | numeroTarjeta   | subtotal   | iva   | inc   | propina   | totalPagar   |
      | <establecimiento> | <tipoTarjeta> | <numeroTarjeta> | <subtotal> | <iva> | <inc> | <propina> | <totalPagar> |
    Entonces El deberia ver el mensaje de que su pago fue exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Pago QR estatico con usuario no registrado usando debito maestro
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor ingresa a BILLETERA_MOVIL para realizar el registro
    Y realiza una compra con QR estatico
      | establecimiento   | tipoTarjeta   | numeroTarjeta   | subtotal   | iva   | inc   | propina   | totalPagar   |
      | <establecimiento> | <tipoTarjeta> | <numeroTarjeta> | <subtotal> | <iva> | <inc> | <propina> | <totalPagar> |
    Entonces El deberia ver el mensaje de que su pago fue exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Pago QR estatico con usuario registrado usando masterdebit
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Y realiza una compra con QR estatico
      | establecimiento   | tipoTarjeta   | numeroTarjeta   | subtotal   | iva   | inc   | propina   | totalPagar   |
      | <establecimiento> | <tipoTarjeta> | <numeroTarjeta> | <subtotal> | <iva> | <inc> | <propina> | <totalPagar> |
    Entonces El deberia ver el mensaje de que su pago fue exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Pago QR estatico con usuario registrado usando masterdebit
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Y realiza una compra con QR estatico
      | establecimiento   | tipoTarjeta   | numeroTarjeta   | subtotal   | iva   | inc   | propina   | totalPagar   |
      | <establecimiento> | <tipoTarjeta> | <numeroTarjeta> | <subtotal> | <iva> | <inc> | <propina> | <totalPagar> |
    Entonces El deberia ver el mensaje de que su pago fue exitoso
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|
