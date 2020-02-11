$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_CompraDespegar.feature");
formatter.feature({
  "name": "Comprar Vuelo",
  "description": "  Como estudiante de semillero\n  necesito aprender automatizaci�n a traves de ejemplos\n  para automatizar cualquier caso de prueba",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Agregar Vuelo a Compra",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesisto comprar un vuelo",
  "keyword": "Given "
});
