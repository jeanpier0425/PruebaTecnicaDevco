#language: es

Característica: Reservar un vuelo
  Yo como usuario
  Quiero hacer una reserva de un vuelo en la página
  Para irme de viaje

  Escenario: : Reserva vuelo exitoso
    Dado El usuario abre la pagina
    Cuando El usuario hace la reserva de un vuelo con los siguientes datos
      | lugarsalida  | Madrid (MAD - Adolfo Suarez Madrid-Barajas) |
      | lugarllegada |Cairo (CAI - Cairo Intl.)|
      | fechasalida  | Jul 22                                      |
    Entonces El usuario debe ver un mesaje de alerta