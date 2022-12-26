Feature: Contactarse con el equipo de soporte del sitio web
  como usuario del sitio web Demo Web Shop
  quiero comunicarme con el equipo de soporte
  para  generar P.Q.R.S

  Scenario: Submit el formulario de forma valida
    Given a que el usuario ingreso a la opcion de contact us
    When diligencie el formulario de contact correctamente
    Then recibe un mensaje de confirmacion de la correcta generacion del P.Q.R.S