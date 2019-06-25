 #language: es

 Característica: Transferencia de cuenta de depósitos a fondos de inversión en app Bancolombia
   Como usuario de Bancolombia
   Quiero realizar una transferencia de fondo de inversión a una cuenta de ahorros


   @manual
   Esquema del escenario: transferencia de depósitos a fondos de inversión

     Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
     Cuando selecciona la opcion de transferencia con <saldo> de <cuentaOrigen> a <cuentaDestino>
     Entonces deberia ver el mensaje <mensaje>
     Y se verifica el archivo COMMFFLGWWW

     Ejemplos:

       | usuario  | dispositivo |   saldo      		    | cuentaOrigen  |  CuentaDestino  	   |  mensaje                       |
       | Juan     | Android     |  con saldo   		    | Ahorros       |	Fondo de inversion |  generacion exitosa            |
       | Andres   | iOS         |  sin saldo            | Ahorros       |   Fondo de inversion |  No tiene saldo                |
       | Luis     | Huawei      |  con valor no pertmito| Corriente     |   Fondo de inversion |  ha superado el valor permitido|


	  