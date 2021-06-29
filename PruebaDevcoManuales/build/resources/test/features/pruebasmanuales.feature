#language: es

Característica: Ejecuciones manuales
  Sobre la pagina https://www.travelocity.com/

  @manual
  Escenario: Inicio de sesion exitoso
    Dado El usuario abre la pagina
    Cuando El usuario ingresa con usuario y password correctos
    Entonces El inicio de sesion debe ser exitoso

  @manual
  Escenario: Inicio de sesion fallido
    Dado El usuario abre la pagina
    Cuando El usuario ingresa con usuario y password incorrectos
    Entonces El inicio de sesion debe ser fallido