#language: es

Característica: Trn-4001 Registro de usuario en la APP Bancolombia
  Como cliente de Bancolombia
  Quiero realizar el registro de mi usuario virtual en la APP
  Para poder transar por los canales virtuales

  @manual
  Esquema del escenario: Registro o enrolamiento del usuario en la APP
    Dado que <nombre> ingreso con cedula <cedula> y clave <clave> en el dispositivo <dispositivo>
    Cuando registra el usuario <usuario> e ingresa el correo <correo>
    Entonces se verifica que el sistema presente mensaje de registro exitoso
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre  |cedula   |clave  |dispositivo|usuario   |correo                   |
      |Alberto |58156995 |1234   |Android    |invictus02|dfrios@bancolombia.com.co|
      |Jorge   |58156996 |1234   |iOS        |invictus03|dfrios@bancolombia.com.co|
      |Bernardo|58156997 |1234   |Huawei     |invictus04|dfrios@bancolombia.com.co|