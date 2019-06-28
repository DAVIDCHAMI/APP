# language: es

Característica: Trn-0358 Consulta de puntos Colombia en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de puntos Colombia
  Para conocer los puntos disponibles y puntos a vencer

  @manual
  Esquema del escenario: Consulta de puntos Colombia
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de puntos Colombia en el dispostivo <dispositivo>
    Entonces deberia ver los puntpola deuda a la fecha de los creditos
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |