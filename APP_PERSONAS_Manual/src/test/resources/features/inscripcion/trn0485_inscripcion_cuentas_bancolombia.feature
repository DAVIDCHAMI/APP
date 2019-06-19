#language: es

Característica: Inscripcion de cuentas Bancolombia en la APP
  Como usuario de la APP Bancolombia
  Quiero inscribir una cuenta Bancolombia
  Para realizar debitos y creditos dentro de la APP

  @manual
  Esquema del escenario: Inscripcion exitosa de cuentas Bancolombia
    Dado que <nombre> se autentico en la APP con el usuario <usuario> y la clave <clave>
    Cuando registra una cuenta Bancolombia en el dispostivo <dispositivo> con los siguientes datos
    |<banco>|<numeroProducto>|<tipoProducto>|<nombrePersonalizado>|<tipoDocumento>|<numeroDocumento>|
    Entonces se verifica que la inscripcion de cuenta fue exitosa
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |caseID|nombre|usuario   |clave|dispositivo|banco      |numeroProducto|tipoProducto     |nombrePersonalizado|tipoDocumento|numeroDocumento|
      #|1     |Luis  |invictus01|1234 |Android    |Bancolombia|              |Cuenta de Ahorros|
      #|invictus01|iOS        |Bancolombia||Cuenta de Ahorros
      #|invictus01|huawei     |Bancolombia||Cuenta de Ahorros