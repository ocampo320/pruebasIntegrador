Feature: Buscar informacion en servicio

  Scenario Outline: Recuperar informacion del servicio
    Given Buscar el pais correspondiente al <codLlamada> en el api
    Then valido <nombre> y el <dominio> 

    Examples: 
      | codLlamada | nombre     | dominio |
      |         57 | "Colombia" | ".co"   |
      |         90 | "Turkey"   | ".tr"   |
