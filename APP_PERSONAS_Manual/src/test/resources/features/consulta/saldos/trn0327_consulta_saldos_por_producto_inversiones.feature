# language: es

Característica: Trn-0327 Consulta de saldos por producto Inversiones en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de saldos
  Para conocer el monto disponible de las inversiones virtuales

  @manual
  Esquema del escenario: Consulta de saldos por producto Inversiones
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de saldos seleccionando la opcion inversiones en el dispostivo <dispositivo>
    Entonces deberia ver el saldo disponible para inversiones
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |