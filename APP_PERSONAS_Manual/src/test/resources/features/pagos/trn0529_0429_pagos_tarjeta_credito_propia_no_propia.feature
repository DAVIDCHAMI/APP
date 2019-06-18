#language: es

Característica: pagos de tarjeta de credito propia y no propia en app Bancolombia
  Como usuario de Bancolombia
  Quiero pagar una tarjeta de credito propia y no propia
  Para liberar espacio en el cupo de la tarjeta

  @manual
  Esquema del escenario: pago de tarjeta de credito propia master desde una cuenta de ahorro o corriente

    Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
    Cuando selecciona la opcion de pagar tarjetas propias y realiza el pago con pago <tipoPago> de la tarjeta con cuenta <tipoCuenta>
    Entonces deberia ver un mensaje de pago exitoso
    Y se verifica el archivo COMMFFLGWWW

    Ejemplos:

     | usuario  | dispositivo | tipoPago    | tipoCuenta |
     | Juan     | Android     | minimo      | Ahorro     |
     | Andres   | iOS         | total       | Ahorro     |
     | Luis     | Huawei      | otro valor  | Ahorro     |
     | Maria    | Android     | minimo      | Corriente  |
     | Pedro    | iOS         | total       | Corriente  |
     | Carlos   | Huawei      | otro valor  | Corriente  |


    @manual
    Esquema del escenario: flujo transaccional del pago de tarjeta de credito propia master desde una cuenta de ahorro o corriente

      Dado que el usuario esta en la APP
      Cuando selecciona la opcion de pagar tarjetas propias y realiza el pago de la tarjeta
      Entonces deberia ver un mensaje de pago exitoso
      Y se verifica  que se lancen las transacciones <Trn-1> <Trn-2> <Trn-3> <Trn-4> <Trn-5> <Trn-6> <Trn-7> <Trn-8>

      Ejemplos:

      | Trn-1 |  Trn-2 |  Trn-3 |  Trn-4 |  Trn-5 |  Trn-6 |  Trn-7 |  Trn-8 |
      |   Autencicacion - 0369    |Saldos consolidados - 1756| Listar TDC - 0260| Detalle DTC - 1260 | Listar cuentas deposito - 0360| Consulta costo -0888| Pago desde cuenta de ahorrro - 0529|Pago desde cuenta corriente - 0429|