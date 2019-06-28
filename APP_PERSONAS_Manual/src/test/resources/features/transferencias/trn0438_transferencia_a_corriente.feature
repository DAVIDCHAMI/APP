 #language: es

 Característica: Transferencia a cuenta de corriente en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar una transferencia de una cuenta de depositos a una cuenta de corriente


   @manual
   Esquema del escenario: transferencia de de deposito a cuenta corriente

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de transferencia con <saldo> de <cuentaOrigen> a <cuentaDestino> con <QR>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo      		    | cuentaOrigen  |   CuentaDestino  	      |  mensaje                       |  QR    |Cuenta inscrita|
       | Juan     | Android     |  con saldo   		    | Ahorros       |   Corriente             |  generacion exitosa            | Con QR |       Si      |
       | Andres   | iOS         |  sin saldo            | Corriente     |   Corriente             |  No tiene saldo                | Sin QR |       Si      |
       | Luis     | Huawei      |  con valor no pertmito| Ahorros       |   Corriente             |  ha superado el valor permitido| Con QR |       No      |
       | Rosa     | Android     |  con saldo   		    | Ahorros       |   Corriente             |  generacion exitosa            | Con QR |       No      |
       | Lina     | Huawi       |  sin saldo   		    | Ahorros       |   Corriente             |  No tiene saldo                | Con QR |       Si      |
       | Carlos   | Android     |  con saldo   		    | Ahorros       |   Caracteres especiales |  Transaccion no permitida      | Sin QR |       No      |
