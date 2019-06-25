# language: es

Característica: Trn-0264 Consulta de movimientos Tarjeta de Credito en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de movimientos
  Para conocer la lista de movimientos de la tarjeta de credito

  @manual
  Esquema del escenario: Consulta de movimientos Tarjeta de credito
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de movimientos seleccionando la opcion tarjetas de credito en el dispositivo <dispositivo>
    Entonces deberia ver el listado de movimientos de la tarjeta de credito
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |