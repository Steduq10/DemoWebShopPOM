Feature: Registrar nuevo usuario
  como usuario del sitio web Demo Web Shop
  quiero registrar un nuevo perfil de usuario
  para tener las credenciales de usuario y poder comprar en el sitio web

  Scenario: Registro correcto del usuario
    Given a que el cliente ingresó a la opción de registro
    When diligencie el formulario de registro correctamente
    Then el usuario recibirá un mensaje de que su cuenta fue registrada correctamente