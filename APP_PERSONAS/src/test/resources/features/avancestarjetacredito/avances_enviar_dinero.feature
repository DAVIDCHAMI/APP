#language: es
Característica: Autenticacion app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contrasena
  Para realizar un avance desde un producto origen

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito con codigo de seguridad de 4 digitos
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y ingresa a la opcion tarjeta de credito
      | nuemeroTarjeta  | codigoSeguridad |
      | <nuemeroTarjeta> | <codigoSeguridad> |
    #Y se ingresan los datos de complementarios del avance
     # | monto  |
      #| <monto> |
    #Entonces se valida el avance exito

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuemeroTarjeta | codigoSeguridad |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@3
   |3   |48349402   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |American Express Blu   |1234|


  Esquema del escenario: Realizar avance exitoso con tarjeta de credito con codigo de seguridad de 3 digitos
    Dado que el Actor se autentica en la app
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y ingresa a la opcion tarjeta de credito
      | nuemeroTarjeta  | codigoSeguridad |
      | <nuemeroTarjeta> | <codigoSeguridad> |
    #Y se ingresan los datos de complementarios del avance
     # | monto  |
      #| <monto> |
    #Entonces se valida el avance exito

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion |codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | nuemeroTarjeta | codigoSeguridad |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@4
   |4   |48349402   |1   |testing10   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |Visa Clásica   |123|
