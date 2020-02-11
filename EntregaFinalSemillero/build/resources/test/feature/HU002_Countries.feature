Feature: Buscar informacion en servicio

  Scenario Outline: Codigo de llamada que no existe
    Given Buscar la informacion que corresponda al <codigoLlamada>
    Then valido el estado <estado>

    Examples: 
      | codigoLlamada | estado |
      |            02 |    404 |
      |            12 |    404 |
      |            57 |    404 |

  Scenario Outline: recuperar capital
    Given Buscar codigo de llamada <codLlamada>
    Then valido la capital <capital>

    Examples: 
      | codLlamada | capital    |
      |         48 | "Warsaw"   |
      |        992 | "Dushanbe" |
      |        353 | " Dublin"  |
