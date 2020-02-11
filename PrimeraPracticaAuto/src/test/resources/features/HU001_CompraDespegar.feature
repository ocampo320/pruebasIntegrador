#Author: cza8421@hotmail.com
Feature: Comprar Vuelo
  Como estudiante de semillero
  necesito aprender automatización a traves de ejemplos
  para automatizar cualquier caso de prueba

  Scenario: Agregar Vuelo a Compra
    Given Necesisto comprar un vuelo
    When Vuelo entre Medellin y Cali
    Then Valido el valor del vuelo
