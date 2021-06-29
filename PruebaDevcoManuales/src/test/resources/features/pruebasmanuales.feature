#language: es

Característica: Ejecuciones manuales
  Sobre la pagina https://www.travelocity.com/

  @manual
  Escenario: Inicio de sesion exitoso
    Dado El usuario abre la pagina
    Cuando El usuario ingresa con usuario y password correctos
    Entonces El inicio de sesion debe ser exitoso

  @manual
  Escenario: Inicio de sesion desde apple exitoso
    Dado El usuario abre la pagina
    Cuando El usuario ingresa desde la opcion de apple
    Entonces El inicio de sesion debe ser exitoso

  @manual
  Escenario: Inicio de sesion desde facebook exitoso
    Dado El usuario abre la pagina
    Cuando El usuario ingresa desde la opcion de facebook
    Entonces El inicio de sesion debe ser exitoso

  @manual
  Escenario: Inicio de sesion fallido
    Dado El usuario abre la pagina
    Cuando El usuario ingresa con usuario y password incorrectos
    Entonces El inicio de sesion debe ser fallido

  @manual
  Escenario: Recuperar password exitoso
    Dado El usuario abre la pagina
    Cuando El usuario ingresa el correo para recuperar su password
    Entonces La recuperaracion del password debe ser exitoso

  @manual
  Escenario: Rentar un carro exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de renta de auto
    Y El usuario llena todas las opciones correspondientes
    Entonces Se deben de mostrar todas los carros disponibles

  @manual
  Escenario: Reservar un cruzero exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de reservar un crucero
    Y El usuario llena todos los datos correspondientes a la reserva
    Entonces Se deben de mostrar todos los cruceros disponibles

  @manual
  Escenario: Elegir idioma de la pagina exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion superior de cambio de idioma
    Entonces La pagina debe mostrar en el idioma seleccionado

  @manual
  Escenario: Ver viajes realizados sin inicio de sesion
    Dado El usuario abre la pagina
    Cuando El usuario elige la opcion de ver sus viajes
    Entonces La pagina debe mostrar un mensaje para que el usuario inicie sesion

  @manual
  Escenario: Ir a Opcion Atencion al cliente exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de Atencion al cliente
    Entonces La pagina debe mostrar las opciones correspondientes

  @manual
  Escenario: Armar paquete turistico exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de Atencion al cliente
    Y elige las opciones correspondientes para armar su paquete turistico
    Entonces La pagina debe mostrar la disponibilidad que corresponde al paquete

  @manual
  Escenario: Ir a Opcion de viajes para mi exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de viajes para mi
    Entonces La pagina debe mostrar los sitios recomendados para el usuario

  @manual
  Escenario: Ir a Opcion de Anunciar una propiedad exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion de Anunciar una propiedad
    Entonces La pagina debe redirigir hacia la pagina correspondiente

  @manual
  Escenario: Ir a Opcion de ofertas exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion inferior de ofertas de ultima hora
    Entonces La pagina debe redirigir hacia las ofertas disponibles

  @manual
  Escenario: Ir a consultar los terminos y condiciones exitosamente
    Dado El usuario abre la pagina
    Cuando El usuario va a la opcion inferior de ofertas de TYC
    Entonces La pagina debe mostrar los terminos y condiciones