#language: es

Característica: Transferencia de cuenta de depósitos a fondos de inversión en app Bancolombia
Como usuario de Bancolombia
Quiero realizar una transferencia de una cuenta de ahorros a un fondo de inversión


@manual
Esquema del escenario: transferencia de cuenta de ahorros a fondos de inversión

  Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
  Cuando selecciona la opcion de transferencia de cuenta de ahorros <cuentaOrigen> a fondos de inversion <cuentaDestino>
  Entonces deberia ver un mensaje de pago exitoso
  Y se verifica el archivo COMMFFLGWWW

Ejemplos:

| usuario  | dispositivo | cuentaOrigen | cuentaDestino      |
| Juan     | Android     | Ahorro       | Fondo de inversion |
| Andres   | iOS         | Ahorro       | Fondo de inversion |
| Luis     | Huawei      | Ahorro       | Fondo de inversion |