#language: es

Característica: Realizar registro
  Yo como usuario
  Quiero registro en la página
  Para hacer una reserva

  Escenario: : registro exitoso
    Dado El usuario abre la pagina
    Cuando El usuario hace el registro con los siguientes datos
      | nombre      | juan                 |
      | apellido    | mendez               |
      | email       | juan1996@hotmail.com |
      | password    | Abc123456            |
      | confirmpass | Abc123456            |
    Entonces El registro debe ser exitoso
      | nombre | juan |