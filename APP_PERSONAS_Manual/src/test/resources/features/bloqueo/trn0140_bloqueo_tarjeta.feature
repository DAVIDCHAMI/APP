#language: es

Característica: Trn-0140 bloqueo de tarjeta de credito en app Bancolombia
  Como usuario de Bancolombia
  Quiero bloquear una tarjeta
  Para administrar la seguridad de mis tarjetas

  @manual
  Esquema del escenario: bloqueo de tarjeta de credito

    Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
    Cuando selecciona bloquear tarjetas definitivamente y elije la tarjeta <tipoTarjeta>
    Entonces deberia ver el mensaje bloqueo exitoso
    Y se verifica el archivo COMMFFLGWWW

    Ejemplos:

      | usuario  | dispositivo |   tipoTarjeta      |
      | Juan     | Android     |  American Express  |
      | Andres   | iOS         |  Visa              |
      | Luis     | Huawei      |  Master card       |


  @manual
  Esquema del escenario: flujo transaccional  bloqueo de tarjeta de credito

    Dado que el usuario esta en la APP
    Cuando selecciona bloquear tarjetas definitivamente y elije la tarjeta
    Entonces deberia ver el mensaje bloqueo exitoso
    Y se verifica  que se lancen las transacciones <Trn-1> <Trn-2> <Trn-3> <Trn-4> <Trn-5>

    Ejemplos:

      | Trn-1 |  Trn-2 |  Trn-3 |  Trn-4 |  Trn-5 |
      |   Autenticacion - 0369    |Saldos consolidados - 1756| Consulta simple e-Prepago- 1228| Consulta detallada e-Prepago - 0228| Activar E-prepago (1232) |