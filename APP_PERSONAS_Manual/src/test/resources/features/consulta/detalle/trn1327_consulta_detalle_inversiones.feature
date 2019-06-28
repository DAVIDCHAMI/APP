# language: es

Característica: Trn-1327 Consulta de detalle Inversion virtual en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la consulta de detalle
  Para conocer los datos del producto de inversion virtual

  @manual
  Esquema del escenario: Consulta de detalle inversion virtual
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando realiza la consulta de detalle seleccionando la opcion inversiones en el dispositivo <dispositivo>
    Entonces deberia ver los detalles de la inversion virtual
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre|usuario   |clave|dispositivo|
      |Luis  |invictus01|1234 |Android    |
      |Luis  |invictus01|1234 |iOS        |
      |Luis  |invictus01|1234 |Huawei     |