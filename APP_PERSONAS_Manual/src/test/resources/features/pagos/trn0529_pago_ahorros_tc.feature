 #language: es

 Característica: Pago a tarjeta de credito de una cuenta de ahorros en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar un pago a tarjeta de credito desde una cuenta de ahorro

   @manual
   Esquema del escenario: pago a tarjeta de credito no propia desde una cuenta de ahorros

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de pago con <saldo> de <cuentaOrigen> con <tipo pago> con tarjeta <propia>  a <tarjetaCredito> en <moneda>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo     | cuentaOrigen | tarjetaCredito | propia |  tipo pago   | moneda  |    mensaje                  |
       | Juan     | Android     |  con saldo  | Ahorros      | Visa           |   No   | minimo       | pesos   |generacion exitosa           |
       | Andres   | iOS         |  con saldo  | Ahorros      | Amex           |   No   | otro valor   | pesos   |generacion exitosa           |
       | Luis     | Huawei      |  sin saldo  | Ahorros      | Master         |   No   | minimo       | pesos   |no tiene fondos sufiecientes |
       | Rosa     | Android     |  sin saldo  | Ahorros      | Amex           |   No   | otro valor   | pesos   |no tiene fondos sufiecientes |
       | Lina     | Android     |  con saldo  | Ahorros      | Visa           |   Si   | otro valor   | pesos   |gemeracion exitosa           |
       | Luna     | Android     |  sin saldo  | Ahorros      | Amex           |   No   | minimo       | pesos   |generacion exitosa           |
       | Ana      | Huawei      |  con saldo  | Ahorros      | Master         |   Si   | total        | pesos   |generacion exitosa           |
       | Alba     | Huawei      |  con saldo  | Ahorros      | Master         |   Si   | total        | dolares |generacion exitosa           |
