package com.sophossolutions.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.sophossolutions.www.stepdefinitions" }, features = {
        "src/test/resources/features/HU001_CompraDespegar.feature" }, 
        snippets = SnippetType.UNDERSCORE, 
        monochrome = true, 
        dryRun = false, 
        plugin = {"pretty", "html:target/reports/html/", 
                "junit:target/reports/junit/allcukes.xml",
                "json:target/reports/cukes.json" })

public class RunnerDespegar {

}
