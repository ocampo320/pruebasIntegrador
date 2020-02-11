@tag
Feature: Necesito registrar registrar usuarios

  @tag1
  Scenario: Registro usuario
    Given Necesito registrar un usuario
    When usuario con el correo "alexandermasco@gmail.com" contraseña "Abcd123654" nombre "Jaime" apellido "Gomez" documento "1026151143" dia "9" mes "noviembre" anio "1995" sexo "Femenino"
    Then Validar registro de usuario

