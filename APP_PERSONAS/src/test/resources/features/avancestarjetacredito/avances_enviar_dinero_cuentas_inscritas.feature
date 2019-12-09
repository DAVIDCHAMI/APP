#language: es
Característica: Realizar Avances de Tarjeta de credito

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta   | codigoSeguridad   | montoAvance   | numeroTarjetaDestino   |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      | mensajeConfirmacion   | mensajeAvanceNoExitoso   |
      | <mensajeConfirmacion> | <mensajeAvanceNoExitoso> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@1
      |1|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|250000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con valor minimo permitido
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta   | codigoSeguridad   | montoAvance   | numeroTarjetaDestino   |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      | mensajeConfirmacion   | mensajeAvanceNoExitoso   |
      | <mensajeConfirmacion> | <mensajeAvanceNoExitoso> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@3
      |3|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*6889|1234|50000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con cupo total de la tarjeta
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta   | codigoSeguridad   | montoAvance   | numeroTarjetaDestino   |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      | mensajeConfirmacion   | mensajeAvanceNoExitoso   |
      | <mensajeConfirmacion> | <mensajeAvanceNoExitoso> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@5
      |5|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|3000000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|

  Esquema del escenario: Realizar avance exitoso con tarjeta de credito en una cuenta inscrita con cupo intermedio
    Dado que el Actor se autentica en la app
      | ID   | numeroDocumento   | tipoDocumento   | usuario   | clave   | segundaClave   | orientacion   | codigoError   | codigoTransaccion   | resultadoEsperado   | primeraPregunta   | validarClave   |
      | <ID> | <numeroDocumento> | <tipoDocumento> | <usuario> | <clave> | <segundaClave> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <primeraPregunta> | <validarClave> |
    Cuando el actor quiere TRANSFERIR_DINERO
    Y el envia dinero a una cuenta inscrita
      | numeroTarjeta   | codigoSeguridad   | montoAvance   | numeroTarjetaDestino   |
      | <numeroTarjeta> | <codigoSeguridad> | <montoAvance> | <numeroTarjetaDestino> |
    Entonces se valida el avance exitoso
      | mensajeConfirmacion   | mensajeAvanceNoExitoso   |
      | <mensajeConfirmacion> | <mensajeAvanceNoExitoso> |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario   | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave | numeroTarjeta | codigoSeguridad | montoAvance | numeroTarjetaDestino | mensajeConfirmacion | mensajeAvanceNoExitoso |
      ##@externaldata@./src/test/resources/datadriven/avacestarjetacredito/Avances.xlsx@Datos@6
      |6|48349402|1|testing10|1234|4321|Acierto|000|0369|NO ERROR|bolp|ACTIVO|*8078|123|1500000|406-139740-01|¡Avance exitoso!|Cupo insuficiente|
