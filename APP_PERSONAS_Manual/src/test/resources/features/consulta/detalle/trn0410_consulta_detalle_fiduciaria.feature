# language: es

Característica: Trn-0410 Consulta de detalle fiduciaria en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de detalle
  Para conocer los datos del producto fondos de inversion

  @manual
  Esquema del escenario: Consulta de detalle fiduciaria
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de detalle seleccionando la opcion inversiones en el dispositivo <dispositivo>
    Entonces deberia ver los detalles del fondo de inversion
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |