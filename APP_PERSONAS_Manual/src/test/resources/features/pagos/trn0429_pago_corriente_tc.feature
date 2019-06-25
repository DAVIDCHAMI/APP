 #language: es

 Característica: Pago a tarjeta de credito de una cuenta corriente en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar un pago a tarjeta de credito desde una cuenta de corriente

   @manual
   Esquema del escenario: pago a tarjeta de credito no propia desde una cuenta corriente

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de pago con <saldo> de <cuentaOrigen> con <tipo pago> con tarjeta <propia>  a <tarjetaCredito> en <moneda>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo     | cuentaOrigen | tarjetaCredito | propia |  tipo pago   | moneda  |    mensaje                  |
       | Juan     | Android     |  con saldo  | Corriente    | Amex           |   No   | minimo       | pesos   |generacion exitosa           |
       | Andres   | iOS         |  con saldo  | Corriente    | Visa           |   No   | otro valor   | pesos   |generacion exitosa           |
       | Luis     | Huawei      |  sin saldo  | Corriente    | Master         |   No   | minimo       | pesos   |no tiene fondos sufiecientes |
       | Rosa     | Android     |  con saldo  | Corriente    | Amex           |   No   | otro valor   | dolares |no tiene fondos sufiecientes |
       | Lina     | Android     |  con saldo  | Corriente    | Visa           |   Si   | otro valor   | pesos   |generacion exitosa           |
       | Ana      | Android     |  con saldo  | Corriente    | Master         |   Si   | otro valor   | dolares |generacion exitosa           |
       | Alba     | Huawei      |  sin saldo  | Corriente    | Master         |   Si   | minimo       | dolares |no tiene fondos sufiecientes |
       | Gloria   | iOS         |  con saldo  | Corriente    | Visa           |   Si   | minimo       | pesos   |generacion exitosa           |
     
