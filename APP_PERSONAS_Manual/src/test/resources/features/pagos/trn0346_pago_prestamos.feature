 #language: es

 Característica: Pago a cuenta a prestamos desde una cuenta de depositos en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar un pago a un prestamo desde una cuenta de depositos

   @manual
   Esquema del escenario: pago a prestamo desde cuenta de deposito

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de pago con <saldo> de <cuentaOrigen> con <tipo pago> a <cuentaDestino>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo      		    | cuentaOrigen  |   CuentaDestino | tipo pago     |     mensaje                  |
       | Juan     | Android     |  con saldo   		    | Ahorros       |   Prestamos     |  minimo       | generacion exitosa           |
       | Andres   | iOS         |  con saldo            | Corriente     |   Prestamos     |  total        | generacion exitosa           |
       | Luis     | Huawei      |  sin saldo            | Ahorros       |   Preatamos     |  minimo       | no tiene fondos sufiecientes |
       | Rosa     | Android     |  sin saldo            | Ahorros       |   Preatamos     |  otro valor   | no tiene fondos sufiecientes |
       | Lina     | Android     |  con saldo            | Ahorros       |   Preatamos     |  otro valor   | gemeracion exitosa           |

