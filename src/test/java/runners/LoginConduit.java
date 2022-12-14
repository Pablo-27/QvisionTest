package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        glue = "stepdefinitions",
        features = "src/test/resources/features/loginconduit.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class LoginConduit {
}
