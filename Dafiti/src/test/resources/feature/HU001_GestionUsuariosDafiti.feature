Feature: Como usuario quiero registrarme, inisiar sesion, cerrar seción
y añadir un producto al carrito


  Background: Iniciar sesion
    Given necesito iniciar sesion con un usuario
    When usuario "avillada341@gmail.com" contrasena "Abcd123654"
    Then validar inicio de sesion 

    Scenario: Agregar Producto 
    Given necesito agregar un producto al carrito
    When producto "gafas negras ray ban"
    Then validar que se agrego el producto 
    