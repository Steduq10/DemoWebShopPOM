
Feature: Loguearse con un usuario registrado
  como usuario del sitio web Demo Web Shop
  quiero loguearme con mi perfil de usuario
  para  poder comprar en el sitio web

  Scenario: Login correcto del usuario
    Given a que el usuario ingreso a la opcion de login
    When diligencie el formulario de login correctamente con email y password
    Then el usuario ingresa al menu principal del sitio web

  Scenario: Login incorrecto del usuario
    Given a que el usuario ingreso a la opcion de login
    When diligencie el formulario de login  con email y password no registrado o incorrecto
    Then se muestra en pantalla un mensaje de que el login no fue exitoso