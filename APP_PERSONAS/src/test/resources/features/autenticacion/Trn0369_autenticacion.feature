#language: es

Característica: Autenticación app Bancolombia
  Como usuario de Bancolombia
  Quiero ingresar usuario y contraseña
  Para autenticarme en la aplicación

  @LoginFallido
  Esquema del escenario: Logueo fallido a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado del logueo fallido
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
      | 2  | 1037655531      | 1             | userqa10 | 1111  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |

  @LoginUserBloqueado
  Esquema del escenario: Logueo con usuario bloqueado a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado del logueo con usuario bloqueado
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
      | 3  | 95400152      | 1             | sandrita69 | 1234  | 4321         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |

  @LoginExitoso
  Esquema del escenario: Acceso exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado de la autenticacion exitosa
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos
      | 1  | 1037655531      | 1             | userqa10 | 1234  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |

  @LoginExitoso4
  Esquema del escenario: Acceso exitoso a la aplicacion de Bancolombia OSP
    Dado que el Actor carga los datos para la prueba
      | <ID> | <orientacion> | <codigoError> | <codigoTransaccion> | <resultadoEsperado> | <tipoDocumento> | <numeroDocumento> | <segundaClave> | <primeraPregunta> | <validarClave> |
    Y quiero CONSULTAR_PRODUCTO del usuario <usuario> con clave <clave>
    Entonces verifico el resultado de la autenticacion exitosa
    Y Verifico los resultados en los archivos de iseries
      | LOG CANAL-COMFFLGWWW |

    Ejemplos:
      | ID | numeroDocumento | tipoDocumento | usuario  | clave | segundaClave | orientacion | codigoError | codigoTransaccion | resultadoEsperado | primeraPregunta | validarClave |
   ##@externaldata@./src/test/resources/datadriven/autenticacion/Trn_0369Autenticacion.xlsx@Datos@4
      | 4  | 58156994      | 1             | invictus01 | 1234  | 3221         | bolp        | ACTIVO      | Acierto           | 000               | 0369            | NO ERROR     |