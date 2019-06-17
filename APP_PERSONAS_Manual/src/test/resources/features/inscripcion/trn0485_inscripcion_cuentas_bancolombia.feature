#language: es

Característica: Inscripcion de cuentas Bancolombia en la APP
  Como usuario de la APP Bancolombia
  Quiero inscribir una cuenta Bancolombia
  Para realizar debitos y creditos a la cuenta de deposito

  @manual
  Esquema del escenario: Inscripcion exitosa de cuentas Bancolombia en dispositivo Android
    Dado que <usuario> se autentico en la APP en el dispositivo <dispositivo>
    Cuando registra una cuenta Bancolombia con la siguiente informacion
    |<banco>|<numeroProducto>|<tipoProducto>|<nombrePersonalizado>|<tipoDocumento>|<numeroDocumento>|
    Entonces se verifica que la inscripcion de cuenta fue exitosa
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |usuario   |dispositivo|banco      |numeroProducto|tipoProducto|nombrePersonalizado|tipoDocumento|numeroDocumento|
      #|invictus01|android    |Bancolombia||Cuenta de Ahorros
      #|invictus01|iOS        |Bancolombia|
      #|invictus01|huawei     |Bancolombia|