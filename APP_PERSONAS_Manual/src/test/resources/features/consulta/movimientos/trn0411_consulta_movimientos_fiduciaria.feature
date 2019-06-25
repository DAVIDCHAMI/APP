# language: es

Característica: Trn-0411 Consulta de movimientos Fiduciarios en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de movimientos
  Para conocer la lista de movimientos de los fondos de inversion

  @manual
  Esquema del escenario: Consulta de movimientos fiduciarios
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de movimientos seleccionando la opcion inversiones en el dispostivo <dispositivo>
    Entonces deberia ver el listado de movimientos fiduciarios
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |