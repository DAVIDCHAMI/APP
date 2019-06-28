 #language: es

 Característica: Transferencia a cuenta de ahorros en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar una transferencia de una cuenta de depositos a una cuenta ahorros


   @manual
   Esquema del escenario: transferencia de depositos a cuenta de ahorros

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de transferencia con <saldo> de <cuentaOrigen> a <cuentaDestino> con <QR>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo      		    | cuentaOrigen  |   CuentaDestino         |        mensaje                 |  QR    |Cuenta inscrita|
       | Juan     | Android     |  con saldo   		    | Ahorros       |   Ahorros               |  generacion exitosa            | Con QR |     Si        |
       | Andres   | iOS         |  sin saldo            | Corriente     |   Ahorros               |  No tiene saldo                | Sin QR |     Si        |
       | Luis     | Huawei      |  con valor no pertmito| Ahorros       |   Ahorros               |  ha superado el valor permitido| Con QR |     Si        |
       | Rosa     | Android     |  con saldo   		    | Corriente     |   Ahorros               |  generacion exitosa            | Con QR |     No        |
       | Lina     | Android     |  sin saldo   		    | Corriente     |   Ahorros               |  No tiene saldo                | Con QR |     Si        |
       | Carlos   | Android     |  con saldo   		    | Corriente     |   Caracteres (,,,,)     |  transaccion no permitida      | Sin QR |     No        |
