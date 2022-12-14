package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        glue = "stepdefintions",
        features = "src/test/resources/features/createaccountconduit.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CreateAccountConduit {
}
