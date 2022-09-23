package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class CreateAccountConduitStepDefinitions {


    @Before()
    public void initialConfig(){
        setTheStage(new OnlineCast());
    }

    @Given("{string} wants to navigate to Conduit page {string}")
    public void wantsToNavigateToConduitPage(String actor, String url) {
        theActor(actor).wasAbleTo(Open.url(url));
    }
    @When("creates an account with username {string} and email {string} and password {string}")
    public void createsAnAccountWithUsernameAndEmailAndPassword(String username, String string2, String string3) {

    }
    @Then("validates the text {string}")
    public void validatesTheText(String string) {

    }


}
