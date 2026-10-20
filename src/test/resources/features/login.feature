Feature: Login en SauceDemo

  Scenario: Login exitoso con credenciales válidas
    Given el usuario está en la página de login de SauceDemo
    When ingresa el usuario "standard_user" y la contraseña "secret_sauce"
    Then debería ver la página de productos

  Scenario: Login fallido con contraseña incorrecta
    Given el usuario está en la página de login de SauceDemo
    When ingresa el usuario "standard_user" y la contraseña "wrong_password"
    Then debería ver un mensaje de error indicando credenciales inválidas