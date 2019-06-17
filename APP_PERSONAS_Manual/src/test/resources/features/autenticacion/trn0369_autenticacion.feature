#language: es

Característica: Autenticacion usuario en la APP Bancolombia
  Como usuario de Bancolombia
  Quiero autenticarme en la APP con mi usuario y clave
  Para interactuar con el menú de opciones de la aplicación

  @manual
  Esquema del escenario: Autenticacion del usuario exitosa en la APP en dispositivo Android
    Dado que el usuario se encuentra enrolado en la APP
    Cuando ingresa el usuario <usuario> y la clave <clave>
    Entonces verifico que el usuario pudo iniciar sesion
    Y verifico el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|usuario   |clave|
      |     1|invictus01|1234 |

  @manual
  Esquema del escenario: Autenticacion del usuario fallida con clave errada en dispositivo Android
    Dado que el usuario se encuentra enrolado en la APP
    Cuando ingresa el usuario <usuario> y la clave <clave>
    Entonces verifico que el sistemael resultado de la autenticacion
    Y verifico el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|usuario   |clave|
      |     1|invictus01|2343 |
