#Author: your.email@your.domain.com
Feature: Registrar usuario
  Como usuario necesito registrarme
  con un usuario y una contraseña
  
  Scenario: Gestionar Usuarios
    Given Necesito registrar un usuario
    When usuario "anam62517@gmail.com" contrasena "abcd123"
    Then Validar usuario registrado
