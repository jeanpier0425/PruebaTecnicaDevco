#language: es

Característica: Adicionar paquete
  Yo como usuario
  Quiero adicionar un equipaje al viaje
  Para irme de viaje

  Escenario: : Adicionar equipaje exitoso
    Dado El usuario abre la pagina
    Cuando El usuario adiciona un equipaje con los siguientes datos
      | lugarsalida  | Berlin (BER - Brandenburg) |
      | lugarllegada |Rio de Janeiro|
      | checkin  | Jul 28 |
      | checkout | Jul 30 |
    Entonces El usuario debe ver un mesaje de alerta