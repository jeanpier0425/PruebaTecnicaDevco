#language: es

Característica: Reservar estadia
  Yo como usuario
  Quiero hacer una reserva en la página
  Para irme de viaje

  Escenario: : reserva exitosa
    Dado El usuario abre la pagina
    Cuando El usuario hace una reserva con los siguientes datos
      | lugar    | Paris |
      | checkin  | Jul 6 |
      | checkout | Jul 8 |
    Entonces El debe usuario ver un mesaje de alerta

