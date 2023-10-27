package com.kometsales.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.kometsales.stepsdefinitions",

        features = "src\\test\\resources\\com/kometsales/features/kometviajeespacial.feature",

        snippets = SnippetType.CAMELCASE
)

public class KometsalesRunner {
}
