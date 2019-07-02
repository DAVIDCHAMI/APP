#language: es

Característica: Transferencia de ondos de inversión a cuenta de depósitos en app Bancolombia
  Como usuario de Bancolombia
  Quiero realizar una transferencia de fondo de inversión a una cuenta de corriente


  @manual
  Esquema del escenario: transferencia de fondos de inversión a cuenta corriente

    Dado que <usuario> esta en la APP en el disposito <dispositivo>
    Cuando selecciona la opcion de transferencia de fondos de inversion <cuentaOrigen> a cuenta corriente <cuentaDestino>
    Entonces deberia ver un mensaje de pago exitoso
    Y se verifica el archivo COMMFFLGWWW

    Ejemplos:

      | usuario  | dispositivo | cuentaOrigen             | cuentaDestino      |
      | Juan     | Android     | Fondo de inversion       | Corriente          |
      | Andres   | iOS         | Fondo de inversion       | Corriente          |
      | Luis     | Huawei      | Fondo de inversion       | Corriente          |

