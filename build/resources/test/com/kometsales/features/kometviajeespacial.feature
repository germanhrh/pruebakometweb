Feature: Automation Viaje Espacial Screenplay
  Yo como postulante de automatización
  Necesito realizar una automatizacion de una reserva para un viaje espacial
  Para demostrar conocimientos en automatizacion

  Scenario: reserva viaje espacial
    Given "Usuario" desea ir a la pagina de "https://demo.testim.io/login"
    When Ingresa nombre de usuario y password
    And  Seleccionar la fecha de partida
    And Seleccionar la fecha de regreso
    And Ingresar cantidad de niños y de adultos en el viaje
    And Seleccionar el lugar de destino aplicando filtros
    And ingresar datos checkout
    And ingresar promocode y aplicar
    Then Valida que al valor total se le aplico descuento y clic en pay now