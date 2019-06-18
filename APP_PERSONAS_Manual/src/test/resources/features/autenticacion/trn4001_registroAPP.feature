#language: es

Característica: Registro o enrolamiento de usuario en la APP Bancolombia
  Como usuario de Bancolombia
  Quiero registrar autenticarme en la APP con mi usuario y clave
  Para crear el usuario

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