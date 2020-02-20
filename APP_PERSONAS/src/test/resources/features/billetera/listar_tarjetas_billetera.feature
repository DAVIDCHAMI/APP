#language: es

Característica: Listar tarjetas de Billetera Movil (Escenarios alternos)
  Como usuario de Bancolombia
  Quiero tener billetera movil
  Para ver mis tarjetas listadas

  Esquema del escenario: Listar tarjetas sin cuenta principal
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Entonces El deberia ver el mensaje con codigo de error XXXX
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Listar tarjetas - Tarjeta no cumple con el algoritmo de Luhn
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Entonces El deberia ver el mensaje con codigo de error XXXX
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Listar tarjetas - Tarjeta sin cuentas asociadas
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Entonces El deberia ver el mensaje con codigo de error XXXX
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Listar tarjetas - Tarjeta Bloqueada
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Entonces El deberia ver el mensaje con codigo de error XXXX
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Listar tarjetas - Tarjeta con saldo negativo
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Entonces El deberia ver el mensaje con codigo de error XXXX
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|

  Esquema del escenario: Realizar pagos con una cuenta que no permite debitos
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere BILLETERA_MOVIL
    Y realiza una compra con QR estatico
      | establecimiento   | tipoTarjeta   | numeroTarjeta   | subtotal   | iva   | inc   | propina   | totalPagar   |
      | <establecimiento> | <tipoTarjeta> | <numeroTarjeta> | <subtotal> | <iva> | <inc> | <propina> | <totalPagar> |
    Entonces El deberia ver el mensaje de que su cuenta no permite debitos
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario    | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | establecimiento | tipoTarjeta | numeroTarjeta | subtotal | iva | inc | propina | totalPagar |
   ##@externaldata@./src/test/resources/datadriven/billetera/billetera.xlsx@Datos@1
      |1|18085114|1|billetera9|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|a|a|a|a|a|a|a|a|
