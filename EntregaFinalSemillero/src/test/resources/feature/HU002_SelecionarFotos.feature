
Feature: selecionar foto del dia de la pagina infobae
  
  Scenario: selecionar foto del dia de la pagina infobae
    Given ingrese a la pagina y selecciona la fotos del dia
    When un usario seleccione la tercera noticia
    Then se muestra todo el contenido de la noticia con scroll


