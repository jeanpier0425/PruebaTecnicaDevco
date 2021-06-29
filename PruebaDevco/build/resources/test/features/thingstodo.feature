#language: es

Característica: Elegir algo para hacer
  Yo como usuario
  Quiero buscar para hacer
  Para irme de viaje

  Escenario: : Elegir algo para hacer exitoso
    Dado El usuario abre la pagina
    Cuando El usuario elige algo para hacer con los siguientes datos
      | lugar    | Tokio |
      | checkin  | Jul 6 |
      | checkout | Jul 8 |
    Entonces El debe usuario ver un mesaje de alerta

