package com.automation.clases.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/first_test.feature",
    glue = "com.automation.clases.definitions",
    snippets = SnippetType.CAMELCASE)
public class FirstTestRunner {}
