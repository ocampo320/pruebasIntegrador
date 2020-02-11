$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/HU002_ApiCountries.feature");
formatter.feature({
  "name": "Buscar informacion en servicio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Recuperar informacion del servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Buscar el pais correspondiente al \u003ccodLlamada\u003e en el api",
  "keyword": "Given "
});
formatter.step({
  "name": "valido \u003cnombre\u003e y el \u003cdominio\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "codLlamada",
        "nombre",
        "dominio"
      ]
    },
    {
      "cells": [
        "57",
        "\"Colombia\"",
        "\".co\""
      ]
    },
    {
      "cells": [
        "90",
        "\"Turkey\"",
        "\".tr\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Recuperar informacion del servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Buscar el pais correspondiente al 57 en el api",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsCountries.buscarPais(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido \"Colombia\" y el \".co\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsCountries.validar(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e but was \u003c404\u003e.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.sophossolutions.www.stepdefinitions.api.StepDefinitionsCountries.validar(StepDefinitionsCountries.java:34)\r\n\tat ✽.valido \"Colombia\" y el \".co\"(src/test/resources/feature/HU002_ApiCountries.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Recuperar informacion del servicio",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Buscar el pais correspondiente al 90 en el api",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsCountries.buscarPais(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido \"Turkey\" y el \".tr\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsCountries.validar(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e but was \u003c404\u003e.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:244)\r\n\tat com.sophossolutions.www.stepdefinitions.api.StepDefinitionsCountries.validar(StepDefinitionsCountries.java:34)\r\n\tat ✽.valido \"Turkey\" y el \".tr\"(src/test/resources/feature/HU002_ApiCountries.feature:5)\r\n",
  "status": "failed"
});
});