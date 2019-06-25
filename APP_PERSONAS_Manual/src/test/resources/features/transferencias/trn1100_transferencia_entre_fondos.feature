#language: es

Característica: Transferencia entre fondos inversión en app Bancolombia
  Como usuario de Bancolombia
  Quiero realizar una transferencia de fondo de inversion a fondo de inversion

Esquema del escenario: transferencia entre fondos de inversion

Dado que <usuario> esta en la APP en el dispositivo <dispositivo>
Cuando selecciona la opcion de transferencia <saldo> entre fondos de <cuentaOrigen> a <cuentaDestino>
Entonces deberia ver el mensaje <mensaje>
Y se verifica el archivo COMMFFLGWWW

Ejemplos:

| usuario  | dispositivo |   saldo      		 | cuentaOrigen    	  |  CuentaDestino  		   |  mensaje                        |
| Juan     | Android     |  con saldo   		 | Fondo de inversion |		Fondo de inversion	   |  generacion exitosa             |
| Andres   | iOS         |  sin saldo            | Fondo de inversion |     Fondo de inversion     |  No tiene saldo                 |
| Luis     | Huawei      |  con valor no pertmito| Fondo de inversion |     Fondo de inversion     |  ha superado el valor permitido |



