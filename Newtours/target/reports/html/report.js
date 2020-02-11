$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_RegistroUsuario.feature");
formatter.feature({
  "name": "Registrar usuario",
  "description": "  como usuario quiero registrar un nuevo ususario en Newtours",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Gestionar Ususarios",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Necesito registrar un usuario",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "usuario Fulanito Gomez",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validar usuario registrado",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});