#language: es

Característica: Cargar tarjeta virtual ePrepago
  Yo como usuario de la app Personas Bancolombia quiero cargar mi tarjeta virtual ePrepago para tener saldo

  Esquema del escenario: Carga exitosa a tarjeta virtual ePrepago activa
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere CARGAR_EPREPAGO
    Y quiere cargar una tarjeta virtual ePrepago activa
      | valorRecarga   | opcionSubmenu   |
      | <valorRecarga> | <opcionSubmenu> |
    Entonces el deberia de ver un mensaje de carga de tarjeta virtual ePrepago exitosa
    Y cierra sesion en la app
    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | valorRecarga | opcionSubmenu |
  ##@externaldata@./src/test/resources/datadriven/e-prepago/cargar_tarjeta_virtual_eprepago.xlsx@Datos@1
   |1   |48313974   |1   |autotest27   |1234   |4321   |Acierto   |000   |0369   |NO ERROR   |bolp   |ACTIVO   |10000   |Recargar|
