Feature: Gestión de productos y carrito en SauceDemo

  Background:
    Given el usuario ha iniciado sesión en SauceDemo

  Scenario: Agregar un producto al carrito
    When agrega el producto "Sauce Labs Backpack" al carrito
    Then el contador del carrito debería mostrar "1"

  Scenario: Agregar múltiples productos al carrito
    When agrega el producto "Sauce Labs Backpack" al carrito
    And agrega el producto "Sauce Labs Bike Light" al carrito
    Then el contador del carrito debería mostrar "2"