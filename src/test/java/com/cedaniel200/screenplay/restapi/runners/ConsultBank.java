package com.cedaniel200.screenplay.restapi.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        features = {"src/test/resources/features/consult_bank.feature"},
        glue = {"com.cedaniel200.screenplay.restapi.stepdefinitions.soap"},
        snippets = CAMELCASE)
public class ConsultBank {
}
