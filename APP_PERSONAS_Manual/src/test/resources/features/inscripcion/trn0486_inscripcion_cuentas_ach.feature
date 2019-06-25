#language: es

Característica: Trn-0486 Inscripcion de cuentas ACH en la APP
  Como usuario de la APP Bancolombia
  Quiero inscribir una cuenta ACH
  Para realizar debitos y creditos dentro de la APP

  @manual
  Esquema del escenario: Inscripcion de cuentas ACH
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando intenta registrar una cuenta ACH en el dispostivo <dispositivo>
    Entonces deberia ver el mensaje <mensaje>
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|mensaje                            |
      |Luis  |invictus01|1234 |Android    |Inscripcion pendiente de activacion|
      |Luis  |invictus01|1234 |iOS        |Inscripcion pendiente de activacion|
      |Luis  |invictus01|1234 |Huawei     |Inscripcion pendiente de activacion|
