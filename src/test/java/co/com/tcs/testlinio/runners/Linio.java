package co.com.tcs.testlinio.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\linio.feature",
        glue = "co.com.tcs.testlinio.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class Linio {
}
