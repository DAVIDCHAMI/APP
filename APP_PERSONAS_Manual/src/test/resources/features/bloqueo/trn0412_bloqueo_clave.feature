#language: es

Característica: Trn-0412 bloqueo de clave en app Bancolombia
  Como usuario de Bancolombia
  Quiero bloquear mi primera clave
  Para que no pueda acceder a ninguno de los canales virtuales

  @manual
  Esquema del escenario: bloqueo de primera clave

    Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
    Cuando selecciona bloquear clave
    Entonces deberia ver el mensaje de bloqueo exitoso
    Y se verifica el archivo COMMFFLGWWW

    Ejemplos:

      | usuario  | dispositivo |
      | Juan     | Android     |
      | Andres   | iOS         |
      | Luis     | Huawei      |

  @manual
  Esquema del escenario: flujo transaccional del bloqueo de la primera clave

    Dado que el usuario esta en la APP
    Cuando selecciona bloquear clave
    Entonces deberia ver el mensaje de bloqueo exitoso
    Y se verifica  que se lancen las transacciones <Trn-1> <Trn-2> <Trn-3> <Trn-4> <Trn-5>

    Ejemplos:

      | Trn-1 |  Trn-2 |  Trn-3 |  Trn-4 |  Trn-5 |
      |   Autenticacion - 0369    |Saldos consolidados - 1756| Consulta simple e-Prepago- 1228| Consulta detallada e-Prepago - 0228| Activar E-prepago (1232) |