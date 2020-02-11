$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/HU001_Api.feature");
formatter.feature({
  "name": "Buscar informacion en servicio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Recuperar informacion servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "El \u003cid\u003e en una base de datos",
  "keyword": "Given "
});
formatter.step({
  "name": "valido \u003ctitulo\u003e y el \u003cepisodio\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "titulo",
        "episodio"
      ]
    },
    {
      "cells": [
        "1",
        "\"A New Hope\"",
        "4"
      ]
    },
    {
      "cells": [
        "5",
        "\"Attack of the Clones\"",
        "2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Recuperar informacion servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 1 en una base de datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsApi.idBase(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido \"A New Hope\" y el 4",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsApi.validoTituloEpisodio(String,int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c400\u003e but was \u003c200\u003e.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat stepdefinitions.StepDefinitionsApi.validoTituloEpisodio(StepDefinitionsApi.java:34)\r\n\tat ✽.valido \"A New Hope\" y el 4(src/test/resources/feature/HU001_Api.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Recuperar informacion servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El 5 en una base de datos",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsApi.idBase(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido \"Attack of the Clones\" y el 2",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsApi.validoTituloEpisodio(String,int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c400\u003e but was \u003c200\u003e.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat stepdefinitions.StepDefinitionsApi.validoTituloEpisodio(StepDefinitionsApi.java:34)\r\n\tat ✽.valido \"Attack of the Clones\" y el 2(src/test/resources/feature/HU001_Api.feature:5)\r\n",
  "status": "failed"
});
});