#language: es

Característica: Trn-3100 Inscripcion de clave dinamica por softoken en la APP
  Como usuario de la APP Bancolombia
  Quiero realizar la inscribicion a clave dinamica
  Para realizar transacciones de manera segura

  @manual
  Esquema del escenario: Inscripcion de clave dinamica
    Dado que <nombre> se encuentra enrolado en la APP con el usuario <usuario>
    Cuando intenta realizar la inscripcion de la clave dinamica en el dispostivo <dispositivo>
    Entonces deberia ver el mensaje <mensaje>
    Y se verifica el registro en el Log del Canal COMFFLGWWW

    Ejemplos:
      |nombre |usuario   |dispositivo|mensaje            |
      |Alberto|invictus02|Android    |Inscripcion exitosa|
      |Alberto|invictus02|iOS        |Inscripcion exitosa|
      |Alberto|invictus02|Huawei     |Inscripcion exitosa|

