Feature: Contactarse con el equipo de soporte del sitio web
  como usuario del sitio web Demo Web Shop
  quiero comunicarme con el equipo de soporte
  para  generar P.Q.R.S

  Scenario: Submit el formulario de forma valida
    Given a que el usuario ingreso a la opcion de contact us
    When diligencie el formulario de contact correctamente
    Then recibe un mensaje de confirmacion de la correcta generacion del P.Q.R.S

  Scenario: Submit el formulario sin diligenciar uno de los campos
    Given a que el usuario ingreso a la opcion de contact us
    When diligencie el formulario de contact dejando unos de los campos vacios
    Then recibe un mensaje de que debe diligenciar el campo faltante para poder generar el P.Q.R.S