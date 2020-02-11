#Author: Sebas2011561@outlook.es

Feature: Seleccionar la opcion de Motor 
         Como estudiante de semillero
         necesito aprender automatización a traves de ejemplos
         para automatizar cualquier caso de prueba

  Scenario: Selecionar la opcion de motor y ver el calendario
    Given Ingrese a la pagina y cambiar a edicion de espa
    When  un usuario selecciona la opcion moto y el calendario
    Then  validar que la pista sea SILVERSTONE
