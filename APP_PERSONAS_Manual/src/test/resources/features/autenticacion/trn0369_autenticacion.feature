#language: es

Característica: Autenticacion usuario en la APP Bancolombia
  Como usuario de Bancolombia
  Quiero autenticarme en la APP con mi usuario y clave
  Para interactuar con el menu de opciones de la aplicacion

  @manual
  Esquema del escenario: Autenticacion del usuario exitosa en la APP
    Dado que <nombre> se encuentra enrolado en la APP
    Cuando ingresa el usuario <usuario> y la clave <clave> en el dispositivo <dispositivo>
    Entonces se verifica que el usuario pudo iniciar sesion
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|nombre|usuario   |clave|dispositivo|
      |1     |Luis  |invictus01|1234 |Android    |
      |2     |Luis  |invictus01|1234 |iOS        |
      |3     |Luis  |invictus01|1234 |Huawei     |

  @manual
  Esquema del escenario: Autenticacion del usuario fallida con clave errada
    Dado que <nombre> se encuentra enrolado en la APP
    Cuando ingresa el usuario <usuario> y la clave <clave> en el dispositivo <dispositivo>
    Entonces se verifica que el sistema presenta un mensaje de error de autenticacion
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|nombre|usuario   |clave|dispositivo|
      |1     |Luis  |invictus01|2354 |Android    |
      |2     |Luis  |invictus01|1362 |iOS        |
      |3     |Luis  |invictus01|3625 |Huawei     |

  @manual
  Esquema del escenario: Autenticacion fallida por Bloqueo de Usuario en la APP
    Dado que <nombre> lleva 3 intentos fallidos de autenticacion en la APP
    Cuando ingresa el usuario <usuario> y la clave <clave> en el dispositivo <dispositivo>
    Entonces se verifica que el sistema presenta un mensaje de acceso bloqueado
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|nombre|usuario   |clave|dispositivo|
      |1     |Luis  |invictus01|1234 |Android    |
      |2     |Luis  |invictus01|1234 |iOS        |
      |3     |Luis  |invictus01|1234 |Huawei     |
