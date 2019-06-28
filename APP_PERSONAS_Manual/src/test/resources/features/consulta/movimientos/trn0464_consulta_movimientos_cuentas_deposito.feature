# language: es

Característica: Trn-0464 Consulta de movimientos Cuentas de Deposito en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de movimientos
  Para conocer la lista de movimientos de las cuentas de deposito

  @manual
  Esquema del escenario: Consulta de movimientos cuentas de deposito
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de movimientos seleccionando la opcion cuentas en el dispostivo <dispositivo>
    Entonces deberia ver el listado de movimientos de las cuentas de deposito
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |