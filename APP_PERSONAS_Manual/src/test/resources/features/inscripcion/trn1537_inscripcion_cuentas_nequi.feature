#language: es

Característica: Trn-1537 Inscripcion de cuentas Nequi en la APP
  Como usuario de la APP Bancolombia
  Quiero inscribir una cuenta Nequi
  Para interactuar con los servicios que ofrece

  @manual
  Esquema del escenario: Inscripcion de cuentas Nequi
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando intenta registrar una cuenta Nequi en el dispostivo <dispositivo>
    Entonces deberia ver el mensaje <mensaje>
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|mensaje                                                            |
      |Luis  |invictus01|1234 |Android    |Cuenta inscrita exitosamente y se encuentra pendiente de activacion|
      |Luis  |invictus01|1234 |iOS        |Cuenta inscrita exitosamente y se encuentra pendiente de activacion|
      |Luis  |invictus01|1234 |Huawei     |Cuenta inscrita exitosamente y se encuentra pendiente de activacion|
      |Luis  |invictus01|1234 |Android    |Cuenta pendiente de activacion                                     |
      |Luis  |invictus01|1234 |iOS        |Cuenta pendiente de activacion                                     |
      |Luis  |invictus01|1234 |Huawei     |Cuenta pendiente de activacion                                     |