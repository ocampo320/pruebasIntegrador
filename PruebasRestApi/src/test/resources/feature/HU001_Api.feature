Feature: Buscar informacion en servicio

  Scenario Outline: Recuperar informacion servicio
    Given El <id> en una base de datos
    Then valido <titulo> y el <episodio>

    Examples: 
      | id | titulo                 | episodio |
      |  1 | "A New Hope"           |        4 |
      |  5 | "Attack of the Clones" |        2 |
