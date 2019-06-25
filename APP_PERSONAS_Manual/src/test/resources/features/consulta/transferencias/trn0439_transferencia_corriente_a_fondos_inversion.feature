#language: es

Característica: Transferencia de cuenta de depósitos a fondos de inversión en app Bancolombia
  Como usuario de Bancolombia
  Quiero realizar una transferencia de una cuenta de corriente a un fondo de inversión


  @manual
  Esquema del escenario: transferencia de cuenta corriente a fondos de inversión

    Dado que <usuario> esta en la APP en el disposito <dispositivo>
    Cuando selecciona la opcion de transferencia <saldo> de cuenta <cuentaOrigen> a fondos de inversion <cuentaDestino>
    Entonces deberia ver un mensaje de pago exitoso
    Y se verifica el archivo COMMFFLGWWW

    Ejemplos:

      | usuario  | dispositivo | saldo    | cuentaOrigen    | cuentaDestino      |
      | Juan     | Android     | con saldo| Corriente       | Fondo de inversion |
      | Andres   | iOS         | con saldo| Corriente       | Fondo de inversion |
      | Luis     | Huawei      | con saldo| Corriente       | Fondo de inversion |

