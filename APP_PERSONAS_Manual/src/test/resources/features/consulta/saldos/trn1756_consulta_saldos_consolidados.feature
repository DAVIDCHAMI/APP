#language: es

Característica: Consulta de saldos cuenta depositos app Bancolombia
  Como usuario de Bancolombia
  Quiero consultar mis cuentas depositos
  Para visualizar el saldo de mis cuentas

  @manual
  Esquema del escenario: Consultar saldo de cuenta deposito

    Dado que <usuario> esta en la APP
    Cuando selecciona la opcion de consulta de saldos de cuentas depositos
    Entonces deberia ser capaz de de consultar el saldo de todas mis cuentas

    Ejemplos:

      | caseID | usuario |
      | 1  | Juan     |
