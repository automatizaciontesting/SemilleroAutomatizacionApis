package com.cedaniel200.screenplay.restapi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/rest/create_user.feature"},
        glue = {"com.cedaniel200.screenplay.restapi.stepdefinitions.rest"},
                snippets = CAMELCASE)
public class CreateUser {
}
