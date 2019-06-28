# language: es

Característica: Trn-0229 Consulta de movimientos E-prepago en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de movimientos
  Para conocer la lista de movimientos E-prepago

  @manual
  Esquema del escenario: Consulta de movimientos e-Prepago
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de movimientos seleccionando la opcion e-Prepago en el dispositivo <dispositivo>
    Entonces deberia ver el listado de movimientos del e-Prepago
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |